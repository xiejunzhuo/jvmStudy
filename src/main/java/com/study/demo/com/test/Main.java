package com.study.demo.com.test;

import java.util.Scanner;

/**
 * @author 李建成
 * @version 1.0
 * @date 2020/1/12 17:27
 */
public class Main {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int [][]arr1 = new int[n][m];
//        for (int i=0;i<n;i++){
//            for (int j = 0;j<m;j++){
//                arr1[i][j] = sc.nextInt();
//            }
//        }
        int[][] arr1 = {{1,0,1,0},
                {1,1,1,1},
                {1,0,0,0},
                {0,1,0,1},
                {0,0,0,1}};
        int i = Main.countIsland(arr1);

        System.out.println(i);
    }

    public static int countIsland(int[][] arr){
        if (null==arr||arr.length==0||arr[0].length==0){
            return 0;
        }
        int res = 0;
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[0].length;j++){
                if (arr[i][j]==1){
                    change(arr,i,j);
                    res++;
                }
            }
        }
        return res;
    }

    private static void coverIsLand(int [][] arr,int i,int j){
        if (arr[i][j]==0 || i<0 || j<0||i>arr.length||j>arr[0].length) {
            return;
        }
        else {
            arr[i][j]=0;
            coverIsLand(arr,i+1,j);
            coverIsLand(arr,i,j+1);
            coverIsLand(arr,i-1,j);
            coverIsLand(arr,i,j-1);
        }
    }

    public static int[][] change(int[][] grid,int i,int j){
        grid[i][j] = 0;
        if (i>0&& grid[i-1][j]==1){
            grid = change(grid,i-1,j);

        }
        if (j<grid[i].length-1&&grid[i][j+1]==1){
            grid = change(grid,i,j+1);
        }
        if (j>0 && grid[i][j-1]==1){
            grid = change(grid,i,j-1);
        }
        if (i<grid.length-1 && grid[i+1][j]==1){
            grid = change(grid,i+1,j);
        }
        return grid;
    }
}
