public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12));
    }
    // Brute Force
    static public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        String res = "";
        for (int i = s.length()-1; i >= 0;i--) {
            res += s.charAt(i);
        }

        if (s.equals(res)) { return true;}
        return false;
    }
}