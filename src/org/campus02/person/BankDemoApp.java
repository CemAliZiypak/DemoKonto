package org.campus02.person;

public class BankDemoApp {

    public static void main(String[] args) {
        int counter = 152233354;
        System.out.println(Konto.s_anzahlKonto);
        Konto.s_anzahlKonto =1001;



        Konto cem = new Konto("Cem Ali Ziypak");
       // cem.setInhaber("Cem Ali Ziypak");
        cem.print();

        cem.aufbuchen( 1000);
        cem.print();

        cem.abbuchen(250);
        cem.print();

        cem.aufbuchen(250);
        cem.print();

        cem.abbuchen(100);
        cem.print();

        cem.abbuchen(900);
        cem.print();

        cem.abbuchen(1);

        Konto susi = new Konto("Susi Sorglos");
        susi.print();

        susi.abbuchen( 100);

        Konto ahmet = new Konto("Ahmet Babus");
                ahmet.aufbuchen(55000);
                ahmet.print();
                ahmet.aufbuchen(150000);
                ahmet.print();
                ahmet.abbuchen(15555);
                ahmet.print();
                ahmet.abbuchen(189446);


    }
}
