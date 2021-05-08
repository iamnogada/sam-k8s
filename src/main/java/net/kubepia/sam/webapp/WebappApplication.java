package net.kubepia.sam.webapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


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
	@GetMapping("/liveness")
	public String liveness() {
		log.info("liveness check");
		return "OK";
	}
	@GetMapping("/readiness")
	public String readyness() {
		log.info("readiness check");
		return "OK";
	}

	// @Autowired
  // EmployeeRepository employeeRepository;

	// @Override
	// public void run(String... args) {
	// 	Iterable<Employee> list = employeeRepository.findAll();
	// 	log.info("length");
	// }

}
