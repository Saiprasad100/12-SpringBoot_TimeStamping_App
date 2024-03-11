package in.sai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sai.entity.Employee2;

public interface EmployeeRepository extends JpaRepository<Employee2, Integer>{

}
