/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturascondicionais;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class EstruturasCondicionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here saci, bípede, quadrúpede, aranha e et
        Scanner teclado = new Scanner(System.in);
        String tipo;
        int pernas = teclado.nextInt();

        switch (pernas) {
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "bípede";
                break;
            case 3:
                tipo = "três perna";
                break;
            case 4:
                tipo = "quadrúpede";
                break;
            case 6, 8:
                tipo = "aranha";
                break;

            default:
                tipo = "ET";
        }
        System.out.println("O tipo é " + tipo);

    }

}
