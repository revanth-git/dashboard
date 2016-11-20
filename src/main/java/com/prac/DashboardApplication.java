package com.prac;

import com.prac.entities.Department;
import com.prac.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DashboardApplication {

	@Autowired
	private DepartmentRepository repo;

	@RequestMapping("/departments")
	public List<Department> getAllDepartments() {
		return repo.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);
	}
}
