/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.Loop;

/**
 *
 * @author Thanh
 */
public class Loop {

    public static void main(String[] args) {
        //System.err.print("test");
        int row;
        int column;
        int[] space = new int[10];
        String[] str = new String[10];
        double[] d = new double[10];
        for (row = 0; row <= 9; row++) {
            System.out.print("Row " + row + " : ");
            for (column = 0; column <= 9; column++) {
                System.out.print(column + " ");
                space[column] = column;
            }
            System.out.print("\n");
        }
    }
}
