package ru.netology.manager;

import ru.netology.domain.Poster;

public class PosterManager {
    private Poster[] items = new Poster[0];
    private int limit;

    public PosterManager(int limit) {
        this.limit = limit;
    }
    

    public void add(Poster item) {
        int length = items.length + 1;
        Poster[] tmp = new Poster[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Poster[] getAll() {

        if (items.length < limit) {
            Poster[] result = new Poster[items.length];
            for (int i = 0; i < result.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;

        }
        else if (limit <= items.length) {
            Poster[] result = new Poster[limit];
            for (int i = 0; i < limit; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        }
        return null;
    }


}
