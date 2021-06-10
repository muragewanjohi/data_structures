package HashTables;

import java.util.HashMap;
import java.util.Map;

public class HashTable {

    Map<String,String>exercise  = new HashMap<String, String>();


    public void addData(){

        Map<String, String> phoneBook = new HashMap<String, String>();
        phoneBook.put("Sally Smart", "555-9999");
        phoneBook.put("John Doe", "555-1212");
        phoneBook.put("J. Random Hacker", "555-1337");


        Map<String,String>appartment  = new HashMap<String, String>();
        appartment.put("C2","Murage");

    }

    public void addExercise(String key, String value){
        exercise.put(key,value);
    }
    public void getExercise(String key){
        System.out.println(exercise.get(key));
    }
}
