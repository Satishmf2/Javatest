//The vin must be exactly 17 characters long
//It should not contain any individual characters $,#,%,&
//If valid or invalid print the same

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Carfaxq3 {
    private static final String special="$,#,%,&";
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println(" "+input);


        Pattern p=Pattern.compile(special);
        Matcher m=p.matcher(input);
        boolean charfound=m.find();
        if(input.length()==17){

            if (! charfound) {
                System.out.println("VALID");
            }
            else{
                System.out.println("INVALID");
            }

        }
        else{
            System.out.println("INVALID");
        }


    }
}
