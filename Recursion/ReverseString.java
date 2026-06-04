public class ReverseString {
    static void Rev(String str,int l){

        if(l < 0){
            return;
        }

        System.out.print(str.charAt(l));
        Rev(str, l-1);

    }
    public static void main(String[] args){
        String s="vikas";
        Rev(s,s.length()-1);
    }
}
