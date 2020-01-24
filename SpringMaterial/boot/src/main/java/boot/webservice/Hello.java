package boot.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import boot.models.Employee;
import boot.services.MyService;

@RestController
public class Hello 
{
	@Autowired
	MyService service;
	
	@RequestMapping(value="/show-details-by-id{id}",produces="application/json")
	public Employee  showDetailsById(@RequestParam("id") int id)
	{
		System.out.println("method");
		return  service.getDetailsById(id);
	}
	
	
	@RequestMapping(value="/show-details",produces="application/json")
	public List<Employee> showDetails()
	{
		return service.getDetails();
	}
	
	
}


// controller + response-body = rest-controller