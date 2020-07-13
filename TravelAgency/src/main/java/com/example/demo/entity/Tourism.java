package com.example.demo.entity;

import java.util.*;

/**
 * 
 */
public class Tourism {

    /**
     * Default constructor
     */
    public Tourism() {
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

    /**
     * 
     */
    public String trip;


    /**
     * 
     */
    public enum Grade {
        HIGH_CLASS,
        MIDDLE_CLASS,
        LOW_CLASS
    }

}