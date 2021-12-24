package sampledemo;

public class salesclass {
  public void display() {
	  int[] arr= {22,44,78,56};
	  int sum=0;
	  for(int i=0;i<arr.length;i++) {
		  sum=+arr[i];
		  System.out.println(arr[i]);
	  }
	  System.out.println("arraysize " + arr.length);
	  System.out.println("summation:" + sum);
  }
  public void print() {
	  System.out.println("print all array numbers");
	  display();
  }
}
