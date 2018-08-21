package com.example.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class TestMovie1 {

  @Autowired
  ActorRepository actorRepository;

  @Test
  public void testActor() {
    Actor actor = new Actor();
    actor.setName("Sandra Bullock");
    actor.setRealname("Sandra Mae Bullowski");

//    Movie movie = new Movie();
//    movie.setTitle("Emoji Movie");
//    movie.setYear(2017);
//    movie.setDescription("About Emojis...");

//    Set<Movie> movies = new HashSet<Movie>();
//    movies.add(movie);

//    actor.setMovies(movies);
    actorRepository.save(actor);
    assertEquals(actorRepository.findById(1L).get().getId(), actor.getId());
  }
}
