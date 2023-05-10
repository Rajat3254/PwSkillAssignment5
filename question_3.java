import java.util.Scanner;
public class question_3 {
    public static void main(String[] args){
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number whom you want the factorial:");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("the factorial of"+n+"is 0");
        }else if(n>0){
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("The factorial of "+n+" "+"is "+fact);
    }else{
        System.out.println("factorial doesn't exist");
    }
}
}
