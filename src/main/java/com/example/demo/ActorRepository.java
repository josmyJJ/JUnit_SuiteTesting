package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor, Long> {
  Actor findByName(String name);
  Actor findAllById(Long id);
}
