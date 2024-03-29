package com.grade.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.web.pool.Constants;
import com.grade.web.domains.GradeBean;
import com.grade.web.serviceImpls.GradeServiceImpl;
import com.grade.web.services.GradeService;

@WebServlet("/grade.do")
public class GradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher(String.format(Constants.VIEW_PATH,"student",request.getParameter("dest"))).forward(request, response);
		switch(request.getParameter("action")) {
		case "join" :
		GradeService service = new GradeServiceImpl();
		String ssn = request.getParameter("ssn");
		String name = request.getParameter("name");
		String kor = request.getParameter("kor");
		String eng = request.getParameter("eng");
		String mat = request.getParameter("mat");
		String soc = request.getParameter("soc");
		GradeBean param = new GradeBean();
		param.setKor(kor);
		param.setEng(eng);
		param.setMat(mat);
		param.setSoc(soc);
		service.createGrade(param);
		case "login" :
		service = new GradeServiceImpl();
		name = request.getParameter("name");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
