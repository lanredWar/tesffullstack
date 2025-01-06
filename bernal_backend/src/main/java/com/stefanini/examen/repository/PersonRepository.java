package com.stefanini.examen.repository;

import com.stefanini.examen.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
