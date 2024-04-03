import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class LoginS extends JFrame {
    JLabel l1, l2, l3, l4;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2, b3;

    LoginS(String S1) {
        super(S1);
    }

    LoginS() {

    }

    void setComponents() {
        setLayout(null);
        l1 = new JLabel("Hello User");
        l2 = new JLabel("Username");
        l3 = new JLabel("Password");
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Login");
        b2 = new JButton("Clear");
        b3 = new JButton("Add");
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        l1.setBounds(300, 50, 150, 30);
        l2.setBounds(100, 150, 150, 30);
        l3.setBounds(100, 350, 150, 30);
        l4.setBounds(10, 550, 250, 30);
        t1.setBounds(350, 150, 150, 30);
        t2.setBounds(350, 350, 150, 30);
        b1.setBounds(100, 450, 150, 30);
        b2.setBounds(300, 450, 150, 30);
        b3.setBounds(500, 450, 80, 30);
        b1.addActionListener(new Log());
        b2.addActionListener(new Clear());
        b3.addActionListener(new Add());
    }

    public static void main(String[] args) {
        LoginS s1 = new LoginS("Welcom To My Web");
        s1.setSize(700, 700);
        s1.setVisible(true);
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s1.setComponents();
    }

    class Log implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = t1.getText();
            String s2 = t2.getText();
            if (s1.equals("hari") && s2.equals("om")) {
                l4.setText("Login Successfull");
            } else {
                l4.setText("Login UnSuccessfull");
            }

        }

    }

    class Clear implements ActionListener {
        public void actionPerformed(ActionEvent e2) {
            t1.setText("");
            t2.setText("");
        }

    }

    class Add implements ActionListener {
        public void actionPerformed(ActionEvent e3){
          try{ 
            int a= Integer.parseInt(t1.getText());
           int b= Integer.parseInt(t2.getText());
           int c=a+b;
           l4.setText("The Addition is "+c);
             }
             catch(Exception ex){
                l4.setText("Please Enter the number to Add");
             }
               }
    }

}
