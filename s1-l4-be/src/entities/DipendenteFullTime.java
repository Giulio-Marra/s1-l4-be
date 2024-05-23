package entities;

import enums.Dipartimento;

public class DipendenteFullTime extends Dipendente {

    private double stipendio;
    private int matricola;


    public DipendenteFullTime(Dipartimento dipartimento) {
        super(dipartimento);
        this.stipendio = getStipendio();
        this.matricola = getMatricola();
    }


    @Override
    public double calculateSalary() {

        double totaleStipendio = stipendio * 40 * 4;
        System.out.println("MATRICOLA " + this.matricola + " - STIPENDIO " + totaleStipendio + " €");
        return totaleStipendio;

    }
}
