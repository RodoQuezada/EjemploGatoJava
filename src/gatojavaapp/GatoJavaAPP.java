/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatojavaapp;

import java.util.Scanner;

/**
 *
 * @author rodo
 */
public class GatoJavaAPP {

    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
        
        char play1 = 'x';
        char play2 = 'o';
        
        int coordenada1;
        int coordenada2;
        int turno=0;
        
        char [][] tablero = new char[3][3];
        
        boolean aux = true;
                                           
        while(turno < 10){
        
        System.out.print("\n\nIngrese fila: ");
        coordenada1 = read.nextInt();
        System.out.print("Ingrese columna: ");
        coordenada2 = read.nextInt();
        
        
        if(tablero[(coordenada1-1)][(coordenada2-1)] == 'x' || tablero[(coordenada1-1)][(coordenada2-1)] == 'o')  {                       
            System.out.println("ERROR, eliga otra posicion. Intente de nuevo");
        }else{
             if (turno%2 == 0) {
               tablero[(coordenada1-1)][(coordenada2-1)] = play1;
               turno ++;     
            }else{
               tablero[(coordenada1-1)][(coordenada2-1)] = play2;  
               turno ++;     
            }
         }        
        
        
        System.out.println("\n");
           
        System.out.println(" "+tablero[0][0]+" | "+tablero[0][1]+" | "+tablero[0][2]+" ");
        System.out.println("-----------------------------------------------------------");
        System.out.println(" "+tablero[1][0]+" | "+tablero[1][1]+" | "+tablero[1][2]+" ");
        System.out.println("-----------------------------------------------------------");
        System.out.println(" "+tablero[2][0]+" | "+tablero[2][1]+" | "+tablero[2][2]+" ");
            System.out.println(turno);
     
           
            //Ganador linea 1
            if (tablero[0][0] == 'x' && tablero[0][1] == 'x' && tablero[0][2]== 'x') {
                System.out.println("Ganador: Jugador 1");
                turno = 11;
            }
            if (tablero[0][0] == 'o' && tablero[0][1] == 'o' && tablero[0][2]== 'o') {
                System.out.println("Ganador: Jugador 2");
                turno = 11;
            }
            
            //Ganador linea 2
            if (tablero[1][0] == 'x' && tablero[1][1] == 'x' && tablero[1][2]== 'x') {
                System.out.println("Ganador: Jugador 1");
                turno = 11;
            }
             if (tablero[1][0] == 'o' && tablero[1][1] == 'o' && tablero[1][2]== 'o') {
                System.out.println("Ganador: Jugador 2");
                turno = 11;
            }
             
             //Ganador linea 3
             if (tablero[2][0] == 'x' && tablero[2][1] == 'x' && tablero[1][2]== 'x') {
                System.out.println("Ganador: Jugador 1");
                turno = 11;
            }
             if (tablero[2][0] == 'o' && tablero[2][1] == 'o' && tablero[2][2]== 'o') {
                System.out.println("Ganador: Jugador 2");
                turno = 11;
            } 
            //Ganador columna 1
             if (tablero[0][0] == 'x' && tablero[1][0] == 'x' && tablero[2][0]== 'x') {
                System.out.println("Ganador: Jugador 1");
                turno = 11;
            }
             if (tablero[0][0] == 'o' && tablero[1][0] == 'o' && tablero[2][0]== 'o') {
                System.out.println("Ganador: Jugador 2");
                turno = 11;
            } 
            //Ganador columna 2
             if (tablero[0][1] == 'x' && tablero[1][1] == 'x' && tablero[2][1]== 'x') {
                System.out.println("Ganador: Jugador 1");
                turno = 11;
            }
             if (tablero[0][1] == 'o' && tablero[1][1] == 'o' && tablero[2][1]== 'o') {
                System.out.println("Ganador: Jugador 2");
                turno = 11;
            }  
             //Ganador columna 3
             if (tablero[0][2] == 'x' && tablero[1][2] == 'x' && tablero[2][2]== 'x') {
                System.out.println("Ganador: Jugador 1");
                turno = 11;
            }
             if (tablero[0][2] == 'o' && tablero[1][2] == 'o' && tablero[2][2]== 'o') {
                System.out.println("Ganador: Jugador 2");
                turno = 11;
            }  
               //Ganador diagonal
             if (tablero[0][0] == 'x' && tablero[1][1] == 'x' && tablero[2][2]== 'x') {
                System.out.println("Ganador: Jugador 1");
                turno = 11;
            }
             if (tablero[0][0] == 'o' && tablero[1][1] == 'o' && tablero[2][2]== 'o') {
                System.out.println("Ganador: Jugador 2");
                turno = 11;
            }  
                 //Ganador diagonal inversa
             if (tablero[0][2] == 'x' && tablero[1][1] == 'x' && tablero[2][0]== 'x') {
                System.out.println("Ganador: Jugador 1");
                turno = 11;
            }
             if (tablero[0][2] == 'o' && tablero[1][1] == 'o' && tablero[2][0]== 'o') {
                System.out.println("Ganador: Jugador 2");
                turno = 11;
            } 
             if (turno == 9) {
                 System.out.println("Empate! ");
            } 
        }                         
    }    
}
