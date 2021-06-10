package arrays;

import java.util.Arrays;

public class Array {

    int [] items;
    int count;

    public Array(int length){

        items = new int [length];

    }

    public void print(){

        for(int i=0; i< count; i++){
            System.out.println(items[i]);
        }
    }

    public void addItem(int item){

        if(items.length == count){
            int [] new_array = new int[count*2];
          //  for(int array_item: items){
                for(int array_item=0; array_item< count;array_item++){
                new_array[array_item] = items[array_item];
            }
            items = new_array;
        }

        // Add item
        items[count++] = item;

    }

    public void binarySearch(){

        byte byteArr[] = {10,20,15,21,35,10,20,15,22,35};
        char charArr[] = {'g','p','q','c','i'};
        int intArr[] = {10,20,15,22,35,10,20,15,22,36};
        double doubleArr[] = {10.2,15.1,2.2,3.5};
        float floatArr[] = {10.2f,15.1f,2.2f,3.5f};
        short shortArr[] = {10,20,15,22,35};

        Arrays.sort(byteArr);
        Arrays.sort(charArr);
        Arrays.sort(intArr);
        Arrays.sort(doubleArr);
        Arrays.sort(floatArr);
        Arrays.sort(shortArr);

        byte byteKey = 4;
        char charKey = 'g';
        int intKey = 22;
        double doubleKey = 1.5;
        float floatKey = 35;
        short shortKey = 5;

        System.out.println( intKey + "Fount at " +
                Arrays.binarySearch(intArr, intKey));
        System.out.println(byteKey + " found at index = "
                +Arrays.binarySearch(byteArr,byteKey));
        System.out.println(charKey + " found at index = "
                +Arrays.binarySearch(charArr,charKey));

        System.out.println(doubleKey + " found at index = "
                +Arrays.binarySearch(doubleArr,doubleKey));
        System.out.println(floatKey + " found at index = "
                +Arrays.binarySearch(floatArr,floatKey));
        System.out.println(shortKey + " found at index = "
                +Arrays.binarySearch(shortArr,shortKey));
    }

    public void deleteItemAtIndex(int index){
       /* Arrays.sort(items);
        int index = Arrays.binarySearch(items,index);*/

        System.out.println("Size of array before deleting " + items.length);

        // check index
        if(index<0 || index>=count)
            System.out.println("Index out of bound " + index);

        //copy items from right to left
        for(int i =index; i<=count;i++)
        items[i] = items[i +1];

        //resize array
        count--;
        int [] new_array = new int[count];
        for(int i = 0; i< count; i++){
            new_array[i] = items[i];
        }

        items = new_array;

        System.out.println("Index " + index);

        System.out.println("Size of array after deleting " + items.length);

    }

    public void search(int item){

        Arrays.sort(items);

       int index = Arrays.binarySearch(items,item);
        System.out.println("Index " + index);


    }

    public void pairArrays(){
        int [] small_array = {1,2,3,4,5};
        Integer next = 0;
        Integer current = 0;
        while (next <small_array.length){

            System.out.println("Pairs "  + small_array[current] + " " + small_array[next]);
            next++;

            if(next.equals(small_array.length)){

                if(current.equals(small_array.length - 1)){

                    System.out.println("Exit Current "  + current + " Next " + next);
                    return;
                }

                    System.out.println(" Current "  + current + " Next " + next);
                    current++;
                    next = 0;

            }

        }
    }

    public void pairArrays2(){
        int [] small_array = {1,2,3,4,5};

        for(int i=0;i<small_array.length;i++){

            for(int j=0;j<small_array.length;j++){

                System.out.println(" Pairs "  + small_array[i] + " " + small_array[j]);

            }

        }
    }
}
