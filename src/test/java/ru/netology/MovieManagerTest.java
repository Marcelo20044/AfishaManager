package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    void shouldSave() {
        MovieManager manager = new MovieManager();
        PosterItem Bloodshot = new PosterItem(1, "Bloodshot", "Action");
        PosterItem Vpered = new PosterItem(2, "Vpered", "Cartoon" );
        PosterItem Gentlemen = new PosterItem(3, "Gentlemen", "Action" );
        PosterItem Trolls = new PosterItem(4, "Trolls", "Cartoon" );

        manager.save(Bloodshot);
        manager.save(Vpered);
        manager.save(Gentlemen);
        manager.save(Trolls);
        PosterItem[] actual = manager.items;
        PosterItem[] expected = new PosterItem[]{Bloodshot, Vpered, Gentlemen, Trolls};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSave2() {
        MovieManager manager = new MovieManager();
        PosterItem Bloodshot = new PosterItem(1, "Bloodshot", "Action");

        manager.save(Bloodshot);
        PosterItem[] actual = manager.items;
        PosterItem[] expected = new PosterItem[]{Bloodshot};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetAll() {
        MovieManager manager = new  MovieManager();
        PosterItem Bloodshot = new PosterItem(1, "Bloodshot", "Action");
        PosterItem Vpered = new PosterItem(2, "Vpered", "Cartoon" );
        PosterItem Gentlemen = new PosterItem(3, "Gentlemen", "Action" );
        PosterItem Trolls = new PosterItem(4, "Trolls", "Cartoon" );

        manager.save(Bloodshot);
        manager.save(Vpered);
        manager.save(Gentlemen);
        manager.save(Trolls);
        PosterItem[] actual = manager.getAll();
        PosterItem[] expected = new PosterItem[]{Trolls, Gentlemen, Vpered, Bloodshot};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetAll2() {
        MovieManager manager = new  MovieManager();
        PosterItem Bloodshot = new PosterItem(1, "Bloodshot", "Action");
        PosterItem Vpered = new PosterItem(2, "Vpered", "Cartoon" );


        manager.save(Bloodshot);
        manager.save(Vpered);
        PosterItem[] actual = manager.getAll();
        PosterItem[] expected = new PosterItem[]{Vpered, Bloodshot};
        assertArrayEquals(expected, actual);
    }
}