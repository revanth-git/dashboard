package com.prac.repositories;

import com.prac.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by revan on 11/19/2016.
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
