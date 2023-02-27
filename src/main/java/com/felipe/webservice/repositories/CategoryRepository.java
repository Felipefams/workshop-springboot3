package com.felipe.webservice.repositories;

import com.felipe.webservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
