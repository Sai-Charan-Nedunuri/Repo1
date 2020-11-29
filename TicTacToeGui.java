import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TicTacToeGui extends JFrame{
	
	private Container pane;
	private String currentPlayer;
	private JButton [][] board;
	private boolean hasWinner;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem quit;
	private JMenuItem newGame;
	
	public TicTacToeGui() {
		super();
		pane = getContentPane();
		pane.setLayout(new GridLayout(3,3));
		setTitle("Tic Tac Toe");
		setSize(1500,900);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		currentPlayer = "X";
		board = new JButton [3][3];
		hasWinner = false;
		initializeBoard();
		initializeMenuBar();
		
	}
	private void initializeMenuBar() {
		menuBar = new JMenuBar();
		menu = new JMenu("Game Menu");
		newGame = new JMenuItem("New Game");
		newGame.addActionListener(new ActionListener() {
			
			@override
			public void actionPerformed(ActionEvent e) {
				resetBoard();
			} 
		
			
		});
		
		quit = new JMenuItem("Quit The Game");
		quit.addActionListener(new ActionListener() {
			
			@override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
			
		});
		
		menu.add(newGame);
		menu.add(quit);
		menuBar.add(menu);
		setJMenuBar(menuBar);
		
	}
	private void resetBoard() {
		
		currentPlayer = "X";
		hasWinner = false;
		for(int i = 0; i<3 ;i++) {
			for(int j=0;j<3;j++) {
				board[i][j].setText("");
			}
		}
	}
	private void initializeBoard() {
		
		for(int i =0; i<3 ; i++) {
			
			for(int j =0; j<3 ; j++) {
				
				JButton btn = new JButton();
				
				btn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,100));
				board[i][j] = btn;
				btn.addActionListener(new ActionListener() {
					
					@override
					public void actionPerformed(ActionEvent e) {
						if(((JButton)e.getSource()).getText().equals("") && hasWinner == false) {
							btn.setText(currentPlayer);
							hasWinner();
							tooglePlayer();
						}
					}
					
				});
				
				pane.add(btn);
			}
		}
	}
	private void tooglePlayer() {
		if(currentPlayer == "X") {
			currentPlayer = "O";
		}
		else {
			currentPlayer = "X";
		}
	}
	private void hasWinner () {
		
		if(board[0][0].getText().equals(currentPlayer) && board[1][0].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer)) {
			JOptionPane.showMessageDialog(null,"Player" +" "+ currentPlayer +" "+ "Has Won!!!");
			hasWinner = true;
		}
		else if(board[0][1].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer)) {
			JOptionPane.showMessageDialog(null,"Player" +" "+ currentPlayer +" "+ "Has Won!!!");
			hasWinner = true;
		}
		else if(board[0][2].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)) {
			JOptionPane.showMessageDialog(null,"Player" +" "+ currentPlayer +" "+ "Has Won!!!");
			hasWinner = true;
		}
		else if(board[0][0].getText().equals(currentPlayer) && board[0][1].getText().equals(currentPlayer) && board[0][2].getText().equals(currentPlayer)) {
			JOptionPane.showMessageDialog(null,"Player" +" "+ currentPlayer +" "+ "Has Won!!!");
			hasWinner = true;
		}
		else if(board[1][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer)) {
			JOptionPane.showMessageDialog(null,"Player" +" "+ currentPlayer +" "+ "Has Won!!!");
			hasWinner = true;
		}
		else if(board[2][0].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)) {
			JOptionPane.showMessageDialog(null,"Player" +" "+ currentPlayer +" "+ "Has Won!!!");
			hasWinner = true;
		}
		else if(board[0][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)) {
			JOptionPane.showMessageDialog(null,"Player" +" "+ currentPlayer +" "+ "Has Won!!!");
			hasWinner = true;
		}
		else if(board[0][2].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer)) {
			JOptionPane.showMessageDialog(null,"Player" +" "+ currentPlayer +" "+ "Has Won!!!");
			hasWinner = true;
		}
		
	}
	
	

	

}
