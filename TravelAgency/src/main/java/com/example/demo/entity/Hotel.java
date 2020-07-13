package com.example.demo.entity;

import java.util.*;

/**
 * 
 */
public class Hotel {

    /**
     * Default constructor
     */
    public Hotel() {
    }

    /**
     * 
     */
    public int id;

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public Grade grade;

    /**
     * 
     */
    public int price;

    public enum Grade {
        HIGH_CLASS,
        MIDDLE_CLASS,
        LOW_CLASS
    }

}