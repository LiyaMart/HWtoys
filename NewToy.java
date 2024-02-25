package HW2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class NewToy {

    HashMap<Integer, List<String>> toys = new HashMap<>();
    
    public void addToy(String name, int quantity){
        int id = toys.size();
        int summary = 0;
        int frequency = 100;
        List<String> toysData = new ArrayList<>();
        toysData.add(name);
        toysData.add(String.valueOf(quantity));
        toysData.add(String.valueOf(frequency));
        toys.put(id, toysData);
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
    }

    
    public int size() {
        return toys.size();
    }

    public List<String> get(int i) {
        return toys.get(i);
    }


    public Set<Integer> keySet() {
      return toys.keySet();
    }

    void print(){
        System.out.println(toys);
    }
}
