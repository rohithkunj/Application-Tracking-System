
package net.javaguides.springboot.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.javaguides.springboot.service.ScheduleInterviewService;

import net.javaguides.springboot.model.ScheduleInterview;


@Controller
public class ScheduleInterviewController {

	@Autowired
	private ScheduleInterviewService scheduleinterviewService;

	// link of scheduleinterview function  in view application
	@GetMapping("/showNewScheduleInterviewForm")
	public String showNewScheduleInterviewForm(Model model) {
		// create model attribute to bind form data
		ScheduleInterview scheduleinterview = new ScheduleInterview();
		model.addAttribute("scheduleinterview", scheduleinterview);
		return "schedule_interview1";
	}

	
	@PostMapping("/saveScheduleInterview")
	public String saveScheduleInterview(@ModelAttribute("scheduleinterview") ScheduleInterview scheduleinterview) {
		// save employee to database
		scheduleinterviewService.saveScheduleInterview(scheduleinterview);
		return "redirect:/view";
	}
	
//
	//display list of employees
	@GetMapping("/view")
	public String viewScheduleInterviewPage(Model model) {
		return findPaginated1(1, "employeename", "asc", model);			
	}
	

@GetMapping("/viewschedule/{id}")
public String viewPage(@PathVariable ( value = "id") long id, Model model)
{
	model.addAttribute("listInterviews", scheduleinterviewService.getInterviewDetailsById(id));
	return "view_schedule";
	
}
//public String message() {
//	return "Scheduled Interview Saved!!";
//}
//


@GetMapping("/pageno2/{pageNo}")
public String findPaginated1(@PathVariable (value = "pageNo") int pageNo, 
		@RequestParam("sortField") String sortField,
		@RequestParam("sortDir") String sortDir,
		Model model) {
	int pageSize = 5;
	
	Page<ScheduleInterview> page =scheduleinterviewService.findPaginated(pageNo, pageSize, sortField, sortDir);
	List<ScheduleInterview> listInterviews = page.getContent();
	
	model.addAttribute("currentPage", pageNo);
	model.addAttribute("totalPages", page.getTotalPages());
	model.addAttribute("totalItems", page.getTotalElements());
	
	model.addAttribute("sortField", sortField);
	model.addAttribute("sortDir", sortDir);
	model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
	
	model.addAttribute("listInterviews", listInterviews);
	return "view_schedule";
}

}
//