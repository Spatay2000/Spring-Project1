package com.sample;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class DBConnect implements Object<Person> {

    private Map<Integer, Person> repository;

    public DBConnect() {
        this.repository = new HashMap<Integer, Person>();
    }

    @Override
    public void store(Person emp) {
        repository.put(emp.getId(), emp);
    }

    @Override
    public Person retrieve(int id) {
        return repository.get(id);
    }

    @Override
    public Person search(String name) {
        Collection<Person> emps = repository.values();
        for (Person emp : emps) {
            if (emp.getName().equalsIgnoreCase(name))
                return emp;
        }
        return null;
    }

    @Override
    public Person delete(int id) {
        Person e = repository.get(id);
        this.repository.remove(id);
        return e;
    }

}


