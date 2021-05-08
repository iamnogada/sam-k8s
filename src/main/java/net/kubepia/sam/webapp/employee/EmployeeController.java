package net.kubepia.sam.webapp.employee;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/employees")
public class EmployeeController {
    
  @Autowired
  EmployeeRepository employeeRepository;

  @GetMapping("")
  public @ResponseBody Iterable<Employee> getAllEmployees(){
    
    return this.employeeRepository.findAll();
  }
  

  @GetMapping("/{id}")
  public @ResponseBody Optional<Employee> getEmployee(@PathVariable Long id){
    return this.employeeRepository.findById(id);
  }
}
