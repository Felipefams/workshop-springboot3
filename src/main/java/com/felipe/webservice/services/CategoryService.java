package com.felipe.webservice.services;

import com.felipe.webservice.entities.Category;
import com.felipe.webservice.entities.User;
import com.felipe.webservice.repositories.CategoryRepository;
import com.felipe.webservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }
    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
