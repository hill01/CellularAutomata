
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
}
