package com.klef.jfsd.springboot.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientDemo {
	
	// collection
	
	List<Customer> customers = new ArrayList<Customer>();
	
	
	
	
	@RequestMapping(path="/",method = RequestMethod.GET)
	
	public String demo()
	{
		return "<h2>Spring Boot Series</h2>";
	}
	@GetMapping(path="/demo1")
	public String demo1() 
	{
		return "Y22 Jfsd";
	}
	@GetMapping("demo2")
	public int demo2()
	{
		return 4621;
	}
	@GetMapping("demo3")
	public String demo3(@RequestParam("id") int eid)
	{
		return "ID="+eid;
	}
	@GetMapping("demo4")
	public String demo4(@RequestParam("i") int  x,@RequestParam("j") int y)
	{
		int z=x+y;
		return Integer.toString(z);
	}
	@GetMapping("demo5")
	public String demo5(@RequestParam("fname") String x,@RequestParam ("lname") String y)
	{
		return x.toUpperCase()+" "+y.toUpperCase();
	}
	@GetMapping("demo6/{id}")
	public String demo6(@PathVariable("id") int eid)
	{
		return "ID="+eid;
	}
	@GetMapping("demo7/{fname}/{lname}")
	public String demo7(@PathVariable("fname") String x,@PathVariable("lname") String y)
	{
		return x+" "+y;
	}
	
	//add customer 

	@PostMapping("addcustomer")
	public String addcustomer(Customer customer)
	{
		customers.add(customer);
		return "Customer is added";
	}
	
	//view all costumer
	
	@GetMapping("viewallcustomers")
	public List<Customer> viewallcustomers() {
		return customers;
	}
	

}



