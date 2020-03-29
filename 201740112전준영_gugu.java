package gugudan;


import java.util.*; 

public class Gugudan {

	  public static void main(String[] ar) {
		  int n;
		  int i = 1;
		  
		  System.out.print("盔窍绰 备备窜阑 涝仿窍矫坷:");
		  
		  Scanner scan = new Scanner(System.in);
		  
		  n = scan.nextInt();
		  
		  while (i <= 9){ 
			  System.out.println(n + "*"+ i + "=" +n* i);
			  i++;
		  }
	  }
}
