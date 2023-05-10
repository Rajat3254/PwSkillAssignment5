import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class question_2 {
    public static void main(String[] args){
       int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("how many no. you want to enter:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            if(x>=0){
                sum+=x;
            }else{
                sum=-1;
                break;
            }
         }
         System.out.println(sum);
    }
    
}
