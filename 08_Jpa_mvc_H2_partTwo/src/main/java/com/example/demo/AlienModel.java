package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AlienModel 
{	@Id
	private int aid;
	private String aname;
	private String atech;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAtech() {
		return atech;
	}
	public void setAtech(String atech) {
		this.atech = atech;
	}
	@Override
	public String toString() {
		return "AlienModel [aid=" + aid + ", aname=" + aname + ", atech=" + atech + "]";
	}
	
	

}
