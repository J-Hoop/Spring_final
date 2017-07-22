package com.choa.test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.intranet.emp.EmpDTO;
import com.intranet.project.ProjectDAO;
import com.intranet.project.ProjectDTO;

public class SqlSessionTest extends MyAbstract{

	@Inject
	private ProjectDAO projectDAO;
	
	@Test
	public void test() throws Exception{
		
		/*List<ProjectDTO> ar = projectDAO.projectList();*/
		
	}

}
