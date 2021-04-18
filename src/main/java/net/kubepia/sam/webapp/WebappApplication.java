package net.kubepia.sam.webapp;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kubepia.sam.webapp.employee.Employee;
import net.kubepia.sam.webapp.employee.EmployeeRepository;


@SpringBootApplication
@RestController
public class WebappApplication {

	private static final Logger log = LoggerFactory.getLogger(WebappApplication.class);



	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		log.info("hello");
		return "Employee API Home";
	}

	// @Autowired
  // EmployeeRepository employeeRepository;

	// @Override
	// public void run(String... args) {
	// 	Iterable<Employee> list = employeeRepository.findAll();
	// 	log.info("length");
	// }

}
