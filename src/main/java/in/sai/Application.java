package in.sai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sai.entity.Employee2;
import in.sai.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
	 ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	 
	 EmployeeRepository repo = context.getBean(EmployeeRepository.class);
	 
	 
	 Employee2 emp =new Employee2();
	// emp.setEmpId(102);
	 emp.setEmpName("Raja");
	 emp.setEmpGender("male");
	 emp.setEmpSalary(800050.00);
	 emp.setDept("Manager");
	 
	 
	 repo.save(emp);
	 System.out.println("Record Saved............");
	}

}
