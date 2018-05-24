package com.sql.entity;

public class HotelArea {
	private long id;
	private String area_code;
	private String area_parent_code;
	private String area_name;
	private String area_level;
	private String phone_code;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getArea_code() {
		return area_code;
	}
	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}
	public String getArea_parent_code() {
		return area_parent_code;
	}
	public void setArea_parent_code(String area_parent_code) {
		this.area_parent_code = area_parent_code;
	}
	public String getArea_name() {
		return area_name;
	}
	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}
	public String getArea_level() {
		return area_level;
	}
	public void setArea_level(String area_level) {
		this.area_level = area_level;
	}
	public String getPhone_code() {
		return phone_code;
	}
	public void setPhone_code(String phone_code) {
		this.phone_code = phone_code;
	}
	
}
