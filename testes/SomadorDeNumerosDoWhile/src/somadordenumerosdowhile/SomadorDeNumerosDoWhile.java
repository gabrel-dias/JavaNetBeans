/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somadordenumerosdowhile;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class SomadorDeNumerosDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, s = 0;
        String resposta;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um número inteiro: ");
            n = teclado.nextInt();
            s += n;
            System.out.println("Quer continuar? [S/N]");
            resposta = teclado.next().toUpperCase();

        } while (resposta.equals(resposta));
        System.out.println("A soma de todos os números digitados é: " + s);

    }

}
