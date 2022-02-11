



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
import org.springframework.web.bind.annotation.RequestParam;
import net.javaguides.springboot.model.Feedback1;
import net.javaguides.springboot.model.OverallFeedback;
import net.javaguides.springboot.service.Feedback1Service;
import net.javaguides.springboot.service.OverallFeedbackService;




@Controller


	public class OverallFeedbackController {

	



	@Autowired
	private OverallFeedbackService overallfeedbackService;
	
 //display list of employees
@GetMapping("/Home2")
	public String viewHomePage(Model model) {
		return findPaginated(1, "id", "asc", model);		
	}
	
	
	
	//ui code for add candidate backnd code
//@GetMapping("/showNewEmployeeForm")
	@GetMapping("/showNewOverallFeedbackForm")
	public String showNewEmployeeForm(Model model) {
		// create model attribute to bind form data
OverallFeedback overallfeedback = new OverallFeedback();
		model.addAttribute("overallfeedback", overallfeedback);
		return "new_overallfeedback";
	}
	
	
//	@Autowired
//	private EmployeeRepository employeeRepository;
//	
//	
//	///SEARCH FORM
//	
//	@GetMapping("/searchform")
//	public ResponseEntity<List<Employee>> getAllEmployees(@RequestParam(required = false) String firstname) {
//		try {
//			List<Employee> employee = new ArrayList<Employee>();
//
//			if (firstname == null)
//				employeeRepository.findAll().forEach(employee::add);
//else
//				employeeRepository.findByNameContaining(firstname).forEach(employee::add);
//
//			if (employee.isEmpty()) {
//				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//			}
//
//			return new ResponseEntity<>(employee, HttpStatus.OK);
//		} catch (Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//	
	

	

	///BACKEND DATA FOR VIEW APPLICATION


@GetMapping("/viewoverallfeedback/{id}")
public String viewPage(@PathVariable ( value = "id") long id, Model model)
{
	model.addAttribute("listApplicants", overallfeedbackService.getEmployeeOverallFeedbackById(id));
	return "view_application3";
	
}
	
		
		
	@PostMapping("/saveoverallfeedback")
	public String saveFeedback(@ModelAttribute("feedback1") OverallFeedback overallfeedback) {
		// save employee to database
	overallfeedbackService.saveOverallFeedback(overallfeedback);
		return "redirect:/Home2";
	}

	
	@GetMapping("/showFormForUpdate3/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
		
		// get employee from the service
		 OverallFeedback overallfeedback= overallfeedbackService.getEmployeeOverallFeedbackById(id);
		
		// set employee as a model attribute to pre-populate the form
		model.addAttribute("overallfeedback", overallfeedback);
		return "update_overallfeedback";
	}
	
	@GetMapping("/deleteEmployeeOverallFeedback1/{id}")
	public String deleteEmployeeFeedback(@PathVariable (value = "id") long id) {
		
		// call delete employee method 
		this.overallfeedbackService.deleteEmployeeOverallFeedbackById(id);
		return "redirect:/Home2";
	}
	
	

	
	
	
	
	
	
	
	
	@GetMapping("/page/{pageNo3}")
	public String findPaginated(@PathVariable (value = "pageNo") int pageNo, 
			@RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir,
			Model model) {
		int pageSize = 5;
		
		Page<OverallFeedback> page = overallfeedbackService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<OverallFeedback> listEmployees = page.getContent();
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
		
		model.addAttribute("listEmployees", listEmployees);
		return "Index3";
	
}
}