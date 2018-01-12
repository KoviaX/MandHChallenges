package test2;



public class Main {
	  public static int FirstFactorial(int num) {
		  if(num >= 0) {
		      int factorialOutput = 1;
		      for (int i = 1; i<=num;++i) {
		          factorialOutput *= i;
		      }
		      num = factorialOutput;
	    // code goes here
	    /* Note: In Java the return type of a function and the
	       parameter types being passed are defined, so this return
	       call must match the return type of the function.
	       You are free to modify the return type. */

		      return num;
		  }
		  else {
			  num = -1;
			  return num;
		  }

	  }

    /**
     * @param args
     */

    public static void main(String[] args){
    	int toInt = Integer.parseInt(args[0]);
        int textOutput = FirstFactorial(toInt);
        if (textOutput == -1) {
        	System.out.println("No negative numbers allowed");
        } else {
        System.out.println(textOutput);
        }
    }
}