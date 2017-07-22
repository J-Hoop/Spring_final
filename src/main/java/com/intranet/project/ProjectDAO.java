package com.intranet.project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.intranet.emp.EmpDTO;
import com.intranet.util.ListSearch;

@Repository
public class ProjectDAO {
	@Inject
	private SqlSession sqlSession;
	private String NAMESPACE="ProjectMapper.";
	
	public List<ProjectDTO> projectList() throws Exception {
		
		return  sqlSession.selectList(NAMESPACE+"projectList");
	}
	
	public int projectInsert(ProjectDTO projectDTO) throws Exception {
		
		int result = sqlSession.insert(NAMESPACE+"insert", projectDTO);
		
		
		
		EmpDTO empDTO = new EmpDTO();
		for(int i=0; i<projectDTO.getEmp_num().length; i++) {
			
			empDTO.setP_num((Integer)sqlSession.selectOne(NAMESPACE+"projectListup"));
			empDTO.setEmp_num(projectDTO.getEmp_num()[i]);
			result=sqlSession.update(NAMESPACE+"update", empDTO);
		}

			
		
		return result;
	}
	
	public List<EmpDTO> projectEmpList(ListSearch listSearch){
		return sqlSession.selectList(NAMESPACE+"list", listSearch);
	}
	public EmpDTO empSearch(Integer num){
		return sqlSession.selectOne(NAMESPACE+"search", num);	
	}
			
			
		
		
		
		

}
