package com.example.leoq1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.leoq1.model.Person;
import com.example.leoq1.repository.PersonRepo;

@Service
public class PersonService {
    
    @Autowired
    public PersonRepo personRepo;

    public List<Person> getByFirstName(String prefix){
        return personRepo.getByFirstName(prefix);
    }

    public List<Person> getByLastName(String suffix){
        return personRepo.getByLastName(suffix);
    }

    public Person postData(Person p) {
        return personRepo.save(p);  
    }

}
