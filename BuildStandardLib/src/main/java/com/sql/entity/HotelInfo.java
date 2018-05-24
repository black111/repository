package com.sql.entity;

public class HotelInfo {
	private long  id;//酒店id
	private String hotel_code;//酒店代码
	private String hotel_name;//酒店名称
	
	private String phone;//电话
	private String address;//地址
	private double coord_x;
	private double coord_y;
	private String province_code;//省份代码
	private String town_code ;//市代码
	private String area_code;//区域代码
	private String classify_code;//酒店分类代码
	private String star_level;//'酒店级别，0表示无，1表示1星。。。依次类推'
	private String business_code;//商圈代码
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getHotel_code() {
		return hotel_code;
	}
	public void setHotel_code(String hotel_code) {
		this.hotel_code = hotel_code;
	}
	public String getHotel_name() {
		return hotel_name;
	}
	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getCoord_x() {
		return coord_x;
	}
	public void setCoord_x(double coord_x) {
		this.coord_x = coord_x;
	}
	public double getCoord_y() {
		return coord_y;
	}
	public void setCoord_y(double coord_y) {
		this.coord_y = coord_y;
	}
	public String getProvince_code() {
		return province_code;
	}
	public void setProvince_code(String province_code) {
		this.province_code = province_code;
	}
	public String getTown_code() {
		return town_code;
	}
	public void setTown_code(String town_code) {
		this.town_code = town_code;
	}
	public String getArea_code() {
		return area_code;
	}
	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}
	public String getClassify_code() {
		return classify_code;
	}
	public void setClassify_code(String classify_code) {
		this.classify_code = classify_code;
	}
	public String getStar_level() {
		return star_level;
	}
	public void setStar_level(String star_level) {
		this.star_level = star_level;
	}
	public String getBusiness_code() {
		return business_code;
	}
	public void setBusiness_code(String business_code) {
		this.business_code = business_code;
	}
}
