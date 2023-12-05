import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;


public  class LoginPage implements ActionListener {
     JFrame Frame = new JFrame();
     JButton LoginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField UserIDField = new JTextField();
    JPasswordField UserPasswordField = new JPasswordField();
    JLabel UserIdLabel = new JLabel("UserID:");
    JLabel UserPasswordLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel();

    HashMap<String,String> logininfo = new HashMap<String ,String>();
    LoginPage(HashMap<String,String> logininfoOriginal){
        logininfo = logininfoOriginal;

        UserIdLabel.setBounds(50,100,75,25);
        UserPasswordLabel.setBounds(50,110,85,35);

        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,15));

        UserIDField.setBounds(125,100,200,25);
        UserPasswordField.setBounds(125,120,200,25);

        LoginButton.setBounds(125,200,100,25);
        LoginButton.setFocusable(false);
        LoginButton.addActionListener(this);

        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);


        Frame.add(UserIdLabel);
        Frame.add(UserPasswordLabel);
        Frame.add(messageLabel);
        Frame.add(UserIDField);
        Frame.add(UserPasswordField);
        Frame.add(LoginButton);
        Frame.add(resetButton);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setSize(420,420);
        Frame.setLayout(null);
        Frame.setVisible(true);


    }
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==resetButton){
                UserIDField.setText("");
                UserPasswordField.setText("");
            }
            if(e.getSource()==LoginButton){
                String userId = UserIDField.getText();
                String password = String.valueOf(UserPasswordField.getPassword());

                if(logininfo.containsKey(userId)){
                    if(logininfo.get(userId).equals(password)){
                        messageLabel.setForeground(Color.green);
                        messageLabel.setText("Login Successfull");
                        Frame.dispose();
                        WelcomePage welcomepage = new WelcomePage(userId);
                    }
                    else {
                        messageLabel.setForeground(Color.red);
                        messageLabel.setText("failed");
                    }
                }
                else{
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("failed");
                }
            }
    }
}




