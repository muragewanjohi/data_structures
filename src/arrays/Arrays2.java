package arrays;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Arrays2 {

    int lenght;
    String [] data;

    public Arrays2 (int size){
      data = new String[size];
    }

    public String get(int index){
        return this.data[index];
    }

    public void push(String item){

        if(data.length == lenght){
            String [] new_array = new String[lenght*2];
            for(int array_item=0; array_item< lenght;array_item++){
                new_array[array_item] = data[array_item];
            }
            data = new_array;
        }

        // Add item
        data[lenght++] = item;

        System.out.println("lenght " + this.lenght);

    }
    public void pop(){
        if(lenght>0){

        int newLength = lenght-1;
        String [] poppedArray = new String[newLength];

        for(int i = 0; i< newLength; i++){
            poppedArray[i] = data[i];
        }
        data = poppedArray;

        String lastItem = this.data[lenght-1];

        }
    }
    public void reverseAString(String myString){
        //create an array
        // get characters from the string and put them in the array
        // create a second array
        //from last add items to the new array
        // print items in array

        int count = 0;
        String reverString = null;

        char [] Array1 = new char[myString.length()];

       // for(int i =0;i<myString.length();i++){
          //  char character = myString.charAt(i);
      //      Array1[i] = myString.charAt(i);;
       // }

      //  char character = myString.charAt(i);

        StringBuilder stringBuilder1 = new StringBuilder();

        for(int i =myString.length()-1;i>=0;i--){

            //  char character = myString.charAt(i);
         //   System.out.print(myString.charAt(i));
            Array1[count] = myString.charAt(i);
            count++;
            stringBuilder1.append(myString.charAt(i));
           // reverString = "" + myString.charAt(i);
        }

        System.out.print(stringBuilder1);

    }

    public void mergeArrays(int []array1 ,int []array2 ){

        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);

        Arrays.sort(result);

        System.out.println(Arrays.toString(result));

    }

}
