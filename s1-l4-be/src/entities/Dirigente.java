package entities;

import enums.Dipartimento;

public class Dirigente extends Dipendente {
    public Dirigente(Dipartimento dipartimento) {
        super(dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio();
    }
}
