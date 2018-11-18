package pl.mareksowa;

import java.util.Random;

public class Lottery {

    String name;
    String[] names;

    public Lottery(String name, String[] names) {
        this.name = name;
        this.names = names;
    }

    public String getLottery(){
        Random rnd = new Random();
        int lengthOfNames = this.names.length;
        int randowmNumber = rnd.nextInt(lengthOfNames);
        return this.names[randowmNumber];
    }

}
