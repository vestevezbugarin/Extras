package notasavaliacion;

import java.awt.HeadlessException;
import javax.swing.*;

public class Avaliacion {

    private float notaT;
    private float notaP;
    private int boletines;
    private int boletinesTotales;

    public Avaliacion() {
    }

    public Avaliacion(float notaT, float notaP, int boletines) {
        this.notaT = notaT;
        this.notaP = notaP;
        this.boletines = boletines;
    }

    //Getters & Setters
    public float getNotaT() {
        boolean valido = true;

        try {
            do {
                float examen1 = Float.parseFloat(JOptionPane.showInputDialog("Nota do primeiro exame teorico?"));
                float examen2 = Float.parseFloat(JOptionPane.showInputDialog("Nota do segundo exame teorico?"));

                if (examen1 < 0 || examen2 < 0) {
                    valido = false;
                    JOptionPane.showMessageDialog(null, "A nota dos exames non pode ser negativa!", "Dato invalido", 2);
                }

                this.notaT = (examen1 + examen2) * 0.40f;

            } while (valido == false);

        } catch (HeadlessException | NumberFormatException e) {
            e.getMessage();  //erro por consola que non ten unha  utilidade real
        }
        return notaT;
    }

    public float getNotaP() {
        boolean valido = true;
        do {
            float examen = Float.parseFloat(JOptionPane.showInputDialog("Nota do examen práctico?"));

            if (examen < 0) {
                valido = false;
                JOptionPane.showMessageDialog(null, "A nota do exame non pode ser negativa!", "Dato invalido", 2);
            }

            this.notaP = examen * 0.40f;

        } while (valido == false);
        return notaP;
    }

    public int getBoletines() {

        setBoletinesTotales(Integer.parseInt(JOptionPane.showInputDialog("Inserte o número total de boletins "
                + "\nque se realizaron neste curso ")));

        int boletinesHechos = Integer.parseInt(JOptionPane.showInputDialog("Inserte o numero de boletins que realizou"));

        float porcentaxe = (boletinesHechos * 100) / boletinesTotales;

        if (porcentaxe >= 90) {
            this.boletines = 2;
        } else if (porcentaxe >= 70) {
            this.boletines = 1;
        } else {
            this.boletines = 0;
        }

        return boletines;
    }

    public int getBoletinesTotales() {
        return boletinesTotales;
    }

    public void setNotaT(float notaT) {
        this.notaT = notaT;
    }

    public void setNotaP(float notaP) {
        this.notaP = notaP;
    }

    public void setBoletines(int boletines) {
        this.boletines = boletines;
    }

    public void setBoletinesTotales(int boletinesTotales) {
        this.boletinesTotales = boletinesTotales;
    }

    //Methods
    public void avaliacionFinal() {

        try {
            int notaF = (int) (getNotaT() + getNotaP() + getBoletines());
            if (notaF <= 0) {
                JOptionPane.showMessageDialog(null, "O alumno non cumpre os requisitos(!)\n   Nota final: 1 ", "Avaliación", JOptionPane.ERROR_MESSAGE);

            } else if (notaF > 10) {
                notaF = 10;
                JOptionPane.showMessageDialog(null, "Nota da avaliación: " + notaF, "Avaliación", JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (HeadlessException | NumberFormatException e) {
            e.getMessage();  //erro por consola que non ten unha  utilidade real
        }

    }
}
