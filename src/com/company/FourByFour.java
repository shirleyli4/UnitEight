package com.company;

public class FourByFour {
    public static void main(String [] args) {
//code to define an initially empty int 2D array,
//minimum size 4x4
        int[][] nums = new int[4][4];

//code to output all original values
        System.out.println(nums[0][0]);
        System.out.println(nums[0][1]);
        System.out.println(nums[0][2]);
        System.out.println(nums[0][3]);

        System.out.println(nums[1][0]);
        System.out.println(nums[1][1]);
        System.out.println(nums[1][2]);
        System.out.println(nums[1][3]);

        System.out.println(nums[2][0]);
        System.out.println(nums[2][1]);
        System.out.println(nums[2][2]);
        System.out.println(nums[2][3]);

        System.out.println(nums[3][0]);
        System.out.println(nums[3][1]);
        System.out.println(nums[3][2]);
        System.out.println(nums[3][3]);

//code to change half the values to even positive numbers
        nums[0][0]=2;
        nums[0][1]=2;
        nums[0][2]=2;
        nums[0][3]=2;

        nums[2][0]=2;
        nums[2][1]=2;
        nums[2][2]=2;
        nums[2][3]=2;

//and the other half to negative odd numbers
        nums[1][0]=-3;
        nums[1][1]=-3;
        nums[1][2]=-3;
        nums[1][3]=-3;

        nums[3][0]=-3;
        nums[3][1]=-3;
        nums[3][2]=-3;
        nums[3][3]=-3;

//code to output a blank line separating output
        System.out.println();

//code to output all array elements
        System.out.println(nums[0][0]);
        System.out.println(nums[0][1]);
        System.out.println(nums[0][2]);
        System.out.println(nums[0][3]);

        System.out.println(nums[1][0]);
        System.out.println(nums[1][1]);
        System.out.println(nums[1][2]);
        System.out.println(nums[1][3]);

        System.out.println(nums[2][0]);
        System.out.println(nums[2][1]);
        System.out.println(nums[2][2]);
        System.out.println(nums[2][3]);

        System.out.println(nums[3][0]);
        System.out.println(nums[3][1]);
        System.out.println(nums[3][2]);
        System.out.println(nums[3][3]);
    }
}

