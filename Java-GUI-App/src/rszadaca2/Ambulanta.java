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
public class Ambulanta implements Serializable{
    private int id;
    private String adresa;

    public Ambulanta(int id, String adresa) {
        this.id = id;
        this.adresa = adresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    
    
}
