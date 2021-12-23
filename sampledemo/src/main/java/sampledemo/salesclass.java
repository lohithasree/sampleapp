package sampledemo;

public class salesclass {
  public void display() {

	  int[] arr= {22,44,78,56};
	  int sum=0;
	  for(int num:arr){
		  sum+=num;
		  System.out.println(num);
  }
	  System.out.println("summation:" + sum);
	   
	  }
  public void print() {
	  System.out.println("print all array numbers");
	  display();
  }
}
