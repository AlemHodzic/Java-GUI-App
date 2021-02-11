/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rszadaca2;
import java.io.*;
/**
 *
 * @author korisnik
 */
public class Zaposlenik implements Serializable{
    private String ime;
    private String prezime;
    private String pozicija;
    private int idambulanta;

    public Zaposlenik(String ime, String prezime, String pozicija, int idambulanta) {
        this.ime = ime;
        this.prezime = prezime;
        this.pozicija = pozicija;
        this.idambulanta = idambulanta;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public int getIdambulanta() {
        return idambulanta;
    }

    public void setIdambulanta(int idambulanta) {
        this.idambulanta = idambulanta;
    }

}
