import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class create implements JFrame{
    JPanel panel;
    JLabel user_label, password_label, message;
    JTextField userName_text;
    JPasswordField password_text;
    JButton submit, cancel;
    
    public create(){
        
        // Username Label
        user_label = new JLabel();
        user_label.setText("User Name :");
        user_label.setBounds(100, 8, 70,20);
        userName_text = new JTextField();
        userName_text.setBounds(100, 27, 193, 28);

        // Password Label
        password_label = new JLabel();
        password_label.setText("Password :");
        password_label.setBounds(100, 55, 70, 20);
        password_text = new JPasswordField();
        password_text.setBounds(100, 75, 193, 28);

        // Submit
        submit = new JButton("SUBMIT");
        submit.setBounds(100, 110, 90, 25);
        submit.setForeground(Color.WHITE);
        submit.setBackground(Color.BLACK);

        panel = new JPanel(null);
        panel.add(user_label);
        panel.add(userName_text);
        panel.add(password_label);
        panel.add(password_text);
        message = new JLabel();
        message.setBounds(100, 130, 90, 25);
        panel.add(message);
        panel.add(submit);
        panel.add(create);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Adding the listeners to components..
        submit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                String userName = userName_text.getText();
                String password = new String(password_text.getPassword());
                


                //Add User to database//////////////////////////////////////////////////////////////////////

                
            }
        });

        create.addActionListener(new ActionListener() {
            
        });
        add(panel, BorderLayout.CENTER);
        setTitle("Please Create account Here !");
        setSize(450,350);
        setVisible(true);
    }
}
