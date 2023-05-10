import java.util.Scanner;
public class question_1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("upto how many terms you want to print the fibonacci series:");
        int n=sc.nextInt();
        int a,b,c;
        a=0;
        b=1;
        for(int i=1;i<=n;i++){
           c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}