/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.refactcod;
import javax.swing.JOptionPane;
/**
 *
 * @author slagogonzalez
 */
public class ExamenRefactCOD {

    /**
     * @param args the command line arguments
     */
    public static boolean p = false;

    public static void main(String arg[]) {
        
       
        int ndig = 0;
        if (numero <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int i = 1; i <= 99999; i++) {
            int aux = i;

            int contadorNum = 0;

            while (aux != 0) {
                aux = aux / 10;
                contadorNum++;
            }
            ndig = contadorNum;

            if (ndig == numero) {
                if (i < 4) {
                    p = true;
                } else {
                    if (i % 2 == 0) {
                        p = false;
                    } else {
                        int contadorNum1 = 0;
                        int i1 = 1;
                        int k = (i - 1) / 2;
                        if (k % 2 == 0) {
                            k--;
                        }

                        while (i1 <= k) {
                            if (i % i1 == 0) {
                                contadorNum1++;
                            }
                            i1 += 2;
                            if (contadorNum1 == 2) {
                                i1 = k + 1;
                            }
                        }

                        if (contadorNum1 == 1) {
                            p = true;
                        }
                    }
                }

                if (p == true) {
                    System.out.println(i);
                }
            }
        }
    }

}
