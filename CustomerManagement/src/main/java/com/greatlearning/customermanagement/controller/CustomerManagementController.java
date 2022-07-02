package com.greatlearning.customermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.customermanagement.entity.Customer;
import com.greatlearning.customermanagement.service.CustomerService;

@Controller
@RequestMapping("/manage")
public class CustomerManagementController {

	@Autowired
	private CustomerService customerServiceImpl;

	@RequestMapping("/list")
	public String listCustomers(Model model) {
		List<Customer> customers = customerServiceImpl.findAll();

		model.addAttribute("Customers", customers);

		return "list";
	}

	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		Customer customer = new Customer();
		model.addAttribute("Customer", customer);

		return "form";
	}

	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("id") int id, Model model) {
		Customer customer = customerServiceImpl.findById(id);
		model.addAttribute("Customer", customer);

		return "form";
	}

	@PostMapping("/save")
	public String save(@RequestParam("id") int id, @RequestParam("firstname") String firstName,
			@RequestParam("lastname") String lastName, @RequestParam("email") String email) {

		Customer customer = customerServiceImpl.findById(id);
		
		if (customer != null) {
			customer.setEmail(email);
			customer.setFirstName(firstName);
			customer.setLastName(lastName);
		}
		else
			customer = new Customer(firstName, lastName, email);
		
		customerServiceImpl.save(customer);
		
		
		return "redirect:/manage/list";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		customerServiceImpl.deleteById(id);
		
		return "redirect:/manage/list";
	}

}
