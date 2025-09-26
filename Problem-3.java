import java.util.Scanner;

public class Problem-3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int limit;
        if(a%2==0) {
            limit=a-1; 
        }else{
            limit=a;
        }
        for(int i=1;i<=limit;i+=2) {
            System.out.print(i);
            if(i+2<=limit) {
                System.out.print(",");
            }
        }
    }
}
