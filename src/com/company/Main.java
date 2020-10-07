package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
	    int matrice[][] = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if (i + j == N-1){
                    matrice[i][j] = 1;
                }
                else if (i + j < N){
                    matrice[i][j] = 0;
                }
                else {
                    matrice[i][j] = 2;
                }
            }
        }
        for(int m = 0; m < N; m++){
            for(int z = 0; z < N; z++){
                System.out.print(matrice[m][z] + " ");
            }
            System.out.println();
        }
    }
}
