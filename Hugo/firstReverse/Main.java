package firstReverse;

public class Main {
	  public static String FirstReverse(String str) {
	      String[] stringArray = str.split("");
	      str = "";
	      int startingPoint = stringArray.length - 1;
	      for (int i = startingPoint; i >= 0; i--) {
	          str += stringArray[i];
	      }
	    // code goes here
	    /* Note: In Java the return type of a function and the
	       parameter types being passed are defined, so this return
	       call must match the return type of the function.
	       You are free to modify the return type. */
	    return str;

	  }

  /**
   * @param args
   */

  public static void main(String[] args){
    System.out.println(FirstReverse(args[0]));
      }
  }