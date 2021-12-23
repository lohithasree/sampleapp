package sampledemo;

public class salesclass {
  public void display() {

	  int[] arr= {22,44,78,56};
<<<<<<< HEAD
	  for(int i=0;i<arr.length;i++)
		  System.out.println(arr);
	  System.out.println("array length" + arr.length);
  } 
=======
	  int sum=0;
	  for(int num:arr){
		  sum+=num;
		  System.out.println(num);
  }
	  System.out.println("summation:" + sum);
	   
	  }
>>>>>>> branch 'master' of https://github.com/lohithasree/sampleapp.git
  public void print() {
	  System.out.println("print all array numbers");
	  display();
  }
}
