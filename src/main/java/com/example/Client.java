/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author 2087559
 */
public class Client {
    
    public static void main(String[] args) throws Exception { 
        URL google = new URL("http://www.google.com/"); 
        try (BufferedReader reader = new BufferedReader(
            new InputStreamReader(google.openStream()))) { 
              String inputLine = null; 
              while ((inputLine = reader.readLine()) != null) { 
                    System.out.println(inputLine); 
               } 
         } catch (IOException x) { 
                 System.err.println(x); 
         } 
    } 
}
