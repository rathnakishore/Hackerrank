import java.util.Scanner;
public class day2q1 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n,i,count=0;
        n=obj.nextInt(); 
        for(i=2;i<n;i++){
            if(n%i==0){
                count++;
            break; 
            }
        }
            if(count==0){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not Prime Number");
            }
        }
    }