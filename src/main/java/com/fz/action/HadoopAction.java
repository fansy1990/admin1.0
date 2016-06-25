package com.fz.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSON;
import com.fz.model.HDFSUsage;
import com.fz.utils.Utils;
import com.opensymphony.xwork2.ActionSupport;

@Resource
public class HadoopAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	public void getHdfsDashBoard() {

		List<HDFSUsage> list = new ArrayList<>();
		list.add(new HDFSUsage("DFS Remaining (GB)", 14.19f));
		list.add(new HDFSUsage("Non DFS Used (GB)", 2.71f));
		list.add(new HDFSUsage("DFS Used (GB)", Utils.getNumDecimal(2,
				218.59f / 1024)));

		Utils.write2PrintWriter(JSON.toJSONString(list));
	}
}
