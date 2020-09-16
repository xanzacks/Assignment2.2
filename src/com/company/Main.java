package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static class mycard{
        String first;// the input value
        String second;// the output value

        public mycard(String first, String second){//constructor
            this.first = first;
            this.second = second;
        }

        public boolean findfirst(String search){//if found, return true
            if (search.equals(first)){
                return true;
            }
            else{
                return false;
            }
        }

        public String returnsecond(){
            return second;
        }

    }

    public static class mydeck{//Mydeck class contains an arraylist which uses mycard class as its datatype
        ArrayList<mycard> mycardArrayList = new ArrayList<mycard>(0);

        public mydeck(){//default constructor to create the arraylist
            mycardArrayList.add(0, new mycard("A", "Ace"));
            mycardArrayList.add(1, new mycard("2", "Two"));
            mycardArrayList.add(2, new mycard("3", "Three"));
            mycardArrayList.add(3, new mycard("4", "Four"));
            mycardArrayList.add(4, new mycard("5", "Five"));
            mycardArrayList.add(5, new mycard("6", "Six"));
            mycardArrayList.add(6, new mycard("7", "Seven"));
            mycardArrayList.add(7, new mycard("8", "Eight"));
            mycardArrayList.add(8, new mycard("9", "Nine"));
            mycardArrayList.add(9, new mycard("10", "Ten"));
            mycardArrayList.add(10, new mycard("J", "Jack"));
            mycardArrayList.add(11, new mycard("Q", "Queen"));
            mycardArrayList.add(12, new mycard("K", "King"));
            mycardArrayList.add(13, new mycard("D", "Diamond"));
            mycardArrayList.add(14, new mycard("H", "Heart"));
            mycardArrayList.add(15, new mycard("S", "Spades"));
            mycardArrayList.add(16, new mycard("C", "Club"));
        }

        public String find(String input){
            for(int i = 0; i < mycardArrayList.size(); i++){
                //if found, return the String
                if(mycardArrayList.get(i).findfirst(input)){
                    return mycardArrayList.get(i).returnsecond();
                }
            }
            //if nothing has been found, exit
            System.out.println("There is something wrong! exiting...");
            System.exit(2);
            return "There is something wrong!";
        }
    }

    public static void main(String[] args) {
	// write your code here
        mydeck myobj = new mydeck();
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Please input the message you would like to translate, press E to quit");
        String i = "0";
        i = inputObj.nextLine();
        while(!i.equals("E")){
            String first;
            String second;
            if(i.charAt(1) == '0'){//when the first input is ten
                first = i.substring(0,2);
                second = i.substring(2,3);
                System.out.print(myobj.find(first.toUpperCase()) + " of " + myobj.find(second.toUpperCase()) + "\n");
            }
            else{//other cases
                first = i.substring(0,1);
                second = i.substring(1,2);
                System.out.print(myobj.find(first.toUpperCase()) + " of " + myobj.find(second.toUpperCase()) + "\n");
            }
            System.out.println("Please input the next message or press E to exit");
            i = inputObj.nextLine();
        }
    }
}
