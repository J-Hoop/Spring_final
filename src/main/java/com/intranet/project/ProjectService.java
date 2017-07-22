package com.intranet.project;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.intranet.emp.EmpDTO;
import com.intranet.util.ListSearch;

@Service
public class ProjectService {
	
	@Inject
	private ProjectDAO projectDAO;
	
	public List<ProjectDTO> projectList() throws Exception{
		
		return projectDAO.projectList();
	}
	
	public int projectInsert(ProjectDTO projectDTO) throws Exception{
		
		return projectDAO.projectInsert(projectDTO);
	}
	
	public List<EmpDTO> projectEmpList(ListSearch listSearch){
		return projectDAO.projectEmpList(listSearch);
	}
	public EmpDTO empSearch(Integer num){
		return projectDAO.empSearch(num);
	}

}
