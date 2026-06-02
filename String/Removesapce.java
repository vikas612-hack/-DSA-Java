public class Removesapce {
    public static void main(String[] args){
        String s="Hello World Java";
        String rem="";

        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            if(ch != " "){
                rem+=ch;
            }
        }
        System.out.println(rem);
    }
}
