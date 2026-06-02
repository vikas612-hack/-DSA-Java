public class Vowel1 {
    public static void main(String[] args){
        String s="vikas";
        int countV =0 , countC = 0;


        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                countV++;
            }else{
                countC++;
            }
        }
        System.out.println("number of vowels: "+countV);
        System.out.println("number of Consonent: "+countC);
    }
}
