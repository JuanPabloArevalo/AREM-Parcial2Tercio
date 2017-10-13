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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author 2087559
 */
public class Client {
    
    public static void main(String[] args) throws Exception { 
        String direccionHeroku = "https://vast-chamber-72895.herokuapp.com";
        URL google = new URL(direccionHeroku+"/db"); 
            try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(google.openStream()))) { 
                String inputLine = null; 
                while ((inputLine = reader.readLine()) != null) { 
                    System.out.println(inputLine); 
                } 
            } catch (IOException x) { 
                System.err.println(x); 
            } 
        
            google = new URL(direccionHeroku+"/index");
            try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(google.openStream()))) { 
                String inputLine = null; 
                while ((inputLine = reader.readLine()) != null) { 
                    System.out.println(inputLine); 
                } 
           } catch (IOException x) { 
                System.err.println(x); 
           }
 
        
        for(int i=1; i<=20; i++){
            google = new URL(direccionHeroku+"/cuadrado/"+i); 
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
}
