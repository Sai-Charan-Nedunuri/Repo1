import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			@override
			public void run() {
				new TicTacToeGui();
			}
		});
		

	}

}
