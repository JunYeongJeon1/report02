package gugudan;


import java.util.*; 

public class Gugudan {

	  public static void main(String[] ar) {
		  int n;
		  int i = 1;
		  
		  System.out.print("���ϴ� �������� �Է��Ͻÿ�:");
		  
		  Scanner scan = new Scanner(System.in);
		  
		  n = scan.nextInt();
		  
		  while (i <= 9){ 
			  System.out.println(n + "*"+ i + "=" +n* i);
			  i++;
		  }
	  }
}