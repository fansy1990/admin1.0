package com.fz.utils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystem;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.hadoop.conf.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HadoopUtils {
	private static Configuration conf;

	private static Map<String, String> confMap = new HashMap<>();
	private static FileSystem fs;
	public static final String hadoop_properties = "util.properties";

	public static final Logger log = LoggerFactory.getLogger(HadoopUtils.class);

	public static Configuration getConf() {
		if (conf == null) {
			init();
			conf = new Configuration();
			conf.setBoolean("mapreduce.app-submission.cross-platform", Boolean
					.parseBoolean(confMap
							.get("mapreduce.app-submission.cross-platform")));// 配置使用跨平台提交任务
			conf.set("fs.defaultFS", confMap.get("fs.defaultFS"));// 指定namenode
			conf.set("mapreduce.framework.name",
					confMap.get("mapreduce.framework.name")); // 指定使用yarn框架
			conf.set("yarn.resourcemanager.address",
					confMap.get("yarn.resourcemanager.address")); // 指定resourcemanager
			conf.set("yarn.resourcemanager.scheduler.address",
					confMap.get("yarn.resourcemanager.scheduler.address"));// 指定资源分配器
			conf.set("mapreduce.jobhistory.address",
					confMap.get("mapreduce.jobhistory.address"));// 指定historyserver
			conf.set("mapreduce.job.jar", JarUtil.jar(JarUtil.class));// 设置jar包路径
		}
		return conf;
	}

	public static FileSystem getFs() {

		return fs;
	}

	/**
	 * 获取hadoop.properties中的值
	 * 
	 * @param property
	 * @return
	 */
	public static String getPropertyValue(String property) {
		if (confMap == null)
			return null;
		return confMap.get(property);
	}

	private static void init() {
		Properties props = new Properties();
		InputStream in = null;
		try {
			in = HadoopUtils.class.getClassLoader().getResourceAsStream(
					hadoop_properties);
			props.load(in);
			Enumeration<?> en = props.propertyNames();
			while (en.hasMoreElements()) {
				String key = (String) en.nextElement();
				// String Property = props.getProperty (key);
				confMap.put(key, props.getProperty(key));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
				log.info("获取Hadoop配置文件失败！");
			}

		}
	}
}
