package de.sschleis.demo.springdemo.adapter.ghibli;

import de.sschleis.demo.springdemo.adapter.ghibli.api.Film;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * The GhibliAdapter interface is responsible for defining the methods that can be used to interact with the Studio Ghibli API.
 * It uses Feign to make HTTP requests to the API and retrieve information about films.
 * <a href="https://ghibliapi.vercel.app">API</a>
 */

@FeignClient(name = "StudioGhibli", url = "https://ghibliapi.vercel.app")
public interface GhibliAdapter {

    @GetMapping("/films")
    List<Film> getFilms();

    @GetMapping("/films/{id}")
    Film getFilmById(@PathVariable("id") String id);
}
