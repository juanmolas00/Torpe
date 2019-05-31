/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bruto;

import java.util.*; 
public class Personaje {
    
    private String nombre = "";
    private int fuerza = 0;
    private int agilidad = 0;
    private int defensa = 0;
    private int vida = 100;
    private int daño = 0;
    Random r = new Random();
    public int start = 0;
    Arma ar;

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }
    
    public Personaje(String nombre, Arma ar) {
        this.nombre = nombre;
        this.ar = ar;
    }
    
    public Personaje(String nombre, int fuerza, int agilidad, int defensa) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.defensa = defensa;
    }
    

    
    public int randomGen(int random) 
    {
        int randomGen = r.nextInt(random) + 1;
        return randomGen;
    }

    public double critCh() {
        double critch = getAgilidad() * 10;
        return critch;
    }
    public boolean defensa() {
        boolean defensa = false;
        if (randomGen(100) < getDefensa() * 7) {
            defensa = true;
        }
        return defensa;
    }
    public double critico() {
        double critico = 0;
        if (randomGen(100) < getAgilidad() * 10) {
            setDaño(randomGen(7) + 6);
            critico = getDaño() * 2.5; 
            System.out.println("CRITICO!");
        }
        else {
            setDaño(randomGen(7) + 6);
            critico = getDaño();}
        return critico;
    }
    public void fuerza() {
        setVida((int)Math.round(vida + (fuerza * 15)));
        setDaño((int)Math.round(getDaño() + (fuerza * 0.5)));
    }
    
    public void setStatsArma() {
        setDaño((int)(getDaño() + (getDaño() * ar.getDmg())));
       switch (ar.getIdArma()) {
           case 1:  setAgilidad(ar.getAtributo()); break;
           case 2:  setFuerza(ar.getAtributo()); break;
           case 3: setDefensa(ar.getAtributo()); break;
       }       
    }
    
    
}
