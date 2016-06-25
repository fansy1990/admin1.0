package com.fz.model;

public class HDFSUsage {

	private String label;
	private float value;

	public HDFSUsage() {
	}

	public HDFSUsage(String label, float value) {
		this.label = label;
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}
}
