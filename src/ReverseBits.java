/*
LeetCode problem 190 Reverse Bits
https://leetcode.com/problems/reverse-bits/
 */
public class ReverseBits {

  public static void main(String[] args) {


    int ex1 = 43261596;
    int ex2 = -3;

    System.out.println(reverseBits(ex1)); //result should be 964176192
    System.out.println(reverseBits(ex2)); //result should be 3221225471
  }

    // you need treat n as an unsigned value
    public static int reverseBits(int n) {

    int reverse = 0;
    //use bitwise operators duh.

      for (int i = 0; i < 32; i++) {
        reverse <<= 1;
        reverse |= (n & 1);
        n >>= 1;
      }
      return reverse;
    }

}
