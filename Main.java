package HW2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        NewToy newToy = new NewToy();
        newToy.addToy("Панда", 5);
        newToy.addToy("Цапля", 10);
        newToy.addToy("Дракон", 5);
      
        Raffle newRaffle = new Raffle();
        newRaffle.random(newToy);
        newToy.print();
        newRaffle.random(newToy);
        newToy.print();
        newRaffle.random(newToy);
        newToy.print();
        newRaffle.random(newToy);
        newToy.print();
    }
}
