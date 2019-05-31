/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bruto;

import java.util.*;

public class Arma {

    
    private int idArma;
    private String nombre;
    private double dmg;
    private int atributo;
    Random r = new Random();
    static ArrayList<Arma> a = new ArrayList<Arma>();
    
    
    public int randomGen(int random) 
    {
        int randomGen = r.nextInt(random) + 1;
        return randomGen;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getDmg() {
        return dmg;
    }
    
    public void setDmg(double dmg) {
        this.dmg = dmg;
    }
    
    public void setAtributo(int atributo) {
        this.atributo = atributo;
    }
    
    public int getAtributo() {
        return atributo;
    }
    
    public Arma(String nombre, double dmg, int idArma, int atributo) {
        this.nombre = nombre;
        this.dmg = dmg;
        this.idArma = idArma;
        this.atributo = atributo;
    }
    
    
    
    public static void agregarArma() {
        Arma a1 = new Arma("Cuchillo", 1.4, 1, 8);
        Arma a2 = new Arma("Martillo", 1.6, 2, 7);
        Arma a3 = new Arma("Escudo", 0.8, 3, 10);
        a.add(a1);
        a.add(a2);
        a.add(a3);
    }
    public int getIdArma() {
        return idArma;
    }

    public String cadena(int idArma){
        String cadena = "";
        switch(idArma) {
            case 1: cadena = "agilidad"; break;
            case 2: cadena = "fuerza"; break;
            case 3: cadena = "defensa"; break;
        }
        return cadena;
    }
    
    public static void mostrarArma() {

        System.out.println("Lista de armas: ");
        for (int i = 0; i < a.size(); i++) {
            System.out.println((i+1) + "- " + a.get(i).getNombre() + " aumenta el daño un " + (a.get(i).getDmg() * 100) + "%. aumenta " + a.get(i).getAtributo() + " de " + a.get(i).cadena((a.get(i).getIdArma())));
        }
    
    }
    
    
    
    public void setIdArma(int idArma) {
        this.idArma = idArma;
    }
}
