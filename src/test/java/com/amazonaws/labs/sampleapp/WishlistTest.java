package com.amazonaws.labs.sampleapp;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WishlistTest {

    @Test
    public void newWishlistHasNoItems() {
        final Wishlist wishlist = new Wishlist();
        final int size = wishlist.getSize();
        assertEquals(0, size);
    }

    @Test
    public void canAddItem() {
        final Wishlist wishlist = new Wishlist();
        wishlist.add("Test");
        final int size = wishlist.getSize();
        assertEquals(1, size);
    }

    @Test
    public void canGetEmptyList() {
        final Wishlist wishlist = new Wishlist();
        final List<String> list = wishlist.getList();
        assertTrue(list.isEmpty());
    }

    @Test
    public void canGetListWithItems() {
        final Wishlist wishlist = new Wishlist();
        wishlist.add("Test1");
        wishlist.add("Test2");
        final List<String> list = wishlist.getList();
        assertEquals(2, list.size());
        assertTrue(list.contains("Test1"));
        assertTrue(list.contains("Test2"));
    }

}
