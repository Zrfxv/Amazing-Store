/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author muham
 */
public class Encapsulation {
    private static String username, name;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Encapsulation.name = name;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Encapsulation.username = username;
    }
}
