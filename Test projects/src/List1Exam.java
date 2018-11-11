import java.util.Arrays;
import java.util.List;

public class List1Exam {
    public static void main(String args[]){
        List<String> l1= Arrays.asList("Dog","Cat","Monkey","Satish");
//        if(l1.contains("Satish")){
//            System.out.println("Good boy");
//        }

        l1.forEach(System.out::println);
//        System.out.println("List: "+l1);
//        List<String> l2=new ArrayList<>();
//
//        for(String s2:l1){
//            System.out.println(" "+s2);
//        }
//
//        l1.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(" "+s);
//            }
//        });

    }
}
