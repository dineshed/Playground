import java.util.Scanner;
class Main {
	public static void main (String[] args) {
      int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      while(n>=10)
      {
        n/=10;
      }
        System.out.println(n);
      
        
	}
}