class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode uno = new ListNode(3);
        ListNode dos = new ListNode(4, uno);
        ListNode tres = new ListNode(2, dos);

        ListNode one = new ListNode(4);
        ListNode two = new ListNode(6, one);
        ListNode three = new ListNode(5, two);

        addTwoNumbers(tres, three);
    }
    public static void addTwoNumbers(ListNode l1, ListNode l2) {
        // BRUTE FORCEY TIME
        String num1, num2;
        num1 = ""; num2 = "";
        ListNode current = l1;
        num1 += Integer.toString(current.val);
        while (current.next != null) {
            num1 += Integer.toString(current.next.val);
            current = current.next;
        } 

        current = l2;
        num2 += Integer.toString(current.val);
        while (current.next != null) {
            num2 += Integer.toString(current.next.val);
            current = current.next;
        } 

        String num1Rev = ""; String num2Rev = "";
        for (int i = num1.length()-1; i >= 0; i--) {
            num1Rev += num1.charAt(i);
        }
        for (int i = num2.length()-1; i >= 0; i--) {
            num2Rev += num2.charAt(i);
        }

        int sum = Integer.parseInt(num1Rev) + Integer.parseInt(num2Rev);
        String sumString = Integer.toString(sum);

        //System.out.println(num1Rev + " " + num2);
        //System.out.println(sumString);
        ListNode first = new ListNode(Integer.parseInt(Character.toString(sumString.charAt(0))));
        ListNode[] nodes = new ListNode[sumString.length()];
        nodes[0] = first;
        for (int i = 1; i < sumString.length(); i++) {
            nodes[i] = new ListNode(Integer.parseInt(Character.toString(sumString.charAt(i))), nodes[i-1]);
        }
        
        ListNode node = nodes[nodes.length-1];
        System.out.println(node.val);
        System.out.println(node.next.val);
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }