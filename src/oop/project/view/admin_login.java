package automobile.rentals.View;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
 
public class admin_login extends JFrame{
    public admin_login(){
        setSize(1450,900);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        
//        logo
        ImageIcon logo_image=new ImageIcon(getClass().getResource("/images/logo.jpg"));
        Image original_logo_image=logo_image.getImage();
        Image resized_logo_image= original_logo_image.getScaledInstance(260, 190,Image.SCALE_SMOOTH);
        ImageIcon complete_logo_image=new  ImageIcon(resized_logo_image);
        JLabel logo_image_label= new JLabel(complete_logo_image);
        logo_image_label.setBounds(1090,0,260,190);
        add(logo_image_label);
        
//        login_ image
        ImageIcon login_image=new ImageIcon(getClass().getResource("/images/login.jpg"));
        Image original_login_image=login_image.getImage();
        Image resized_login_image= original_login_image.getScaledInstance(1000, 900,Image.SCALE_SMOOTH);
        ImageIcon complete_login_image=new  ImageIcon(resized_login_image);
        JLabel login_image_label= new JLabel(complete_login_image);
        login_image_label.setBounds(0,0,1000,900);
        add(login_image_label);
        
        JLabel login_text=new JLabel("LOGIN");
        login_text.setForeground(new Color(52,147,29));
        login_text.setFont(new Font("AERIAL", Font.PLAIN,38));
        login_text.setBounds(1170,200,300,60);
        add(login_text);
        
        
        JLabel username_text=new JLabel("Username");
        username_text.setForeground(new Color(0,0,0));
        username_text.setFont(new Font("AERIAL", Font.PLAIN,20));
        username_text.setBounds(1115,285,300,60);
        add(username_text);
        
        JLabel passwords_text=new JLabel("Password");
        passwords_text.setForeground(new Color(0,0,0));
        passwords_text.setFont(new Font("AERIAL", Font.PLAIN,20));
        passwords_text.setBounds(1115,385,300,60);
        add(passwords_text);
        
        JTextField username_field = new JTextField();
        username_field.setBounds(1110,330, 250, 45);
        add(username_field);
        
        JPasswordField password_field=new JPasswordField();
        password_field.setBounds(1110,430,250,45);
        
        add(password_field);
        
        
        JButton login_button=new JButton("Login");
        login_button.setBounds(1150,540,150,45);
        add(login_button);
        
        
        
        
        
        
        
        
        
        
        setVisible(true);
        
        
    }
    
 
 
//public static void main(String[] args){
//    admin_login login=new admin_login();
//    login.
//}
}
