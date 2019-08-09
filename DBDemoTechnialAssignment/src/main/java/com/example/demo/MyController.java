package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController 
{
	@Autowired
	TechnicalSupportDAO dao;
	@Autowired
	CustomerRegistrationDAO cdao;
	@Autowired
	private HttpServletRequest req;
	@RequestMapping("/")
	public String RegisterCompliant()
	{
		return "Register.jsp";
	}
    
	@RequestMapping("/register")
	public String insertComplaint(SUPP_REQUESTS supp_requests)
	{
		dao.save(supp_requests);
		return "CustomerRegistration.jsp";
	}
	@RequestMapping("/CustomerRegistration")
	public String insertCustomer(CUSTOMERS customers)
	{
		
		cdao.save(customers);
		//HttpServletRequest req = null;
		String FirstName = req.getParameter("firstName");
		String LastName = req.getParameter("lastName");
		
		HttpSession session = req.getSession();
    	session.setAttribute("FirstName", FirstName);
    	session.setAttribute("LastName", LastName);

		return "Acknowledgement.jsp";
	}
}
