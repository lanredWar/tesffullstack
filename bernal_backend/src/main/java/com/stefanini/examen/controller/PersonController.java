package com.stefanini.examen.controller;

import com.stefanini.examen.model.Person;
import com.stefanini.examen.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public List<Person> personList(){
        return personRepository.findAll();
    }
    @PostMapping
    public Person personAdd(@RequestBody Person person){
        return personRepository.save(person);
    }

    @PutMapping("/{id}")
    public Person personUpdate(@PathVariable int id, @RequestBody Person personUpdate) {
        return personRepository.findById(id).map(person -> {
            person.setNombre(personUpdate.getNombre());
            person.setApellido(personUpdate.getApellido());
            person.setFechaNacimiento(personUpdate.getFechaNacimiento());
            person.setPuesto(personUpdate.getPuesto());
            person.setSueldo(personUpdate.getSueldo());
            return personRepository.save(person);
        }).orElseThrow(() -> new RuntimeException("Persona no encontrada"));
    }

    @DeleteMapping("/{id}")
    public void personDelete(@PathVariable int id){
        personRepository.deleteById(id);
    }
}
