package com.activity.munchmonkeys.repository;

import com.activity.munchmonkeys.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
