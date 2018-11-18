package pl.mareksowa;

public class Main {

    public static void main(String[] args) {

        Lottery lotRun2 = new Lottery("Drugie Losowanie", 8);
        lotRun2.addPlayer("Michal");
        lotRun2.addPlayer("Piotr");
        lotRun2.addPlayer("Kasia");
        lotRun2.addPlayer("Agata");
        lotRun2.addPlayer("Ania");
        lotRun2.addPlayer("Piotrek");
        lotRun2.addPlayer("Marek");
        lotRun2.addPlayer("Oskar");

        System.out.println("Wygrywa: " + lotRun2.getLottery() + "! Bravo ty!");





        //Lottery lotRun1 = new Lottery("Loteria testowa", names);
        //System.out.println("Wygrywa: " + lotRun1.getLottery() + "! Bravo ty!");
    }
}
