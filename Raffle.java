package HW2;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public class Raffle extends NewToy {
    
    void random(NewToy toys) throws IOException {    
        Random randomizer = new Random();
        List<String> random = toys.get(randomizer.nextInt(toys.size()));
        FileWrite.createFile(random);
        for (Integer key: toys.keySet()) {
            if (toys.get(key) == random) {
                List<String> changeToy = toys.get(key);
                int newQuantity = Integer.parseInt(changeToy.get(1))- 1;
                changeToy.remove(2);
                changeToy.remove(1);
                if (newQuantity == 0) {
                    toys.get(key).clear();
                }
                else{
                    changeToy.add(String.valueOf(newQuantity));
                    changeToy.add("100");
                }
            }
        }
        int summary = 0;
        if (toys.size()>1) {
            for (Integer key: toys.keySet()) {
                List<String> dataValue = toys.get(key);
                int value = Integer.parseInt(dataValue.get(1));
                summary += value;
            }
            for (Integer key: toys.keySet()) {
                List<String> changeToy = toys.get(key);
                changeToy.remove(2);
                Double newFrequency = (double) Math.round((Double.parseDouble(changeToy.get(1))*100)/summary);
                changeToy.add(String.valueOf(newFrequency));
            }
    }
    else{
        List<String> changeToy = toys.get(0);
        changeToy.remove(2);
        changeToy.add("100");        

    }
    }

}