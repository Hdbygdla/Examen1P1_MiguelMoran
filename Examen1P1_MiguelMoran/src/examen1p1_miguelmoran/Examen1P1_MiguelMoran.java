/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_miguelmoran;
import java.util.Scanner;
/**
 *
 * @author flash
 */
public class Examen1P1_MiguelMoran {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String historial = "";
        boolean seguir = true;
        while(seguir){
            System.out.println("1. Ejercicios String");
            System.out.println("2. Respuestas a preguntas");
            System.out.println("3. Historial del menu");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1 ->{
                    System.out.print("Ingrese una cadena: ");
                    sc.nextLine();
                    String string = sc.nextLine();
                    int length = 0;
                    if(string.length() % 2 == 1){
                        length = string.length() - 1;
                    } else {
                        length = string.length();
                    }
                    int lengthsubstr1 = length/2;
                    String substring1 = ""; String substring2 = "";
                    for (int i = 0; i < string.length(); i++) {
                        if(i < lengthsubstr1){
                            substring1 += string.charAt(i);
                        } else {
                            substring2 += string.charAt(i);
                        }
                    }
                    String newstring = "";
                    if(string.length() % 2 == 1){
                        newstring = substring2 + substring1;
                    } else {
                        for (int i = 0; i < lengthsubstr1; i++) {
                                newstring += substring1.charAt(i);
                                newstring += substring2.charAt(i);
                        }
                    }
                    System.out.println("La cadena resultante es: "+newstring);
                    historial += "a";
                }
                case 2 ->{
                    
                    historial += "b";
                }
                case 3 ->{
                    for (int i = 0; i < historial.length(); i++) {
                        if(historial.charAt(i) == 'a'){
                            System.out.print("Ejercicios String -"); 
                        } else {
                            System.out.println("Respuestas a preguntas -");
                        } 
                    }
                    System.out.println("");
                }
                case 4 ->{
                    seguir = false;
                }
            }
        }
    }
    
}
