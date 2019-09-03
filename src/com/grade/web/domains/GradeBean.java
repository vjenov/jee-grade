package com.grade.web.domains;

import java.io.Serializable;

public class GradeBean implements Serializable{
	private static final long serialVersionHD = 1L;
	private String hakbun, ssn, name, kor, eng, mat, soc;
	private int total, avr;
	
	public String getHakbun() {
		return hakbun;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAvr() {
		return avr;
	}
	public void setAvr(int avr) {
		this.avr = avr;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKor() {
		return kor;
	}
	public void setKor(String kor) {
		this.kor = kor;
	}
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	public String getSoc() {
		return soc;
	}
	public void setSoc(String soc) {
		this.soc = soc;
	}
	
}
