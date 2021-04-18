package net.kubepia.sam.webapp.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class EmployeeController {
  
  @GetMapping("/")
  String index(){
    return "home";
  }
}
