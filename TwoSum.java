class TwoSum {
    public static void main (String args[]) {
        System.out.println("Testing");
    }
    public int[] twoSum(int[] nums, int target) {
        // Brute Force Solution: Take each number and add it to every other number in nums
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) { return new int[] {i, j}; }
            }
        }
        return null;
    }
}