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
public class TestMovie2 {

  @Autowired
  ActorRepository actorRepository;
  @Test
  public void testActor1() {
    Actor actor1 = new Actor();
    actor1.setName("David Bullock");
    actor1.setRealname("David Mae Bullowski");

    Movie movie1 = new Movie();
    movie1.setTitle("Some Movie");
    movie1.setYear(2019);
    movie1.setDescription("About some movie...");

    Set<Movie> movies1 = new HashSet<Movie>();
    movies1.add(movie1);

    actor1.setMovies(movies1);
    actorRepository.save(actor1);

    assertEquals(actorRepository.findById(2L).get().getId(), actor1.getId());
//    assertEquals(actor1.getRealname(),  "David Mae Bullowski");
  }
}
