import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Form {

    Form() {

        JFrame frame = new JFrame();
        JLabel Name = new JLabel("Name:");
        frame.setLayout(null);

        JTextArea txt = new JTextArea();
        JTextArea txt2 = new JTextArea();
        JLabel SecondName = new JLabel("Email:");
        JPasswordField pass = new JPasswordField();
        JLabel Password = new JLabel("Password:");
        JLabel gender = new JLabel("Gender:");
        JRadioButton rbtn = new JRadioButton("Male");
        JRadioButton rbtn2 = new JRadioButton("Female");
        JButton btnSubmit = new JButton("SignUp");
        gender.setBounds(50, 135, 100, 30);
        rbtn2.setBounds(30, 110, 100, 100);
        SecondName.setBounds(55, 73, 100, 30);
        rbtn.setBounds(100, 110, 110, 100);
        Password.setBounds(32, 105, 70, 30);
        txt.setBounds(100, 50, 100, 20);
        txt2.setBounds(100, 80, 100, 20);
        Name.setBounds(55, 45, 90, 30);
        pass.setBounds(100, 110, 100, 20);
        rbtn.setBounds(100, 142, 60, 20);
        rbtn2.setBounds(160, 142, 80, 20);
        btnSubmit.setBounds(80, 180, 100, 30);
        frame.add(btnSubmit);
        frame.add(gender);
        frame.add(SecondName);
        frame.add(Password);

        frame.add(txt);
        frame.add(rbtn);
        frame.add(rbtn2);
        frame.add(txt2);
        frame.add(Name);
        frame.add(pass);

        frame.setSize(300, 300);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Form();
    }
}
