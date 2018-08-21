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
public class TestMovie1 {

  @Autowired
  ActorRepository actorRepository;

  @Test
  public void testActor() {
    Actor actor = new Actor();
    actor.setName("Sandra Bullock");
    actor.setRealname("Sandra Mae Bullowski");

    Movie movie = new Movie();
    movie.setTitle("Emoji Movie");
    movie.setYear(2017);
    movie.setDescription("About Emojis...");

    Set<Movie> movies = new HashSet<Movie>();
    movies.add(movie);

    actor.setMovies(movies);
    actorRepository.save(actor);
    assertEquals(actorRepository.findById(1L).get().getId(), actor.getId());

//    assertEquals(actor.getName(), "Sandra Bullock");
  }
}
