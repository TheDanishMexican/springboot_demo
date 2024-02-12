package kea.exercise.person.controller;

import kea.exercise.person.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {
    @GetMapping("/persons")
 public List<Person> getAllPersons() {
     Person person1 = new Person();
     person1.setId(1);
     person1.setFirstName("Boy");
     person1.setLastName("Loy");
     person1.setDateOfBirth(LocalDate.of(1996, 12, 11));

     Person person2 = new Person();
     person2.setId(2);
     person2.setFirstName("Girl");
     person2.setLastName("Hurl");
     person2.setDateOfBirth(LocalDate.of(1999, 12, 21));


     List<Person> persons = new ArrayList<>();
     persons.add(person1);
     persons.add(person2);

     return persons;
 }
}
