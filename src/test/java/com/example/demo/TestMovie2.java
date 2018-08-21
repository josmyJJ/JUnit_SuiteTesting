package com.example.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class TestMovie2 {
  @Autowired
  ActorRepository actorRepository;
  @Test
  public void testActor1() {
    Actor actor = new Actor();
    actor.setName("David Bullock");
    actor.setRealname("David Mae Bullowski");

//    Movie movie = new Movie();
//    movie.setTitle("Some Movie");
//    movie.setYear(2019);
//    movie.setDescription("About some movie...");
//
//    Set<Movie> movies = new HashSet<Movie>();
//    movies.add(movie);
//
//    actor.setMovies(movies);
    actorRepository.save(actor);

    assertEquals(actorRepository.findById(1L).get().getId(), actor.getId());
  }
}
