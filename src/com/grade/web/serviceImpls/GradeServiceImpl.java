package com.grade.web.serviceImpls;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.grade.web.daoImpls.GradeDAOImpl;
import com.grade.web.daos.GradeDAO;
import com.grade.web.domains.GradeBean;
import com.grade.web.services.GradeService;

public class GradeServiceImpl implements GradeService{
	private GradeDAO dao;
	private GradeBean grade;
	private GradeBean[] grades;
	public GradeServiceImpl() {
		dao = new GradeDAOImpl();
	}
	
	public void createGrade(GradeBean param) {
		int gradeCount = 0;
		param.setHakbun(createHakBun(param));
		param.setName(param.getName());
		param.setKor(param.getKor());
		param.setEng(param.getEng());
		param.setMat(param.getMat());
		param.setSoc(param.getSoc());
		param.setSsn(param.getSsn());
		param.setTotal(getTotal(param));
		param.setAvr(getAverage(param));
		grades[gradeCount] = param;
		dao.insertGrade(param);
	}
	public String createHakBun(GradeBean param) {
		String ranNum = "";
		String year = new SimpleDateFormat("yyyy-").format(new Date());
		String sex = param.getSsn().substring(7,8);
		String result = "";
		for(int i = 0; i < 3; i++) {
			ranNum += String.valueOf((int) (Math.random() * 10));
		}
		for(int i = 0; i < grades.length; i++)
			if(grades.length != 0 && !exist(ranNum)) {
				 result = year + sex + ranNum;
		}
		
		return result;
	}
	
	public boolean exist(String ranNum) {
		boolean flag = false;
		for(int i =0; i < grades.length; i++) {
			if(ranNum.equals(grades[i].getHakbun().substring(6,9))) {
				flag = true;
			}
		}
		return flag;
	}
	
	public int getAverage(GradeBean param) {
		grade = new GradeBean();
		int avr = ((Integer.parseInt(grade.getKor()) + Integer.parseInt(grade.getEng()) + Integer.parseInt(grade.getMat()) + Integer.parseInt(grade.getSoc())))/4;
		return avr;
	}
	
	public int getTotal(GradeBean param) {
		grade = new GradeBean();
		int total = ((Integer.parseInt(grade.getKor()) + Integer.parseInt(grade.getEng()) + Integer.parseInt(grade.getMat()) + Integer.parseInt(grade.getSoc())));
		return total;
	}
}
