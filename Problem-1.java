import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of values no be operated");
		int n=sc.nextInt();
		int[] numbers=new int[n];
		System.out.println("Enter  numbers:");
        for (int i= 0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.print("Enter operation (add, subtract, multiply, divide):");
        String op=sc.next();
        double result=0;
        if(op.equalsIgnoreCase("add")){
            for(int i=1;i<n;i++){
                result+=numbers[i];
            }
        }else if(op.equalsIgnoreCase("subtract")){
            for (int i=1;i<n;i++) {
                result-=numbers[i];
            }
        }else if(op.equalsIgnoreCase("multiply")){
            for (int i=1;i<n;i++) {
                result*=numbers[i];
            }
        }else if(op.equalsIgnoreCase("divide")){
            for(inti=1;i<n;i++) {
                if(numbers[i]==0) {
                    System.out.println("error");
                }result/=numbers[i];
            }
        }else{
            System.out.println("Invalid operation");
            }
        System.out.println("Result:"+result);
	}
}
