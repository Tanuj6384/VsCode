import java.util.*;
public class B_Spiral_print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][]arr =new int [row][col];
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int tne=row*col;
        int count=0;
        while(count<tne){
        //Left wall
        for(int i=minr,j=minc;i<=maxr && count<tne; i++){
            System.out.print(arr[i][j]+" ");
            count++;
        }
        minc++;

        // Bottom wall
        for(int i=maxr,j=minc; j<=maxc&& count<tne;j++){
            System.out.print(arr[i][j]+" ");
            count++;
        }
        maxr--;

        // Right wall
        for(int i=maxr, j=maxc;i>=minr && count<tne;i--){
            System.out.print(arr[i][j]+" ");
            count++;
        }
        maxc--;

        // Top wall
        }
        for(int i=minr,j=maxc; j>=minc && count<tne; j--){
            System.out.print(arr[i][j]+" ");
            count++;
        }
        minr++;
    }
}
/*
 4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
ans
1 5 9 13 14 15 16 12 8 4 2 6 10 11 7 3 
 */
