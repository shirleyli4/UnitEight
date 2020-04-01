package com.company;

public class TwoDArrays {
    public static int maxValue(int[][] arr){
        int max = arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
    public static int sumAll(int[][] arr){
        int ret=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                ret+=arr[i][j];
            }
        }
        return ret;
    }

    public static boolean isSquare(int[][]arr){
        boolean ret=true;
        if(arr.length!=arr[0].length){
            ret=false;
        }
        return ret;
        /*
        int row=0;
        int col=0;
        for(int i=0;i<arr.length;i++){
            row++;
            for(int j=0;j<arr[0].length;j++){
               col++;
            }
        }
        if(row!=col){
            ret=false;
        }
        return ret;

         */
    }
}
