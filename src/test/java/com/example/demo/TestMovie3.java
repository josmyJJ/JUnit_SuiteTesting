package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
public class TestMovie3 {

  @Autowired
  ActorRepository actorRepository;

  @Test
  public void findAllActors() {
    Actor actor2 = new Actor();
    actor2.setName("David Bullock");
    actor2.setRealname("David Mae Bullowski");

    Movie movie2 = new Movie();
    movie2.setTitle("Some Movie");
    movie2.setYear(2019);
    movie2.setDescription("About some movie...");

    Set<Movie> movies2 = new HashSet<Movie>();
    movies2.add(movie2);

    actor2.setMovies(movies2);
    actorRepository.save(actor2);

    assertEquals(actorRepository.findAllById(3L).getId(), actor2.getId());
  }
}
