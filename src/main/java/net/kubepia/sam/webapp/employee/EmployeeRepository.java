package net.kubepia.sam.webapp.employee;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findByLastName(String lastName);
  
    Employee findById(long id);
    
}
