package Methods;

import java.util.*;

public class MatrixOps1 {
    static int[][] generateMatrix(int r,int c) {
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=(int)(Math.random()*10);
        return m;
    }

    static int[][] add(int[][] a,int[][] b) {
        int r=a.length,c=a[0].length; int[][] res=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) res[i][j]=a[i][j]+b[i][j];
        return res;
    }

    static int[][] subtract(int[][] a,int[][] b) {
        int r=a.length,c=a[0].length; int[][] res=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) res[i][j]=a[i][j]-b[i][j];
        return res;
    }

    static int[][] multiply(int[][] a,int[][] b) {
        int r=a.length,c=b[0].length,n=b.length; int[][] res=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) for(int k=0;k<n;k++) res[i][j]+=a[i][k]*b[k][j];
        return res;
    }

    static void printMatrix(int[][] m) {
        for(int[] row:m){for(int v:row) System.out.print(v+" ");System.out.println();}
    }

    public static void main(String[] args) {
        int[][] a=generateMatrix(2,2);
        int[][] b=generateMatrix(2,2);
        printMatrix(a); System.out.println();
        printMatrix(b); System.out.println();
        printMatrix(add(a,b)); System.out.println();
        printMatrix(subtract(a,b)); System.out.println();
        printMatrix(multiply(a,b));
    }
}
