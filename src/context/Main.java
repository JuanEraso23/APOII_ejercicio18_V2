package context;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int num = 0;

        //Ciclo
        while (num != 11) {

            num = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "TABLAS DE MULTIPLICAR\n\n"
                            + "Digite un número\n"
                            + "(1 al 10)\n"
                            + "(11 para salir)"
                    )
            );

            //Condicional
            if (num >= 1 && num <= 10) {

                String resultado = "";

                for (int i = 0; i <= 10; i++) {
                    int multiplo = num * i;
                    resultado +=
                            num + " x "
                            + i + " = "
                            + multiplo + "\n";
                }

                JOptionPane.showMessageDialog(
                        null,
                        "Tabla del " + num + "\n\n" + resultado
                );
            } else if (num == 11) {
                JOptionPane.showMessageDialog(
                        null,
                        "Salir"
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "¡ERROR!\nIngrese un número entre 1 y 11"
                );
            }
        }
    }
}
