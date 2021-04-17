package Projects;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {

        Scanner reader = new Scanner(System.in);
        int s1=0,s2=1,s3,i,n;
        System.out.print("Gormek Istediginiz Sayı Adedini Girin:");
        n = reader.nextInt();
        System.out.print(s1+" "+s2);

        for(i=2;i<n;++i)
        {
            s3=s1+s2;
            System.out.print(" "+s3);
            s1=s2;
            s2=s3;
        }
        System.out.println();
    }
}
