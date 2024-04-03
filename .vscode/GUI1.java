import javax.swing.*;
class Hari extends JFrame{
    Hari(String s1){
        super(s1);
    }
void setComponents(){
    JLabel T1=new JLabel("hariom");
    add(T1);
    setLayout(null);
    T1.setBounds(200,200,100,30);
}
}
class GUI1{
    public static void main(String [] args){
       Hari j1=new Hari("WELCOME TO HARIWORLD");
       j1.setComponents();
        j1.setVisible(true);
        j1.setSize(800,800);
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}