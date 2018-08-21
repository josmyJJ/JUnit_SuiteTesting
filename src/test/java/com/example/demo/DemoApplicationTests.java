package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import static org.junit.Assert.assertEquals;

//@RunWith(SpringRunner.class)

@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestMovie1.class,
        TestMovie2.class,
})

@SpringBootTest
public class DemoApplicationTests {

}

//  @Autowired
//  ActorRepository actorRepository;
//
//  @Test
//  public void testActor(){
//    Actor actor = new Actor();
//    actor.setName("Sandra Bullock");
//    actor.setRealname("Sandra Mae Bullowski");
//
//    Movie movie = new Movie();
//    movie.setTitle("Emoji Movie");
//    movie.setYear(2017);
//    movie.setDescription("About Emojis...");
//
//    Set<Movie> movies = new HashSet<Movie>();
//    movies.add(movie);
//
//    actor.setMovies(movies);
//    actorRepository.save(actor);
//
//    assertEquals(actorRepository.findById(1L).get().getId(), actor.getId());
//  }

//}
