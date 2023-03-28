package com.Recursion.Backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean [][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        //allpaths("",board,0,0);

        int [][] path = new int[board.length][board[0].length];
        allpathsPrint("",board,0,0,path,1);
    }
    static void allpaths(String p, boolean[][] maze, int r, int c) {
        if (r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }
        // I am considering this block in the path
        maze[r][c]=false;
        if (r < maze.length-1){ // DOWN
            allpaths(p+'D',maze,r+1,c);
        }
        if (c < maze[0].length-1){ // RIGHT
            allpaths(p+'R',maze,r,c+1);
        }
        if (r>0){ // UP
            allpaths(p+'U',maze,r-1,c);
        }
        if (c>0){ // LEFT
            allpaths(p+'L',maze,r,c-1);
        }
        // this line is where the function will be over
        // so before the function gets removed, also removed the changes that were made by the function
        maze[r][c]=true;
    }


    static void allpathsPrint(String p, boolean[][] maze, int r, int c,int[][] path,int step) {
        if (r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
            for (int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;

        if (r < maze.length-1){ // DOWN
            allpathsPrint(p+'D',maze,r+1,c,path,step+1);
        }
        if (c < maze[0].length-1){ // RIGHT
            allpathsPrint(p+'R',maze,r,c+1,path,step+1);
        }
        if (r>0){ // UP
            allpathsPrint(p+'U',maze,r-1,c,path,step+1);
        }
        if (c>0){ // LEFT
            allpathsPrint( p+'L',maze,r,c-1,path,step+1);
        }

        maze[r][c]=true;
        path[r][c]=0;
    }
}
