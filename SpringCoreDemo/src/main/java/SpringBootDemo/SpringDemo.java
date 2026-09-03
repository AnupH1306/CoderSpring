package SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "SpringBootDemo")
public class SpringDemo {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDemo.class, args);
	}
	

}
