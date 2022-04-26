package Chapter2;

import java.util.Scanner;

public class NPZvalues {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,c,d,e, negative, positive, zero;
        System.out.print("Enter first number:  ");
        a = input.nextInt();
        System.out.print("Enter second number:  ");
        b = input.nextInt();
        System.out.print("Enter third number:  ");
        c = input.nextInt();
        System.out.print("Enter fourth number:  ");
        d = input.nextInt();
        System.out.print("Enter fifth number:  ");
        e = input.nextInt();
        negative = 0;
        positive = 0;
        zero = 0 ;
        if(a<0){
            negative  += 1;
        }
        if(b<0){
            negative  += 1;
        }
        if(c<0){
            negative  += 1;
        }
        if(d<0){
            negative  += 1;
        }
        if(e<0){
            negative  += 1;
        }
        if(a>0){
            positive  += 1;
        }
        if(b>0){
            positive  += 1;
        }
        if(c>0){
            positive  += 1;
        }
        if(d>0){
            positive  += 1;
        }
        if(e>0){
            positive  += 1;
        }
        if(a==0){
            zero  += 1;
        }
        if(b==0){
            zero  += 1;
        }
        if(c==0){
            zero  += 1;
        }
        if(d==0){
            zero  += 1;
        }
        if(e==0){
            zero  += 1;
        }
        System.out.printf("The Total Number of Negative Numbers are: %d%n", negative);
        System.out.printf("The Total Number of Positive Numbers are:  %d%n", positive);
        System.out.printf("The Total Number of Zeros are:  %d%n", zero);
        input.close();
    }
}
