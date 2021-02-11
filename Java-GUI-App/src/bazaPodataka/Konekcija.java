/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazaPodataka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class Konekcija {
    private static final String korisnik = "root";
    private static final String sifra = "1234";
    private static final String kon = "jdbc:mysql://localhost:3306/rszadaca?serverTimezone=UTC";
    public Connection veza = null;
    public Konekcija() throws SQLException, ClassNotFoundException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            veza = DriverManager.getConnection(kon,korisnik,sifra);
            System.out.println("Konekcija uspješna!");
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    public void unosAmbulante(String adresa) throws SQLException{
        Statement upitBaza = (Statement) veza.createStatement();
        String upit = "INSERT INTO ambulanta (adresa) VALUES ('"+adresa+"')";
        try{
            upitBaza.executeUpdate(upit);
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    public ResultSet ispisAmbulante() throws SQLException{
        Statement upitBaza = (Statement) veza.createStatement();
        ResultSet rezultat = null;
        try{
            rezultat = upitBaza.executeQuery("Select * from ambulanta");
            return rezultat;
        }
        catch(SQLException e){
            System.err.println(e);
        }
        return rezultat;
    }
    public void unosOsoblja(String ime, String prezime, String pozicija, int idambulanta) throws SQLException{
        Statement upitBaza = (Statement) veza.createStatement();
        String upit = "INSERT INTO osoblje (ime, prezime, pozicija, idambulanta) VALUES ('"+ime+"', '"+prezime+"', '"+pozicija+"', '"+idambulanta+"')";
        try{
            upitBaza.executeUpdate(upit);
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    public ResultSet ispisOsoblja() throws SQLException{
        Statement upitBaza = (Statement) veza.createStatement();
        ResultSet rezultat = null;
        try{
            rezultat = upitBaza.executeQuery("Select * from osoblje");
            return rezultat;
        }
        catch(SQLException e){
            System.err.println(e);
        }
        return rezultat;
    }
    public ResultSet ispisAmbulanteID(String Ambulanta) throws SQLException{
        Statement upitBaza = (Statement) veza.createStatement();
        ResultSet rezultat = null;
        try{
            rezultat = upitBaza.executeQuery("Select idambulanta from ambulanta where adresa=('"+Ambulanta+"')");
            return rezultat;
        }
        catch(SQLException e){
            System.err.println(e);
        }
        return rezultat;
    }
    public void obrisiOsoblje(String ime, String prezime) throws SQLException{
        Statement upitBaza = (Statement) veza.createStatement();
        String upit = "delete from osoblje where ime=('"+ime+"') and prezime=('"+prezime+"')";
        try{
            upitBaza.executeUpdate(upit);
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
     public void obrisiAmbulantu(int id) throws SQLException{
        Statement upitBaza = (Statement) veza.createStatement();
        String upit = "delete from osoblje where idambulanta=('"+id+"')";
        String upit2 = "delete from ambulanta where idambulanta=('"+id+"')";
        try{
            upitBaza.executeUpdate(upit);
            upitBaza.executeUpdate(upit2);
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
     public void unosRasporeda(String pon, String uto, String sri, String cet, String pet, int idOsoblje) throws SQLException{
        Statement upitBaza = (Statement) veza.createStatement();
        String upit = "INSERT INTO raspored (pon, uto, sri, cet, pet, idosoblje) VALUES ('"+pon+"', '"+uto+"', '"+sri+"', '"+cet+"', '"+pet+"', '"+idOsoblje+"')";
        try{
            upitBaza.executeUpdate(upit);
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
         public ResultSet ispisRasporeda() throws SQLException{
        Statement upitBaza = (Statement) veza.createStatement();
        ResultSet rezultat = null;
        try{
            rezultat = upitBaza.executeQuery("Select * from raspored");
            return rezultat;
        }
        catch(SQLException e){
            System.err.println(e);
        }
        return rezultat;
    }
    
 
    
}
