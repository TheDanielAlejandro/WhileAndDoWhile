package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        for(int i = 1; i != 6; i++){
            System.out.println("Count value is: " + i);
        }

        //Equivalent in while.

        int count = 1;
        while(count !=6){
            System.out.println("Count value is: " + count);
            count ++;
        }

        //Equivalent in do-while but the count ++ is going to be executed at least once.

        count = 1;
        do {
            System.out.println("Count value is: " + count);
            count++;
        }while(count != 6);
        */

        System.out.println(isEvenNumber(2));
        int number = 4;
        int finishNumber = 20;
        int counter = 0;

        while(number <= finishNumber){
            number ++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("is " + number + " an even number? "+ isEvenNumber(number));
            counter ++;
            if(counter == 5){
                break;
            }

            // Modify the while code above
            // Make it also record the total number of even numbers it has found
            // and break once 5 are found
            // and at the end, display the total number of even numbers found
        }
        System.out.println("The total even numbers found: " + counter);
    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            return true;
        }else{
            return false;
        }


    }



}
