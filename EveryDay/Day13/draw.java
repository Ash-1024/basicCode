package Day13;

import java.util.Scanner;

/**
 * 用a画长方形，长为n，宽为[n/2]
 */
public class draw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.nextLine();
        int line=n/2;
        if(n%2!=0){
            line=line+1;
        }
        if(line>2) {
            for (int i = 0; i < n; i++) {
                System.out.print(s);
            }
            System.out.println();
            for(int j=0;j<line-2;j++){
                System.out.print(s);
                for (int k=1;k<n-1;k++){
                    System.out.print("  ");
                }
                System.out.print(s);
                System.out.println();
            }
            for (int i = 0; i < n; i++) {
                System.out.print(s);
            }
        }

    }
}
