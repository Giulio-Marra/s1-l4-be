package entities;

import enums.Dipartimento;

public class DipendenteParTime extends Dipendente {

    private double stipendio;
    private int matricola;
    private int orelavoro;

    public DipendenteParTime(Dipartimento dipartimento) {
        super(dipartimento);
        this.stipendio = getStipendio();
        this.matricola = getMatricola();
        this.orelavoro = orelavoro;

    }

    @Override
    public double calculateSalary() {
        double totaleStipendio = stipendio * this.orelavoro;
        System.out.println("MATRICOLA " + this.matricola + " - STIPENDIO " + totaleStipendio + " €");
        return totaleStipendio;
    }

    public void setOrelavoro(int orelavoro) {
        this.orelavoro = orelavoro;
    }
}
