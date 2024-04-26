/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundprog_exa_prac_eva2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class FUNDPROG_EXA_PRAC_EVA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double manoCom;
        int mano = 0;
        int comp = 0;
        int victorias = 0;
        int derrotas = 0;
        int empates = 0;
        int jugar = 0;
        String seleccion;
        Scanner captu = new Scanner(System.in);
        String usuario;
      
        while(true){
        System.out.println("¿Deseas jugar? (Si) o (No)");
        usuario = captu.nextLine();
        if(usuario.equals("Si"))
            jugar = 1;
        else 
            jugar = 0;
       
        if(jugar == 1){
        System.out.println("Introduce tu elección (PIEDRA, PAPEL, TIJERAS (Mayúsculas))");
        
        
        seleccion = captu.nextLine();
        
        if(seleccion.equals("PIEDRA")){
            mano = 1;
            System.out.println("Tu:PIEDRA!!!");
        }
        else if(seleccion.equals("PAPEL")){
            mano = 2;
            System.out.println("Tu:PAPEL!!!");
            }
        else if(seleccion.equals("TIJERAS")){
            mano = 3;
            System.out.println("Tu:TIJERAS!!!");
            }
        else
            System.out.println("Selección Inválida");
        
        manoCom = Math.random();
         if((manoCom >= 0) && (manoCom <= 0.33 )){
             System.out.println("Computadora:PIEDRA!!!");
             comp = 1;
         }
         else if((manoCom > 0.33) && (manoCom <= 0.66)){
            System.out.println("Computadora:PAPEL!!!");
            comp = 2;
         }
         else  if((manoCom > 0.66) && (manoCom <= 0.99)){
            System.out.println("Computadora:TIJERAS!!!");
            comp = 3;
         }
         
          if((mano == 1) && (comp == 3 )){
             System.out.println("GANASTE!!!");
             victorias += 1;
             }
          else if ((mano == 1) && (comp == 2 )){
             System.out.println("PERDISTE");
             derrotas += 1;
          }
          else if ((mano == 2) && (comp == 1 )){
             System.out.println("GANASTE");
             victorias += 1;
          }
          else if ((mano == 2) && (comp == 3 )){
             System.out.println("PERDISTE");
             derrotas += 1;             
          }
          else if ((mano == 3) && (comp == 2 )){
             System.out.println("GANASTE");
             victorias += 1;
          }
          else if ((mano == 3) && (comp == 3 )){
             System.out.println("PERDISTE");
             derrotas += 1;
          }
          else if ((mano == comp)){
             System.out.println("EMPATE");
             empates += 1;
          }
        }
        
          System.out.println("Victorias: " + victorias);         
          System.out.println("Derrotas: " + derrotas);         
          System.out.println("Empates: " + empates); 
        }
        }
    }