package com.grade.web.daoImpls;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.apache.jasper.tagplugins.jstl.core.Param;

import com.grade.web.daos.GradeDAO;
import com.grade.web.domains.GradeBean;

public class GradeDAOImpl implements GradeDAO{
	public static final String FILE_PATH = String.format("c:%sUsers%suser%seclipse-jee%sjee-grade%sWebContent%sresources%stxt%s",
											File.separator,
											File.separator,
											File.separator,
											File.separator,
											File.separator,
											File.separator,
											File.separator,
											File.separator);

	@Override
	public void insertGrade(GradeBean param) {
		try {
			File file = new File(FILE_PATH+"grade.txt");
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(String.format("%s, %s, %s, %s, %s, %s, %s", param.getKor(), param.getEng(), param.getMat(), param.getSoc()));
			writer.newLine();
			writer.flush();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
