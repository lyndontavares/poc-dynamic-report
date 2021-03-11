package com.dak.jasperpoc.domain;

public class ReportColumn {

	private String name;
	private Class<?> type;
	private int width;
	private ColumnAlign align;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Class<?> getType() {
		return type;
	}
	public void setType(Class<?> type) {
		this.type = type;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public ColumnAlign getAlign() {
		return align;
	}
	public void setAlign(ColumnAlign align) {
		this.align = align;
	}
	
	
}
