package com.prac.repositories;

import com.prac.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by revan on 11/19/2016.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findProductsByDeptId(Integer deptId);

}
