package com.grade.web.serviceImpls;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ranNum = "";
		String year = new SimpleDateFormat("yyyy-").format(new Date());
		String sex = "1";
		String result = "";
		for(int i = 0; i < 3; i++) {
			ranNum += String.valueOf((int) (Math.random() * 10));
		}
		
		System.out.println(year + sex + ranNum);
	}

}
