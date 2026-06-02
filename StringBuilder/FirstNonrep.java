public class FirstNonrep {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("aabbcde");

        for (int i = 0; i < sb.length(); i++) {
            int count = 0;

            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(i) == sb.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First Non-Repeating Character: " + sb.charAt(i));
                break;
            }
        }
    }
}