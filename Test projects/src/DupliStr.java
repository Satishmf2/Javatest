public class DupliStr {

    public static void main(String args[]){
        String s1="sjk";
        int count=0;
        char[] c1= s1.toCharArray();

        for(int i=0;i<s1.length();i++){
            for(int j=i+1;j<s1.length();j++){
                if (c1[i]==c1[j]){
                     count++;
                     System.out.println(c1[j]);
                }
            }
        }

    }

}
