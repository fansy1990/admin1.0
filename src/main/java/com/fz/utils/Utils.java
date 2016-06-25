package com.fz.utils;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utils {
	private static final Logger log = LoggerFactory.getLogger(Utils.class);
	private static PrintWriter writer = null;

	/**
	 * 向PrintWriter中输入数据
	 * 
	 * @param info
	 */
	public static void write2PrintWriter(String info) {
		log.info("json:{}", info);
		try {
			ServletActionContext.getResponse().setCharacterEncoding("UTF-8");
			writer = ServletActionContext.getResponse().getWriter();

			writer.write(info);// 响应输出
			// 释放资源，关闭流
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * HTML5 支持 服务器发送事件
	 * 
	 * @param info
	 */
	public static void write2PrintWriter5(String info) {
		log.info("data:{}", info);
		OutputStream outputStream = null;
		try {

			HttpServletResponse response = ServletActionContext.getResponse();
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/event-stream");
			outputStream = new BufferedOutputStream(response.getOutputStream());

			outputStream.write(("data:" + info + "\n\n").getBytes());// 响应输出
			// 释放资源，关闭流
			outputStream.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				outputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 返回num个小数后的float类型
	 * 
	 * @param num
	 * @param value
	 * @return
	 */
	public static float getNumDecimal(int num, float value) {
		return (float) (Math.round(value * (10 ^ num))) / (10 ^ num);
	}

}
