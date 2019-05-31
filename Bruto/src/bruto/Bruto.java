/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bruto;
import java.util.*;
public class Bruto {
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    static int turno = 0;
    public static void main(String[] args) throws InterruptedException {
        
        
        init();
        
        
    }
    
    
   
    public static void init() throws InterruptedException {
        System.out.println("La arena esta abierta! Personaliza tu Bruto.");
        System.out.println("Nombre de tu campeón: ");
        String nombre = sc.nextLine();
        
        Arma.agregarArma();
        
        System.out.println("Dejame preguntarte algo, " + nombre +", ¿tu campeon ha pasado su tiempo entrenando o forjando un arma?");
        System.out.println("1 - Forjando un Arma\n2 - Entrenando");
        int eleccion = sc.nextInt();
        sc.nextLine();
        
        if (eleccion == 1) {
            Arma.mostrarArma();
            Thread.sleep(2000);
            Personaje p1 = new Personaje(nombre, Arma.a.get(r.nextInt(3))); 
            System.out.println("Tu bruto ha forjado el arma perfecta para él. se ha armado con majestuoso " + p1.ar.getNombre());  
            p1.fuerza();
            p1.setStatsArma();
        System.out.println("El personaje " + p1.getNombre() + " ha sido inscrito en el torneo. Buena suerte contra tu oponente!");
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                System.out.println(".");
            }
            System.out.println("Saludos temible gladiador, tu contrincante te espera en la arena.");
            Thread.sleep(500);
            System.out.println("Primero dinos tu nombre: ");
            String nom2 = sc.nextLine();
            System.out.println("Dejame preguntarte algo," + nom2 +", ¿tu campeon ha pasado su tiempo entrenando o forjando un arma?");
            System.out.println("1 - Forjando un Arma\n2 - Entrenando");
            int elec = sc.nextInt();
            if (elec == 1) {
                Arma.mostrarArma();
            Thread.sleep(2000);
            Personaje p2 = new Personaje(nom2, Arma.a.get(r.nextInt(3))); 
            System.out.println("Tu bruto ha forjado el arma perfecta para él. se ha armado con majestuoso " + p2.ar.getNombre());  
            p2.fuerza();
            p2.setStatsArma();
            System.out.println("El personaje " + p2.getNombre() + " ha sido inscrito en el torneo. Buena suerte contra tu oponente!");
        mayorAgilidad(p1,p2);
        
            }
            else {
                System.out.println("Bienvenido, Gladiador " + nom2 + ". Cuentanos cuales son tus fortalezas.");
        System.out.println("(a continuacion debes asignar tus atributos, tienes 10 puntos en total)");
        System.out.println("1-Fuerza\n2-Agilidad\n3-Defensa");
        int defensa2 = 0;
        int agilidad2 = 0;
        int fuerza2 = 0;
        int choice2;
        for (int i = 0; i < 10; i++) {
            choice2 = sc.nextInt();
            sc.nextLine();
            switch (choice2){
                case 1 : fuerza2++; break;
                case 2 : agilidad2++; break;
                case 3 : defensa2++; break;
            }
        }
        Personaje p2 = new Personaje(nom2, fuerza2, agilidad2, defensa2);
        p2.fuerza();
        System.out.println("El personaje " + p2.getNombre() + " ha sido inscrito en el torneo. Buena suerte contra tu oponente!");
        mayorAgilidad(p1,p2);
        
            }
        }
        else {
        System.out.println("Bienvenido, Gladiador " + nombre + ". Cuentanos cuales son tus fortalezas.");
        System.out.println("(a continuacion debes asignar tus atributos, tienes 10 puntos en total)");
        System.out.println("1-Fuerza\n2-Agilidad\n3-Defensa");
        int defensa = 0;
        int agilidad = 0;
        int fuerza = 0;
        int choice;
        for (int i = 0; i < 10; i++) {
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1 : fuerza++; break;
                case 2 : agilidad++; break;
                case 3 : defensa++; break;
            }
        }
        Personaje p1 = new Personaje(nombre, fuerza, agilidad, defensa);
        p1.fuerza();
        System.out.println("El personaje " + p1.getNombre() + " ha sido inscrito en el torneo. Buena suerte contra tu oponente!");
        for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                System.out.println(".");
            }
            System.out.println("Saludos temible gladiador, tu contrincante te espera en la arena.");
            Thread.sleep(500);
            System.out.println("Primero dinos tu nombre: ");
            String nom2 = sc.nextLine();
            System.out.println("Dejame preguntarte algo, " + nom2 + ", ¿tu campeon ha pasado su tiempo entrenando o forjando un arma?");
            System.out.println("1 - Forjando un Arma\n2 - Entrenando");
            int elec = sc.nextInt();
            if (elec == 1) {
                Arma.mostrarArma();
            Thread.sleep(2000);
            Personaje p2 = new Personaje(nom2, Arma.a.get(r.nextInt(3))); 
            System.out.println("Tu bruto ha forjado el arma perfecta para él. se ha armado con majestuoso " + p2.ar.getNombre());  
            p2.fuerza(); 
            p2.setStatsArma();
            mayorAgilidad(p1,p2);
            
            }
            else {
                System.out.println("Bienvenido, Gladiador " + nom2 + ". Cuentanos cuales son tus fortalezas.");
        System.out.println("(a continuacion debes asignar tus atributos, tienes 10 puntos en total)");
        System.out.println("1-Fuerza\n2-Agilidad\n3-Defensa");
        int defensa2 = 0;
        int agilidad2 = 0;
        int fuerza2 = 0;
        int choice2;
        for (int i = 0; i < 10; i++) {
            choice2 = sc.nextInt();
            sc.nextLine();
            switch (choice2){
                case 1 : fuerza2++; break;
                case 2 : agilidad2++; break;
                case 3 : defensa2++; break;
            }
        }
        Personaje p2 = new Personaje(nom2, fuerza2, agilidad2, defensa2);
        p2.fuerza();
        System.out.println("El personaje " + p2.getNombre() + " ha sido inscrito en el torneo. Buena suerte contra tu oponente!");
        mayorAgilidad(p1,p2);
         for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println(".");
            }
         
         /*if (p1.start > p2.start) {
            pelea1(p1,p2);
        }
        else {
            pelea2(p1,p2);
        }*/
            }
        
        }
        
        
        
    }
    public static void pelea1(Personaje p1, Personaje p2) throws InterruptedException  {
        
        do {
            Thread.sleep(4000);
                turno++;
                System.out.println("\n");
                double crit1 = p1.critico();
                
                boolean defensa1 = p1.defensa();
                boolean defensa2 = p2.defensa();
                Thread.sleep(4000);
                System.out.println("\n");
                System.out.println(p1.getNombre() +" golpea a su oponente, generando " + crit1 + " puntos de Daño.");
                if (defensa2){
                    System.out.println("DEFENSA! " + p2.getNombre() + " BLOQUEA EL ATAQUE.");
                }
                else {
                p2.setVida((int)(p2.getVida() - crit1));
                }
                if (p2.getVida() <= 0) {
                    p2.setVida(0);
                    System.out.println(p1.getNombre() + " ha sobrevivido con " + p1.getVida());
                    System.out.println(p2.getNombre() + " fue abatido! \n"+ p1.getNombre() + " gana el combate! " );
                break;
                }
                System.out.println("Vida " + p2.getNombre() + ": " + p2.getVida() + " HP" );
                Thread.sleep(4000);
                System.out.println("\n");
                double crit2 = p2.critico();
                System.out.println(p2.getNombre() +" contraataca a su oponente, generando " + crit2 + " puntos de Daño.");
                if (defensa1){
                    System.out.println("DEFENSA! " + p1.getNombre() + " BLOQUEA EL ATAQUE.");
                }
                else {
                p1.setVida((int)(p1.getVida() - crit2)); 
                }
                if (p1.getVida() <= 0) {
                p1.setVida(0);
                    System.out.println(p2.getNombre() + " ha sobrevivido con " + p2.getVida());
                    System.out.println(p1.getNombre() + " fue abatido! \n" + p2.getNombre() + " gana el combate! " );
                break;
                }
                System.out.println("Vida " + p1.getNombre() + ": " + p1.getVida() + " HP" );
            
            
        }
        while(p1.getVida() > 0 && p2.getVida() > 0);
        
    }
    public static void pelea2(Personaje p1, Personaje p2) throws InterruptedException  {
        do {
                
                double crit2 = p2.critico();
                boolean defensa1 = p1.defensa();
                boolean defensa2 = p2.defensa();
                Thread.sleep(4000);
                turno++;
                System.out.println("\n");
                System.out.println(p2.getNombre() +" golpea a su oponente, generando " + crit2 + " puntos de Daño.");
                if (defensa1){
                    System.out.println("DEFENSA! " + p1.getNombre() + " BLOQUEA EL ATAQUE.");
                }
                else {
                p1.setVida((int)(p1.getVida() - crit2)); 
                }
                if (p1.getVida() <= 0) {
                p1.setVida(0);
                System.out.println(p2.getNombre() + " ha sobrevivido con " + p2.getVida());
                    System.out.println(p1.getNombre() + " fue abatido! \n" + p2.getNombre() + " gana el combate! " );
                break;
                }
                System.out.println("Vida " + p1.getNombre() + ": " + p1.getVida() + " HP" );
                Thread.sleep(4000);
                System.out.println("\n");
                double crit1 = p1.critico();
                System.out.println(p1.getNombre() +" golpea a su oponente, generando " + crit1 + " puntos de Daño.");
                if (defensa2){
                    System.out.println("DEFENSA! " + p2.getNombre() + " BLOQUEA EL ATAQUE.");
                }
                else {
                p2.setVida((int)(p2.getVida() - crit1));
                }
                if (p2.getVida() <= 0) {
                p2.setVida(0);
                System.out.println(p1.getNombre() + " ha sobrevivido con " + p1.getVida());
                System.out.println(p2.getNombre() + " fue abatido! \n"+ p1.getNombre() + " gana el combate! " );
                break;
                }
                System.out.println("Vida " + p2.getNombre() + ": " + p2.getVida() + " HP" );
            }
        
        while(p1.getVida() > 0 && p2.getVida() > 0);
        }
    
