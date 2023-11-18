package lab6p1_carlosflores;

import java.util.Scanner;
import java.util.Random;

public class Lab6P1_CarlosFlores {

    static Scanner leer = new Scanner(System.in);
    static Random random = new Random();
    
    public static void imprimir(int [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Pos " + i + " = " + arreglo[i]);
        }
    }
    
    public static int [] random(int tam_arreglo){
        int temporal [] = new int [tam_arreglo];
        for(int i = 0; i < tam_arreglo; i++){
            temporal [i] = random.nextInt((73-65)+1)+65;
        }//fin for
        
        return temporal;
    }//fin metodo random
    
    public static void genRandCharArray1(int tam_arreglo1 []){
        for (int i = 0; i < tam_arreglo1.length; i++){
            int var = random.nextInt((73-65)+1)+65;
            char letr = (char) var;
            System.out.print("[" + letr + "]");
        }
    }
    
    public static void genRandCharArray2(int tam_arreglo2 []){
        for (int i = 0; i < tam_arreglo2.length; i++){
            int var = random.nextInt((73-65)+1)+65;
            char letr = (char) var;
            System.out.print("[" + letr + "]");
        }
    }
    
    public static void intersection(char genRandCharArray1 [],char genRandCharArray2 []){
        
    }//fin metodo
    
    public static void difference(int genRandCharArray1 [],int genRandCharArray2 []){
        
    }
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese una opcion: ");
        System.out.println("1-Conjuntos");
        System.out.println("2-¿Cuántos primos tienes?");
        System.out.println("3-Salir");
        int opcion = leer.nextInt();
        
        while(opcion > 0 && opcion < 3){
            
            switch(opcion){
                
                case 1 ->{
                    
                    System.out.println("\n"
                            + "Ingrese un tamaño para el arreglo 1 : ");
                    System.out.print("SIZE SET 1= ");
                    int tam_arreglo1 = leer.nextInt();
                    int nums [] = new int [tam_arreglo1];
                    
                    System.out.println("Ingrese un tamaño para el arreglo 2 : ");
                    System.out.print("SIZE SET 2= ");
                    int tam_arreglo2 = leer.nextInt();
                    int nums2 [] = new int [tam_arreglo2];
                    System.out.println("\n"
                            + "Conjuntos generados: ");
                    System.out.print("SET 1 = ");
                    genRandCharArray1(nums);
                    System.out.println();
                    System.out.print("SET 2 = ");
                    genRandCharArray2(nums2);
                    System.out.println();
                    System.out.println("\n"
                            + "Operaciones\n"
                            + "1-Interseccion\n"
                            + "2-Diferencia\n"
                            + "Ingrese una opcion");
                    int opcion_interna = leer.nextInt();
                    break;
                }//fin case1
                
                case 2 ->{
                    
                }
                    
            }//fin switch
            
            System.out.println();
            System.out.println("Ingrese una opcion: ");
            System.out.println("1-Conjuntos");
            System.out.println("2-¿Cuántos primos tienes?");
            System.out.println("3-Salir");
            opcion = leer.nextInt();
        
        }//fin while
        
    }//fin main
    
}//fin class
