package com.LiMing.entity;

public class article_more {
	private int id ;
	private String neirong;
	private String name;
	private String time;
	private int zixun_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNeirong() {
		return neirong;
	}
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getZixun_id() {
		return zixun_id;
	}
	public void setZixun_id(int zixun_id) {
		this.zixun_id = zixun_id;
	}
	public article_more(int id, String neirong, String name, String time,
			int zixun_id) {
		super();
		this.id = id;
		this.neirong = neirong;
		this.name = name;
		this.time = time;
		this.zixun_id = zixun_id;
	}
	public article_more() {
		
	}
	@Override
	public String toString() {
		return "article_more [id=" + id + ", neirong=" + neirong + ", name="
				+ name + ", time=" + time + ", zixun_id=" + zixun_id + "]";
	}
	
	
}
