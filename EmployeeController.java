
	
	package net.javaguides.springboot.controller;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.javaguides.springboot.model.Employee;
//import net.javaguides.springboot.repository.EmployeeRepository;
import net.javaguides.springboot.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// display list of employees
	@GetMapping("/listofapplicants")
	public String viewHomePage(Model model) {
		return findPaginated(1, "candidatename", "asc", model);
	}
	
	@GetMapping("/jobslist")
    public String jobslist(){
        return "jobs_list";
    }
	
	
	@GetMapping("/dashboard")
    public String dashboard(){
        return "Dashboard";
    }
	
	@GetMapping("/addfeedback")
    public String home(){
        return "addFeedback";
    }
	
	
	

	// ui code for add candidate backnd code
	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployeeForm(Model model) {
		// create model attribute to bind form data
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "new_employee";
	}


	@RequestMapping(path = { "/", "/search" })
	public String home(Employee employee, Model model, String keyword) {
		if (keyword != null) {
			List<Employee> listEmployees = employeeService.getByKeyword(keyword);
			model.addAttribute("listEmployees", listEmployees);
		} else {
			List<Employee> list = employeeService.getAllEmployees();
			model.addAttribute("list", list);
		}
		return "index";
	}
	
	/// BACKEND DATA FOR VIEW APPLICATION

	@GetMapping("/viewapplication/{id}")
	public String viewPage(@PathVariable(value = "id") long id, Model model) {
		model.addAttribute("listApplicants", employeeService.getEmployeeById(id));
		return "view_application";

	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		// save employee to database
		employeeService.saveEmployee(employee);
		return "redirect:/listofapplicants";
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

		// get employee from the service
		Employee employee = employeeService.getEmployeeById(id);

		// set employee as a model attribute to pre-populate the form
		model.addAttribute("employee", employee);
		return "update_employee";
	}

	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable(value = "id") long id) {

		// call delete employee method
		this.employeeService.deleteEmployeeById(id);
		return "redirect:/listofapplicants";
	}

	@GetMapping("/page1/{pageNo}")
	public String findPaginated(@PathVariable (value = "pageNo") int pageNo, 
			@RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir,
			Model model) {
		int pageSize = 5;
		
		Page<Employee> page = employeeService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Employee> listEmployees = page.getContent();
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
		
		model.addAttribute("listEmployees", listEmployees);
		return "index";
	}
}
