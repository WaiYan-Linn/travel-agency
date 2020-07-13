package com.example.demo.entity;

import java.util.*;

/**
 * 
 */
public class Airplane {

    /**
     * Default constructor
     */
    public Airplane() {
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
    public ClassType classType;

    /**
     * 
     */
    public int price;

    /**
     * 
     */
    public Flight flight;


    /**
     * 
     */
    public enum ClassType {
        Business,
        VIP,
        Economy
    }

    /**
     * 
     */
    public enum Flight {
        SOUTHEASTASIA,
        MIDDLEEAST,
        EUROPE
    }

}