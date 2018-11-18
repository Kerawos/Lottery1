package pl.mareksowa;

import java.util.Random;

public class Lottery {

    private String name;
    private String[] names;

    public Lottery(String name, int lengthOfNames) {
        this.name = name;
        this.names = new String[lengthOfNames];
    }

    public String getLottery(){
        Random rnd = new Random();
        int lengthOfNames = getNames().length;
        int randowmNumber = rnd.nextInt(lengthOfNames);
        return getNames()[randowmNumber];
    }

    public void addPlayer(String nameOfPlayer){
        for (int i = 0; i < getNames().length; i++) {
            if (getNames()[i]==null){
                getNames()[i] = nameOfPlayer;
                break;
            }
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

}
