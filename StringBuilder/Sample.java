public class Sample {
    public static void main(String[] args){
        String s = "Hello World Java";
        StringBuilder sb =new StringBuilder(s);

        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(ch == ' '){
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb);

    }
}
