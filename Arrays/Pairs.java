import java.util.*;

class Main {
  public static void main(String[] args) {
    Main mn = new Main();
    int[] intArray = { 3, 7, 11, 15 };
    mn.Pairs(intArray, 18);
    // int[] result = mn.Pairs(intArray,18);
    // System.out.println(Arrays.toString(result));
  }

  // Pairs
  // public int[] Pairs(int[] nums, int target) {
  public void Pairs(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          // return new int[] { i, j };
          System.out.println("(" + i + "," + j + ")");
        }
      }
    }
    // throw new IllegalArgumentException("No solution found!!");
  }
}