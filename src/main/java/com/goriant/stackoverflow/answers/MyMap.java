package com.goriant.stackoverflow.answers;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MyMap {

    private static final String DEFAULT_BRAND = "no_brand";

    /**
     * item - brand Map
     */
    private final Map<String, String> brandMap;

    /**
     * constructor
     */
    public MyMap() {
        this.brandMap = new HashMap<>();
    }

    /**
     * add item with default brand
     *
     * @param item
     */
    public void addItem(final String item) {
        this.brandMap.put(item, DEFAULT_BRAND);
    }

    /**
     * get brand by item
     *
     * @param item
     * @return brand or null if there is no item in brandMap
     */
    public String getBrandByItem(final String item) {
        return this.brandMap.get(item);
    }

    /**
     * This is using for testing MyMap class
     *
     * @param args
     */
    public static void main(String[] args) {
        // init MyMap
        final MyMap myMap = new MyMap();

        // add apple with default no_brand
        myMap.addItem("apple");

        // assert that your brand item is
        assert Objects.equals(myMap.getBrandByItem("apple"), DEFAULT_BRAND);
    }
}
