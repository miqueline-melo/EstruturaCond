/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturacond;

import java.util.Scanner;

/**
 *
 * @author thiag
 */
public class Estruturacond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float nota1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = teclado.nextFloat();
        float m = (nota1+nota2)/2;
        System.out.println("Sua media e: " + m);
        if (m>9){
            System.out.println("maior");
           } else { System.out.println("menor"); 
        }
                 
        }
    }
    
