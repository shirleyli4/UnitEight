package com.company;

public class ThreeByFive {
    public static void main(String [] args) {
    // note...this is a 2x5 int array
    // a 3x5 array is required
        int[][] nums = { {3,6,2,9,7}, {7,45,9,12,44},{0,0,0,0,0} };

    //this output is incomplete for this array
        System.out.println(nums[0][0]);
        System.out.println(nums[0][1]);
        System.out.println(nums[0][2]);
        System.out.println(nums[0][3]);
        System.out.println(nums[0][4]);
        System.out.println(nums[1][0]);
        System.out.println(nums[1][1]);
        System.out.println(nums[1][2]);
        System.out.println(nums[1][3]);
        System.out.println(nums[1][4]);
        System.out.println(nums[2][0]);
        System.out.println(nums[2][1]);
        System.out.println(nums[2][2]);
        System.out.println(nums[2][3]);
        System.out.println(nums[2][4]);

    //change three other values to negative numbers
        nums[1][4] = -4;
        nums[2][4]=-5;
        nums[0][3]=-434;

    //make a statement to create a blank line here
        System.out.println();

    // output all of the numbers again,
        System.out.println(nums[0][0]);
        System.out.println(nums[0][1]);
        System.out.println(nums[0][2]);
        System.out.println(nums[0][3]);
        System.out.println(nums[0][4]);
        System.out.println(nums[1][0]);
        System.out.println(nums[1][1]);
        System.out.println(nums[1][2]);
        System.out.println(nums[1][3]);
        System.out.println(nums[1][4]);
        System.out.println(nums[2][0]);
        System.out.println(nums[2][1]);
        System.out.println(nums[2][2]);
        System.out.println(nums[2][3]);
        System.out.println(nums[2][4]);
    // not just the changed ones

    }
}

