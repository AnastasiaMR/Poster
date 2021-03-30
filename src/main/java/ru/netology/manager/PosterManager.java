package ru.netology.manager;

import ru.netology.domain.Poster;

public class PosterManager {
    private Poster [] items = new Poster[0];

    public void add(Poster item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        Poster[] tmp = new Poster[length];
        // itar + tab
        // копируем поэлементно
        // for (int i = 0; i < items.length; i++) {
        //   tmp[i] = items[i];
        // }
        System.arraycopy(items, 0, tmp, 0, items.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Poster[] getAll() {
        if (items.length <= 10) {
            Poster[] result = new Poster[items.length];
            for (int i = 0; i < items.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        } else {
            Poster[] result = new Poster[10];
            for (int i = 0; i < 10; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        }
    }
}