public static void mayorAgilidad(Personaje p1, Personaje p2) throws InterruptedException {
    System.out.println("Empieza la pelea quien tenga mas agilidad.");
        if (p1.getAgilidad() > p2.getAgilidad()) {
                p1.start = 1;
                p2.start = 0;
            }
            else if (p1.getAgilidad() == p2.getAgilidad()) {
                int gano = r.nextInt(100);
                if (gano < 50) {
                    p1.start = 1;
                    p2.start = 0;
                }
                else {
                    p1.start = 0;
                    p2.start = 1;
                }
            }
            else {
                p1.start = 0;
                p2.start = 1;
            }
        System.out.println(p1.getNombre() + ": \nAgilidad: " + p1.getAgilidad() + "\nFuerza: " + p1.getFuerza() + "\nDefensa: " + p1.getDefensa() + "\nVida: " + p1.getVida() + "\nDaño: " + p1.getDaño() +  "\nCrit chance: " + p1.critCh() + "%" +  "\nBloqueo: " + (p1.getDefensa() * 7) + "%");
        for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println(".");
            }
        System.out.println(p2.getNombre() + ": \nAgilidad: " + p2.getAgilidad() + "\nFuerza: " + p2.getFuerza() + "\nDefensa: " + p2.getDefensa() + "\nVida: " + p2.getVida() + "\nDaño: " + p2.getDaño() +  "\nCrit chance: " + p2.critCh() + "%"+  "\nBloqueo: " + (p2.getDefensa() * 7) + "%");
             for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println(".");
            }
        System.out.println("");
        if (p1.start > p2.start) {
        
            pelea1(p1,p2);
        
        }
        else if (p2.start > p1.start) {
        pelea1(p1,p2);
        }
}
}


