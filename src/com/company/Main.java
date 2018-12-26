package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[][] numbers = new int[3][4];
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[0].length; j++){
                numbers[i][j] = i + j;
            }
        }
        System.out.println(numbers[2][3]);
    }
}
