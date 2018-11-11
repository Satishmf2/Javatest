/*
1. Write a java program to read a string of comma seperated words
from stdin and put them into array. Here is list of strings looks like
Ford, Tesla, Audi, Honda, GM, GM, Mazda, lincoln

2. Print the array of words one per line

3. Print a new line

4. Sort the array of words and print one per line

5. Remove the duplicates and print one per line

6. Print the first and last element alone

7. Print a subset from 2 to 6

8. Print the length of each element in the treeset
 */

import java.util.*;

public class carfax {
    
    public static void main(String args[]){
        
         print1();
    }

    private static void print1() {
        String s1="Ford,Audi,Tesla,Honda,Honda,GM,GM,Lincoln,Mazda";
        String l1[]=s1.split(",");

        for(String s2:l1){
            System.out.println(" " +s2);

        }


        System.out.println("");
        List<String> l2=new ArrayList();

        for(String s3:l1){
            l2.add(s3);

        }


        Collections.sort(l2);

        for(String s4:l2){
            System.out.println(" " +s4 );
        }

        TreeSet t1=new TreeSet();
        t1.addAll(l2);

        System.out.println("");
        for(Object s5:t1){
            System.out.println(" " +s5);
        }

        //print the length of each word in the treeset

        t1.size();

        Iterator<String> itr = t1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().length());
        }

        System.out.println(" "+t1.first());
        System.out.println(" "+t1.last());

        Set<String> s5=t1.subSet(2,5);
        System.out.println(""+s5);



    }


}
