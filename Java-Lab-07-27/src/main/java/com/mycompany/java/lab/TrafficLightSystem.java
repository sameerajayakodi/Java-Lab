/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java.lab;

/**
 *
 * @author samee
 */
public class TrafficLightSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TrafficLight greenLight = new TrafficLight("Green", 10000); // Green light duration: 10 seconds
        TrafficLight redLight = new TrafficLight("Red", 8000);       // Red light duration: 8 seconds
        TrafficLight yellowLight = new TrafficLight("Yellow", 2000); // Yellow light duration: 2 seconds

        greenLight.start();
        redLight.start();
        yellowLight.start();
    }
    
}
