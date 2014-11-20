/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import static javafx.application.Platform.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class Juegaso {

    public int pedirNum() {

        int num;

        do {
            double random = Math.random() * 100;
            num = (int) random;
        } while (num < 1 || num > 50);
        return num;
    }

    public int intentosMax() {

        int numI;

        do {
            String dato = JOptionPane.showInputDialog("Introducir número de intentos: ");
            numI = Integer.parseInt(dato);
        } while (numI <= 0);
        return numI;
    }
    /*
     public void jugar() {

     int num;
     int cont = 0;
     int resp = this.pedirNum();
     int intento = this.intentosMax();

     do {
     String dato = JOptionPane.showInputDialog("DALE AHÍ\nIntentos: " + (intento - cont));
     num = Integer.parseInt(dato);
     cont++;

     if (num - resp > 20 || resp - num > 20) {
     JOptionPane.showMessageDialog(null, "Muy frio.");
     }
     if (num - resp <= 20 && num - resp > 15 || resp - num <= 20 && resp - num > 15) {
     JOptionPane.showMessageDialog(null, "Frio.");
     }
     if (num - resp <= 15 && num - resp > 5 || resp - num <= 15 && resp - num > 5) {
     JOptionPane.showMessageDialog(null, "Caliente.");
     }
     if (num - resp <= 5 && num - resp > 0 || resp - num <= 5 && resp - num > 0) {
     JOptionPane.showMessageDialog(null, "Muy caliente.");
     }

     } while (num != resp && cont != intento);

     if (num == resp) {
     JOptionPane.showMessageDialog(null, "WIN");
     }
     if (cont == intento) {
     JOptionPane.showMessageDialog(null, "LOSER");
     }
     }
     */

    public void jugar2() {

        int num;
        int cont;
        int resp = this.pedirNum();
        int intento = this.intentosMax();

        String dato = JOptionPane.showInputDialog("DALE AHÍ");
        num = Integer.parseInt(dato);

        for (cont = 1; cont < intento && num != resp; cont++) {

            int dif = Math.abs(num - resp);

            if (dif > 20) {
                JOptionPane.showMessageDialog(null, "Muy frio.");

            } else {
                if (dif <= 20 && dif > 15) {
                    JOptionPane.showMessageDialog(null, "Frio.");

                } else {
                    if (dif <= 15 && dif > 5) {
                        JOptionPane.showMessageDialog(null, "Caliente.");

                    } else {
                        if (dif <= 5 && dif > 0) {
                            JOptionPane.showMessageDialog(null, "Muy caliente.");

                        }
                    }
                }
            }
            do {
                String dato2 = JOptionPane.showInputDialog("DALE AHÍ\nIntentos: " + (intento - cont));
                num = Integer.parseInt(dato2);
            } while (num > 50 || num < 0);

        }
        if (num == resp) {
            JOptionPane.showMessageDialog(null, "WIN");
        }
        if (cont == intento) {
            JOptionPane.showMessageDialog(null, "LOSER");
        }

        int end = JOptionPane.showConfirmDialog(null, "PLAY AGAIN?");
        if (end == JOptionPane.YES_OPTION) {
            this.jugar2();
        }

        if (end == JOptionPane.NO_OPTION) {
            exit();
        }

    }
}
