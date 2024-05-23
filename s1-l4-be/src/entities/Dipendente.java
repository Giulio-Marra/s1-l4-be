package entities;

import enums.Dipartimento;

import java.util.Random;

public abstract class Dipendente {

    private int matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(Dipartimento dipartimento) {
        Random mtrRnd = new Random();
        this.matricola = mtrRnd.nextInt(1, 100);
        this.stipendio = 0;
        this.dipartimento = dipartimento;


    }

    public abstract double calculateSalary();

    public void showDipendent() {
        System.out.println("Matricola " + this.matricola);
        System.out.println("Stipendio orario " + this.stipendio + " €");
        System.out.println("Dipartimento " + this.dipartimento);
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        switch (dipartimento) {
            case PRODUZIONE:
                return setStipendio(9.2);
            case VENDITE:
                return setStipendio(10.4);
            case AMMINISTRAZIONE:
                return setStipendio(21.8);
        }
        return stipendio;
    }

    public double setStipendio(double num) {
        return stipendio = num;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
        getStipendio();
    }
}
