import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;


public class GridPanel extends JPanel{
	private int blockSize = 3; //pixel width and height
	private int gridWidth = 250; //width in blocks
	private int gridHeight = 220; //height in blocks
	private int componentWidth = gridWidth * blockSize; //width of JPanel in pixels
	private int componentHeight = gridHeight * blockSize; //height of JPanel in pixels
	
	public int ruleNumber = 11;	
	public int[] initialRow = new int[gridWidth];
	
	public GridPanel(){
		super();
		setPreferredSize(new Dimension(componentWidth, componentHeight));
		setFocusable(true);
		initialRow[initialRow.length / 2] = 1;
		randomizeInitialRow();
	}
	
	public void paintComponent(Graphics g){
		g.setColor(Color.black);
		
		//fill in the first row
		for(int i = 0; i < gridWidth; i++){
			if(initialRow[i] == 1){
				g.fillRect(i * blockSize, 0, blockSize, blockSize);
			}
		}		
		
		//fill in the rest of the grid
		int[] nextRow = Rules.anyRule(ruleNumber, initialRow);
		for(int i = 1; i < gridHeight; i++){
			for(int j = 0; j < gridWidth; j++){
				if(nextRow[j] == 1){
					g.fillRect(j * blockSize, i * blockSize, blockSize, blockSize);
				}
			}
			nextRow = Rules.anyRule(ruleNumber, nextRow);
		}
	}
	
	private void randomizeInitialRow(){
		Random rand = new Random();
		for(int i = 0; i < initialRow.length; i++){
			initialRow[i] = rand.nextInt(2);
		}
	}
}
