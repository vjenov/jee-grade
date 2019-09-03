package com.grade.web.services;

import com.grade.web.domains.GradeBean;

public interface GradeService {
	public void createGrade(GradeBean param);
	public String createHakBun(GradeBean param);
	public boolean exist(String ranNum);
	public int getAverage(GradeBean param);
	public int getTotal(GradeBean param);
}
