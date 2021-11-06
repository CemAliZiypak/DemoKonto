package org.campus02.person;

public class Konto {
    private String Inhaber;
    private double Kontostand;
    private int idNumber;   //1.....9999
    public static int s_anzahlKonto = 10;



    public Konto(String Inhaber){
        this.Inhaber = Inhaber;
        Kontostand = 0;
        this.idNumber = s_anzahlKonto++;
    }


    public void setInhaber (String Inhaber) {
        this.Inhaber = Inhaber;
        Kontostand = 0;
    }

    public void setKontostand(double Kontostand) {
       this.Kontostand = Kontostand;
    }
    public void aufbuchen(double betrag){
        if (betrag > 0){
            Kontostand = Kontostand + betrag;
        }
        else {
            System.out.println("Nur Werte > 0 sind erlaubt!");
        }
    }
    public void abbuchen( double betrag){
        if (Kontostand >= betrag){
            Kontostand -= betrag;

        }
        else{
            System.out.println("Nicht genügend Geld am Konto!");
        }

    }
    public void print(){
        System.out.println("AT" + idNumber + ", Kontoinhaber; " + Inhaber + ", Kontostand; " + Kontostand );
    }
}


