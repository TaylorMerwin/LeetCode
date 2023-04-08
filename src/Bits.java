/*
LeetCode problem 191 Number of 1 Bits
https://leetcode.com/problems/number-of-1-bits/
 */

public class Bits {

  public static void main(String[] args) {

    int ex1 = 00000000000000000000000000001011;
    int ex2 = 00000000000000000000000010000000;
    int ex3 = -3;

    System.out.println(hammingWeight(ex1)); //should return 3
    System.out.println(hammingWeight(ex2)); //should return 1
    System.out.println(hammingWeight(ex3)); //should return 31
  }

  public static int hammingWeight(int n) {
    int result = 0;
    String bin = Integer.toBinaryString(n);
    //now we have a string, we can loop through it, checking each value for a 1

  for (int i = 0; i < bin.length(); i++) {
    if (bin.charAt(i) == '1') {
      result++;
    }
  }
    return result;
  }

}
