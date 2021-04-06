
package ru.netology.manager;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Poster;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PosterManagerTest {
    PosterManager manager = new PosterManager(10);

    Poster p01 = new Poster(1, "<Бладшот>", 200, 1);
    Poster p02 = new Poster(2, "Вперед", 210, 1);
    Poster p03 = new Poster(3, "Отель", 220, 1);
    Poster p04 = new Poster(4,"Джентельмены", 230, 1);
    Poster p05 = new Poster(5, "Человек-Невидимка", 240, 1);
    Poster p06 = new Poster(6, "Король лев", 250, 1);
    Poster p07 = new Poster(7, "Зеленая книга", 260, 1);
    Poster p08 = new Poster(8, "Душа", 270, 1);
    Poster p09 = new Poster(9, "Красотка", 280, 1);
    Poster p10 = new Poster(10, "Маугли",  290, 1);
    Poster p11 = new Poster(11, "Том и Джерри",300, 1);


    @Test
    public void showValidPoster() {
        PosterManager manager = new PosterManager(10);
        manager.add(p01);
        manager.add(p02);
        manager.add(p03);
        manager.add(p04);
        manager.add(p05);
        manager.add(p06);
        manager.add(p07);
        manager.add(p08);
        manager.add(p09);
        manager.add(p10);

        Poster[] actual = manager.getAll();
        Poster[] expected = new Poster[]{p10, p09, p08, p07, p06, p05, p04, p03, p02, p01};
        assertArrayEquals(actual, expected);

    }


    @Test
    public void showPosterQuantityLess10() {
        PosterManager manager = new PosterManager(10);
        manager.add(p03);
        manager.add(p04);
        Poster[] actual = manager.getAll();
        Poster[] expected = new Poster[]{p04, p03};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void showPosterQuantityMore10() {
        PosterManager manager = new PosterManager(10);
        manager.add(p01);
        manager.add(p02);
        manager.add(p03);
        manager.add(p04);
        manager.add(p05);
        manager.add(p06);
        manager.add(p07);
        manager.add(p08);
        manager.add(p09);
        manager.add(p10);
        manager.add(p11);
        Poster[] actual = manager.getAll();
        Poster[] expected = new Poster[]{ p11, p10, p09, p08, p07, p06, p05, p04, p03, p02};
        assertArrayEquals(actual, expected); }
}