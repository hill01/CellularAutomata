
public class Rules {
	
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
