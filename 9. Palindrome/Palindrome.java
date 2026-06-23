public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome2(12321));
        System.out.println(12321 % (10*1));
        //for (int i = 0; i < 10; i++) {
        //    System.out.println(87654321 % 10*i);
        //}
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

    static public boolean isPalindrome2(int x) {
        int count = 0;
        int y = x;
        if (x == 0) { count = 1; }
        else {
            while (y != 0) {
            y /= 10;
            count++;
            }
        }
        count++;
        System.out.println(x);

        for (int i = 1; i < count/2;i++) {
            System.out.println(x % 10*i);
            System.out.println(x % 10*(count-1-i));
            if (x % 10*i != x % 10*(count-1-i)) { return false;}
        }

        return true;
    }
}