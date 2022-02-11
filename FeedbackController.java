package net.javaguides.springboot.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.Feedback;
import net.javaguides.springboot.service.FeedbackService;



@Controller
public class FeedbackController {



	@Autowired
	private FeedbackService feedbackService;
	
 //display list of employees
@GetMapping("/Home")
	public String viewHomePage(Model model) {
		return findPaginated(1, "id", "asc", model);		
	}
	
	
	
	//ui code for add candidate backnd code
//@GetMapping("/showNewEmployeeForm")
	@GetMapping("/showNewFeedbackForm")
	public String showNewFeedbackForm(Model model) {
		// create model attribute to bind form data
	Feedback feedback = new Feedback();
		model.addAttribute("feedback", feedback);
		return "new_feedback";
	}
	
	
	///BACKEND DATA FOR VIEW APPLICATION


@GetMapping("/viewfeedback/{id}")
public String viewPage(@PathVariable ( value = "id") long id, Model model)
{
	model.addAttribute("listApplicants", feedbackService.getEmployeeFeedbackById(id));
	return "view_application1";
	
}
	
		
		
	@PostMapping("/saveFeedback")
	public String saveFeedback(@ModelAttribute("feedback") Feedback feedback) {
		// save employee to database
	feedbackService.saveFeedback(feedback);
		return "redirect:/Home";
	}

	
	@GetMapping("/showFormForUpdate1/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
		
		// get employee from the service
		 Feedback feedback = feedbackService.getEmployeeFeedbackById(id);
		
		// set employee as a model attribute to pre-populate the form
		model.addAttribute("feedback", feedback);
		return "update_feedback";
	}
	
	@GetMapping("/deleteEmployeeFeedback/{id}")
	public String deleteEmployeeFeedback(@PathVariable (value = "id") long id) {
		
		// call delete employee method 
		this.feedbackService.deleteEmployeeFeedbackById(id);
		return "redirect:/Home";
	}
	
	

	
	
	
	
	
	
	
	
	@GetMapping("///page/{pageNo}")
	public String findPaginated(@PathVariable (value = "pageNo") int pageNo, 
			@RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir,
			Model model) {
		int pageSize = 5;
		
		Page<Feedback> page = feedbackService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Feedback> listEmployees = page.getContent();
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
		
		model.addAttribute("listEmployees", listEmployees);
		return "Index1";
	
}
}