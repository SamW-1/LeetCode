class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(" ".length());
        System.out.println(lengthOfLongestSubstring(" "));
    }
    public static int lengthOfLongestSubstring(String st) {
        int longest = 0;
        for (int front = 0; front < st.length(); front++) {
            for (int rear = st.length()-1; rear >= front; rear--) {
                if (isUnique(st.substring(front, rear+1)) && rear+1-front > longest) { longest = rear+1-front; } 
            }
        }
        return longest;
    }
    public static boolean isUnique(String s) {
        String enc = "";
        for (int i = 0; i < s.length(); i++) {
            if (enc.contains(Character.toString(s.charAt(i)))) { return false; }
            enc += s.charAt(i);
        }
        return true;
    }
}
