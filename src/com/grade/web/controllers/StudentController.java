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
import com.grade.web.domains.StudentBean;
import com.grade.web.serviceImpls.GradeServiceImpl;
import com.grade.web.serviceImpls.StudentServiceImpl;
import com.grade.web.services.GradeService;
import com.grade.web.services.StudentService;

@WebServlet("/student.do")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		switch(request.getParameter("action")) {
		case "move" :
			request.getRequestDispatcher(String.format(Constants.VIEW_PATH,"student",request.getParameter("dest"))).forward(request, response);
			break;
		case "register" :
			/*
		GradeService service = new GradeServiceImpl();
		String ssn = request.getParameter("ssn");
		String name = request.getParameter("name");
		GradeBean param = new GradeBean();
		service.createGrade(param);
		*/
		request.getRequestDispatcher(String.format(Constants.VIEW_PATH,"student","login")).forward(request, response);
		break;
		case "login" :
		StudentService sService = new StudentServiceImpl();
		String pw = request.getParameter("pw");
		String hakbun = request.getParameter("hakbun");
		StudentBean student = new StudentBean();
		sService.createHakBun(student);
		break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}