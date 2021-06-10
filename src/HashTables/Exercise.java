package HashTables;

import java.util.Arrays;
import java.util.HashMap;

public class Exercise {

    //Google Question
//Given an array = [2,5,1,2,3,5,1,2,4]:
//It should return 2

//Given an array = [2,1,1,2,3,5,1,2,4]:
//It should return 1

//Given an array = [2,3,4,5]:
//It should return undefined

    public String returnPair( int [] array){

        String value = "undefined";
        //compare first number with second number
        //take the two numbers and compare them with the 3rd number

        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

        if(array[0]==array[1]){

         return value = String.valueOf(array[0]);

        }

        for (int i=0;i<array.length;i++){

            if(hash_map.containsKey(array[i])){

                System.out.println("Key " + array[i]);

                return value = String.valueOf(array[i]);

            }

            hash_map.put(array[i],"" );

        }

       return value;
    }
}
