package stringCalculator;

public class StringCalculator {

	private static String delimited[];
	private static String delimiterRegularExpression = "";

	public static int add(String input) {
		int sum = 0;
		if(isNotEmpty(input)){		
			setDelimiterRegularExpression(input);
			delimited = delimitInput(input);
			for( String item : delimited)
				sum += Integer.parseInt(item.toString());
		}
		return sum;
	}

	private static boolean isNotEmpty(String input) {
		return !input.isEmpty();
	}

	private static void setDelimiterRegularExpression(String input) {
		delimiterRegularExpression = "," + "\n";
		if (input.length() > 2)
			if (input.substring(0,2).equals("//"))
				delimiterRegularExpression += input.substring(2,3);
	}
	
	private static String[] delimitInput(String input) {
		String delimited = input;
		if (input.length() > 2)
			if (input.substring(0,2).equals("//")){
				String[] splitInput = input.split("[\n]",2);
				delimited = splitInput[1];
			}
		return delimited.split("[" + delimiterRegularExpression + "]");
	}
}