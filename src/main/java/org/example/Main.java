package org.example;

import org.example.facade.Amplifier;
import org.example.facade.DVDPlayer;
import org.example.facade.HomeTheaterFacade;
import org.example.facade.Projector;
import org.example.singleton.Singleton;
import org.example.strategy.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("-----");
        System.out.println("Facade");
        System.out.println("-----");

        Amplifier amplifier = new Amplifier();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, dvdPlayer, projector);

        homeTheater.assistirFilme();
        System.out.println("-----");
        homeTheater.desligarSistema();

        System.out.println("-----");
        System.out.println("Singleton");
        System.out.println("-----");

        Singleton singleton = Singleton.getInstance();

        // Call a method on the Singleton instance
        singleton.showMessage();

        System.out.println("-----");
        System.out.println("Factory");
        System.out.println("-----");

        Calculator calculator = new Calculator();

        // Usando adição
        calculator.setOperation(new AddOperation());
        int result = calculator.calculate(10, 5);
        System.out.println("Resultado da adição: " + result);

    }
}
