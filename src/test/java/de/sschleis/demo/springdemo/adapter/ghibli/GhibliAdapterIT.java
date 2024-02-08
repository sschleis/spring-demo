package de.sschleis.demo.springdemo.adapter.ghibli;

import de.sschleis.demo.springdemo.TCTest;
import de.sschleis.demo.springdemo.adapter.ghibli.api.Film;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GhibliAdapterIT extends TCTest {

    @Autowired
    private GhibliAdapter underTest;

    @Test
    public void getFilms() {
        List<Film> results = underTest.getFilms();

        assertAll(
                () -> assertNotNull(results),
                () -> assertTrue(results.size() > 1)
        );
    }

    @Test
    public void getFilmById() {
        Film film = underTest.getFilmById("0440483e-ca0e-4120-8c50-4c8cd9b965d6");

        assertAll(
                () -> assertNotNull(film),
                () -> assertEquals("0440483e-ca0e-4120-8c50-4c8cd9b965d6", film.getId()),
                () -> assertEquals("Princess Mononoke", film.getTitle())
        );
    }

}