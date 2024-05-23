import entities.Dipendente;
import entities.DipendenteFullTime;
import entities.DipendenteParTime;
import entities.Dirigente;
import enums.Dipartimento;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Dipendente alberto = new Dipendente(Dipartimento.PRODUZIONE);
        //Dipendente giacomo = new Dipendente(Dipartimento.VENDITE);
        //Dipendente nicola = new Dipendente(Dipartimento.AMMINISTRAZIONE);
        Dipendente alberto = new DipendenteFullTime(Dipartimento.PRODUZIONE);
        Dipendente giacomo = new DipendenteParTime(Dipartimento.VENDITE);
        Dipendente nicola = new Dirigente(Dipartimento.AMMINISTRAZIONE);

        System.out.println("------------------ALBERTO PRIMO IMPIEGO---------------------");
        alberto.showDipendent();

        System.out.println("--------------ALBERTO SECONDO IMPIEGO-------------------------");
        alberto.setDipartimento(Dipartimento.VENDITE);
        alberto.showDipendent();

        System.out.println("--------------MATRICOLE DIPENDENTI-------------------------");
        Dipendente[] dipendenti = {alberto, giacomo, nicola};

        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println("Matricola " + dipendenti[i].getMatricola());
        }

        System.out.println("---------------ALBERTO CALCOLO SALARIO------------------------");
        alberto.calculateSalary();


    }
}