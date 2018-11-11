public class FilterA {
    public static void main(String[] args) {
        String str="AABCDEF";
        char c[]=str.toCharArray();

        for(int i=0;i<str.length();i++){
            if((c[0] | c[1]) == 'A'){
                str.replace('A',' ');
            }
            else{
                
            }
        }

    }
}
