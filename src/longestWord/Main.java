package longestWord;



public class Main {
	public static String LongestWord(String sen) {
		//Only keep letters and put separate words in an array
		String[] stringSplit = sen.replaceAll("[^a-zA-Z ]+", "").split(" ");
		//Initialise 2 integers, one for storing length of longest word, second for position of the longest word
		int longestWordLength = 0;
		int longestWordPosition = 0;
		//Loop through the split input list to check for each word whether it is longer than the longest currently selected
		for (int i=0;i<stringSplit.length;++i) {
			int wordLength = 0;
			wordLength = stringSplit[i].length();
			if (wordLength > longestWordLength) {
				longestWordLength = wordLength;
				longestWordPosition = i;
	    	}
	    }
		//Set result from the loop in the 'sen' object
	    sen = stringSplit[longestWordPosition];
	    return sen;
	}
    /**
     * @param args
     */

    public static void main(String[] args){
//    	Scanner s = new Scanner(System.in);
    	String textToAnalyze = String.join(" ", args);
        String textOutput = LongestWord(textToAnalyze);
//        s.close();
        System.out.println(textOutput);
    }
}