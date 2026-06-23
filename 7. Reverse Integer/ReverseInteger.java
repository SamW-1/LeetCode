public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x) {
        String str = Integer.toString(x);
        String rev = "";
        if (str.charAt(0) == '-') { rev+='-'; str = str.substring(1, str.length()); }
        for (int i = str.length()-1; i >= 0;i--) {
            rev += str.charAt(i);
        }
        try {
            return Integer.parseInt(rev);
        } catch (Exception e) { 
            return 0;       }
        
    }
}