package org.example.facade;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Projector projector;

    public HomeTheaterFacade(Amplifier amplifier, DVDPlayer dvdPlayer, Projector projector) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
    }

    public void assistirFilme() {
        System.out.println("Preparando para assistir um filme...");
        amplifier.on();
        dvdPlayer.on();
        projector.on();
    }

    public void desligarSistema() {
        System.out.println("Desligando o sistema de entretenimento...");
        amplifier.off();
        dvdPlayer.off();
        projector.off();
    }
}