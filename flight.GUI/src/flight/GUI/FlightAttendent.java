package flight.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JButton;

public class FlightAttendent extends JPanel{
	private JButton btnNewButton;
	private JSplitPane splitPane;
	private JTable flightTable;
	private JTable seatTable;

	/**
	 * Create the application.
	 */
	public FlightAttendent() {
		setLayout(new BorderLayout(0, 0));
		
		btnNewButton = new JButton("Log Off");
		add(btnNewButton, BorderLayout.SOUTH);
		
		splitPane = new JSplitPane();
		add(splitPane, BorderLayout.CENTER);
		
		flightTable = new JTable();
		splitPane.setLeftComponent(flightTable);
		
		seatTable = new JTable();
		splitPane.setRightComponent(seatTable);
	}

}
