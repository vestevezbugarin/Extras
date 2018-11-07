package notasavaliacion;

import javax.swing.JOptionPane;

public class NotasAvaliacion {

    public static void main(String[] args) {

        int n;

        do {
            n = JOptionPane.showConfirmDialog(null, "Para calcular a nota de avaliacion de un alumno prema en SI, para sair pulse NO"
                    + "", "Avaliacion de Alumnos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (n == JOptionPane.YES_OPTION) {

                Avaliacion alumno = new Avaliacion();

                alumno.avaliacionFinal();
            } else {
                JOptionPane.showMessageDialog(null, "   Ata logo !   ");
            }

        } while (n == JOptionPane.YES_OPTION);

    }

}
