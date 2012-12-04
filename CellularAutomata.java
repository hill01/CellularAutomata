import javax.swing.JFrame;


public class CellularAutomata {
	public static GridPanel grid = new GridPanel();
	
	public static void main(String[] args){
		JFrame frame = new JFrame("Cellular Automata");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(grid);
		frame.pack();
		frame.setVisible(true);
	}
}
