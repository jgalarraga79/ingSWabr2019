/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingswabr2019;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author JoseGalarraga
 */
public class IngSWabr2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaraion de variables
        Scanner sc = new Scanner(System.in);      
        int fibo1,fibo2,i,entero;
        //ingreso de datos numericos
        do{
            System.out.print("Ingrese entero mayor que 1 y menor o igual que 100: ");
            entero = sc.nextInt();
        }while(entero<=1 || entero>100);   
        //declaracion de archivo para grabar
        FileWriter fw;
        
        try {
            //grabado de datos
            fw = new FileWriter(new File("serie.txt"),true);
            fw.write("Los " + entero + " primeros términos de la serie de Fibonacci son:");
            //calculo de serie Fibonacci
            fibo1=1;
            fibo2=1; 
            fw.write(fibo1 + " ");
            for(i=2;i<=entero;i++){
                 fw.write(fibo2 + " ");
                 fibo2 = fibo1 + fibo2;
                 fibo1 = fibo2 - fibo1;
            }
            fw.write(System.lineSeparator());
            //cerrar archivo
            fw.close();
        } catch (IOException ex) {
            }
    
    }
    
}
