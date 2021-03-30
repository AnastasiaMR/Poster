package ru.netology.manager;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Poster;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManager {
    PosterManager manager = new PosterManager( );

    Poster p01 = new Poster(1, "<Бладшот>", 1);
    Poster p02 = new Poster(2, "Вперед", 1);
    Poster p03 = new Poster(3, "Отель", 1);
    Poster p04 = new Poster(4,"Джентельмены", 1);
    Poster p05 = new Poster(5, "Человек-Невидимка", 1);
    Poster p06 = new Poster(6, "Король лев", 1);
    Poster p07 = new Poster(7, "Зеленая книга", 1);
    Poster p08 = new Poster(8, "Душа", 1);
    Poster p09 = new Poster(9, "Красотка", 1);
    Poster p10 = new Poster(10, "Маугли", 1);
    Poster p11 = new Poster(11, "Маугли2", 1);

    public PosterManager(int i) {
    }

    public PosterManager( ) {
    }

    @Test
    void showPoster() {
        PosterManager posterManager = new PosterManager(10);
        posterManager.add(p01);
        posterManager.add(p02);
        posterManager.add(p03);
        posterManager.add(p04);
        posterManager.add(p05);
        posterManager.add(p06);
        posterManager.add(p07);
        posterManager.add(p08);
        posterManager.add(p09);
        posterManager.add(p10);

        Poster[] actual = posterManager.getAll();
        Poster[] expected = new Poster[]{};
        assertArrayEquals(actual, expected);

    }

    @Test
    void showValidPoster() {
        PosterManager posterManager = new PosterManager(10);
        posterManager.add(p01);
        posterManager.add(p02);
        posterManager.add(p03);
        posterManager.add(p04);
        posterManager.add(p05);
        posterManager.add(p06);
        posterManager.add(p07);
        posterManager.add(p08);
        posterManager.add(p09);
        posterManager.add(p10);
        posterManager.add(p11);
        Poster[] actual = manager.getAll();
        Poster[] expected = new Poster[]{p11, p10, p09, p08, p07, p06, p05, p04, p03, p02,};
        assertArrayEquals(actual, expected);
    }
}