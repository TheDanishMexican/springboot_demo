package kea.exercise.person.controller;

import kea.exercise.person.model.Person;
import kea.exercise.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/persons")
    public List<Person> getAllPersons() {

    List<Person> persons = personRepository.findAll();

     return persons;
 }

    @GetMapping("/persons/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable int id) {
        Optional<Person> person = personRepository.findById(id);

        return ResponseEntity.of(person);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/persons")
    public Person createPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }


}
