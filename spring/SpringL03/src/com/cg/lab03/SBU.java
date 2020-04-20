package com.cg.lab03;

public class SBU {
	 private String subCode;
	   private String subName ;
	   private String subHead ;
	   
	public SBU() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SBU(String subCode, String subName, String subHead) {
		super();
		this.subCode = subCode;
		this.subName = subName;
		this.subHead = subHead;
	}
	@Override
	public String toString() {
		return "[subCode=" + subCode + ", subName=" + subName + ", subHead=" + subHead + "]";
	}
	public String getSubCode() {
		return subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getSubHead() {
		return subHead;
	}
	public void setSubHead(String subHead) {
		this.subHead = subHead;
	}
	   
	   
}
