/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class Juego {

    private ArrayList<Jugador> jugadores;
        
    public void addJugador(Jugador jugador) {
        Point posicion = this.generarPosicion();
        jugador.setPosicion(posicion);
        jugadores.add(jugador);
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    private Point generarPosicion(){
        return null;
    }
}