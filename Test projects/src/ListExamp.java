import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Condition;

public class ListExamp{

    public static void main(String args[]){
        List<Persons> ls= Arrays.asList(
                new Persons("s1", "c2","chennai"),
                new Persons("s1", "d2","chennai"),
                new Persons("s1", "e2","chennai"),
                new Persons("c1", "f2","chennai"),
                new Persons("c4", "g2","chennai"),
                new Persons("s1", "c5","chennai")
        );

        Collections.sort(ls, new Comparator<Persons>(){

            @Override
            public int compare(Persons o1, Persons o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }


        });

        printAll1(ls);
        printAllfirstc(ls);
        printConditionally(ls, new Condition1() {
            @Override
            public boolean test(Persons p) {
                return p.getLastName().startsWith("C");
            }
        });


        printConditionally(ls, new Condition1() {
            @Override
            public boolean test(Persons p) {
                return p.getFirstName().startsWith("C");
            }
        });

        //You need to pass a behaviour that gets passed into the method
        //An object must be acting as a filter
    }

    private static void printConditionally(List<Persons> ls,Condition1 cond) {
        System.out.println("First name with C");
        for(Persons p:ls){
             if(cond.test(p)){
                 System.out.println(p);
             }
         }


    }

    private static void printAll1(List<Persons> ls) {
        for(Persons p1:ls) {
            System.out.println("" + p1);
        }

    }

    private static void printAllfirstc(List<Persons> ls) {
        System.out.println();
        for(Persons p1:ls) {
            if(p1.getLastName().startsWith("c")){
            System.out.println("" + p1);}
        }

    }



    }

    interface Condition1{

    boolean test(Persons p);

    }

