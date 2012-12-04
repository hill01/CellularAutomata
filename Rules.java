
public class Rules {
	
	//rule number must be between 0-255 inclusive
	public static int[] anyRule(int ruleNumber, int[] previousRow){
		String ruleBinary = Integer.toBinaryString(ruleNumber);
		int[] nextRow = new int[previousRow.length];
		
		//pad to 8 digits
		while(ruleBinary.length() < 8){
			ruleBinary = "0" + ruleBinary;
		}
		
		//borders are always 0
		nextRow[0] = 0;
		nextRow[nextRow.length - 1] = 0;
		for(int i = 1; i < previousRow.length - 1; i++){
			if(previousRow[i-1] == 1 && previousRow[i] == 1 && previousRow[i+1] == 1){
				nextRow[i] = Character.getNumericValue(ruleBinary.charAt(0));
			}else if(previousRow[i-1] == 1 && previousRow[i] == 1 && previousRow[i+1] == 0){
				nextRow[i] = Character.getNumericValue(ruleBinary.charAt(1));
			}else if(previousRow[i-1] == 1 && previousRow[i] == 0 && previousRow[i+1] == 1){
				nextRow[i] = Character.getNumericValue(ruleBinary.charAt(2));
			}else if(previousRow[i-1] == 1 && previousRow[i] == 0 && previousRow[i+1] == 0){
				nextRow[i] = Character.getNumericValue(ruleBinary.charAt(3));
			}else if(previousRow[i-1] == 0 && previousRow[i] == 1 && previousRow[i+1] == 1){
				nextRow[i] = Character.getNumericValue(ruleBinary.charAt(4));
			}else if(previousRow[i-1] == 0 && previousRow[i] == 1 && previousRow[i+1] == 0){
				nextRow[i] = Character.getNumericValue(ruleBinary.charAt(5));
			}else if(previousRow[i-1] == 0 && previousRow[i] == 0 && previousRow[i+1] == 1){
				nextRow[i] = Character.getNumericValue(ruleBinary.charAt(6));
			}else if(previousRow[i-1] == 0 && previousRow[i] == 0 && previousRow[i+1] == 0){
				nextRow[i] = Character.getNumericValue(ruleBinary.charAt(7));
			}
		}
		return nextRow;
	}
	
	public static int[] rule126(int[] previousRow){
		int[] nextRow = new int[previousRow.length];
		
		nextRow[0] = 0;
		for(int i = 1; i < previousRow.length - 1; i++){
			if(previousRow[i - 1] == previousRow[i] && previousRow[i + 1] == previousRow[i]){
				nextRow[i] = 1;
			}else{
				nextRow[i] = 0;
			}
		}
		nextRow[nextRow.length - 1] = 0;
		return nextRow;
	}
	
	public static int[] rule22(int[] previousRow){
		int[] nextRow = new int[previousRow.length];

		nextRow[0] = 0;
		for(int i = 1; i < previousRow.length - 1; i++){
			if(previousRow[i - 1] + previousRow[i] + previousRow[i + 1] == 1){
				nextRow[i] = 1;
			}else{
				nextRow[i] = 0;
			}
		}
		nextRow[nextRow.length - 1] = 0;
		
		return nextRow;
	}
	
	public static int[] rule3(int[] previousRow){
		int[] nextRow = new int[previousRow.length];

		nextRow[0] = 0;
		for(int i = 1; i < previousRow.length - 1; i++){
			if(previousRow[i - 1] == 0 && previousRow[i] == 0){
				nextRow[i] = 1;
			}else{
				nextRow[i] = 0;
			}
		}
		nextRow[nextRow.length - 1] = 0;
		
		return nextRow;
	}
}
