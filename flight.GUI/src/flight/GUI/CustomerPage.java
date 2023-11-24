package flight.GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JTable;
import javax.swing.JButton;

public class CustomerPage {

	private JFrame frame;
	private JButton btnNewButton;
	private JSplitPane splitPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerPage window = new CustomerPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CustomerPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("View Current Reservations");
		frame.getContentPane().add(tglbtnNewToggleButton, BorderLayout.NORTH);
		tglbtnNewToggleButton.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent E) {
				if (tglbtnNewToggleButton.isSelected()) {
					tglbtnNewToggleButton.setText("Add new Reservation");
					
					//Switch Tables
				}
				else {
					tglbtnNewToggleButton.setText("View Current Reservations");
					
					//Switch Tables
					
				}
			}
		});
		
		btnNewButton = new JButton("Membership Options");
		frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent E) {			
				new Membership();
			}
		});
		
		splitPane = new JSplitPane();
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		table = new JTable();
		splitPane.setLeftComponent(table);
		
		table_1 = new JTable();
		splitPane.setRightComponent(table_1);
		
	}

}
