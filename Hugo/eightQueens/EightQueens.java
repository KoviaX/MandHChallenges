package eightQueens;

public class EightQueens {
	  public static String eightQueens(String[] strArr) {
		  //System.out.println(strArr[1]);
		  //First convert the string array into a two dimensional array of integers
		  int [][] intArray = new int [8][2];
		  for (int i = 0;i < 8;i++) {
			  //Create entries in the new array
			  //X-coordinate
			  char coordinateToAdd = strArr[i].charAt(1);
			  intArray [i][0] = Character.getNumericValue(coordinateToAdd);
			  //Y-coordinate
			  coordinateToAdd = strArr[i].charAt(3);
			  intArray [i][1] = Character.getNumericValue(coordinateToAdd);
		  }
		  //With the array constructed, test any of the separate entries (except itself) for:
		  	//Match in one of the two values (i.e. {4,5} and {4,8} or {1,3} and {6,3})
		  	//The absolute value of a subtraction leads to 2 values that are the same (i.e. {3,6} and {5,4} gives {-2,2}, absolute value of that results in {2,2}, thus a match on the diagonal)
		  for (int i = 0;i < 8;i++) {
			  //Determine which coordinate to test
			  int xCoordToTest = intArray[i][0];
			  int yCoordToTest = intArray[i][1];
			  TESTING_LOOP:for (int j = 0;j < 8;j++) {
				  //Test coordinate against other coordinates for collisions
				  int xCollisionCoord = intArray[j][0];
				  int yCollisionCoord = intArray[j][1];
				  if (xCoordToTest == xCollisionCoord && yCoordToTest == yCollisionCoord) {
					  continue TESTING_LOOP;
				  }
				  int xSubtractResult = Math.abs(xCoordToTest - xCollisionCoord);
				  int ySubtractResult = Math.abs(yCoordToTest - yCollisionCoord);
				  if (xCoordToTest == xCollisionCoord || yCoordToTest == yCollisionCoord || xSubtractResult == ySubtractResult) {
						return ("(" + xCoordToTest + "," + yCoordToTest + ")");
				  }
			  }

		  }
		  return "true";
	  }

/**
 * @param args
 */

public static void main(String[] args){
  System.out.println(eightQueens(args));
    }
}