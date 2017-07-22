package com.intranet.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.intranet.emp.EmpDTO;
import com.intranet.project.ProjectDTO;
import com.intranet.project.ProjectService;
import com.intranet.util.ListSearch;

@Controller
@RequestMapping(value="/project/**")
public class ProjectController {
	
	@Inject
	private ProjectService projectService;
	
	@RequestMapping(value="projectList", method=RequestMethod.GET)
	public String projectList(Model model) throws Exception{
		
		
		List<ProjectDTO> ar = projectService.projectList();
		
		model.addAttribute("projectList", ar);
		return "/project/projectList";
	}
	
	@RequestMapping(value="projectInsert", method=RequestMethod.GET)
	public String projectInsert() throws Exception{
		
		
		return "/project/projectInsert";
	}
	
	@RequestMapping(value="projectInsert", method=RequestMethod.POST)
	public String projectInsert(ProjectDTO projectDTO, RedirectAttributes rd) throws Exception {
		
		
		int result = projectService.projectInsert(projectDTO);
		
		return "redirect:projectList";
	}
	
	@RequestMapping(value="projectEmpList")
	public void projectEmpList(Model model, ListSearch listSearch){
		if(listSearch.getSearch()==null){
			listSearch.setSearch("");
		}
		List<EmpDTO> ar = projectService.projectEmpList(listSearch);
		model.addAttribute("list", ar);
	}
		
		
	
}
		
		
		
		
