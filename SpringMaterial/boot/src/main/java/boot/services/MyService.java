package boot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boot.models.Employee;

@Service
public class MyService 
{
	@Autowired
    EmployeeService service;
    
	public List<Employee> getDetails() 
	{
	  return service.getDetails();
	}

	public Employee getDetailsById(int id) {
		return service.getDetailsById(id);
	}
	

}
