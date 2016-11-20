package com.prac;

import com.prac.entities.Department;
import com.prac.entities.Product;
import com.prac.repositories.DepartmentRepository;
import com.prac.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DashboardApplication {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private ProductRepository productRepository;

	@RequestMapping("/departments")
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	@RequestMapping("/products/deptId/{deptId}")
	public List<Product> getProductsWithDeptId(@PathVariable Integer deptId) {
		return productRepository.findProductsByDeptId(deptId);
	}

	public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);
	}
}
