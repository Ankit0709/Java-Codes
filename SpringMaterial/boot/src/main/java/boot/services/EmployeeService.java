package boot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import boot.models.Employee;

@Service
public class EmployeeService 
{
	private static List<Employee> list=new ArrayList<Employee>();
	
	static
	{
		list.add(new Employee(1,"Raman","delhi"));
		list.add(new Employee(2,"Radha","noida"));
		list.add(new Employee(3,"Geeta","up"));
		list.add(new Employee(4,"Seeta","mp"));
	}
	
	static List<Employee> getDetails()
	{
		return list;
	}
	
	static Employee getDetailsById(int id)
	{
		for(Employee e:list)
		{
			if(e.getId()==id)
			{
				return e;
			}
		}
		return new Employee(0,"","");
	}

}
