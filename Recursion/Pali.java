public class Pali {
    
        static boolean check(String s, int start, int end){

    if(start >= end){
        return true;
    }

    if(s.charAt(start) != s.charAt(end)){
        return false;
    }

    return check(s, start + 1, end - 1);
}

    
    public static void main(String[] args){
        String str="level";
        System.out.println(check(str,0,str.length()-1));
        
    }
}
