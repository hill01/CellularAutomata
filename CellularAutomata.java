import java.awt.BorderLayout;

import javax.swing.JFrame;


public class CellularAutomata {
	public static GridPanel grid;
	public static ControlPanel control;
	
	public static void main(String[] args){
		JFrame frame = new JFrame("Cellular Automata");
		grid = new GridPanel();
		control = new ControlPanel(grid);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(grid, BorderLayout.PAGE_END);
		frame.add(control, BorderLayout.LINE_START);
		frame.pack();
		frame.setVisible(true);
	}
}
