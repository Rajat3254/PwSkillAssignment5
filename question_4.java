import java.util.Scanner;
public class question_4 {
    public static void main(String[] args) {
       int d,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number upto which you want to find armstrong number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum=0;
            int m=i;
            while(m>0){
                d=m%10;
                sum+=d*d*d;
                m=m/10;}
                if(sum==i){
                    System.out.println(i);
                }
            }
        }
    }
    

