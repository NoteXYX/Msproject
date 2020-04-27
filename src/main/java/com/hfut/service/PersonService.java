package com.hfut.service;

import com.hfut.dao.PersonDao;
import com.hfut.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonDao personDao;
    public Person querypersonbyid(int id) {
        return personDao.querypersonbyid(id);
    }
    public void insertperson(Person person) {
        personDao.insertperson(person);
    }
}
