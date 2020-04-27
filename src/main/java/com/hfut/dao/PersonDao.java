package com.hfut.dao;

import com.hfut.entity.Person;

public interface PersonDao {
    public Person querypersonbyid(int id);
    public void insertperson(Person person);

}
