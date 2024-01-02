import java.awt.event.*;
import javax.swing.*;
public class Oasis_Infobyte_task_2 implements ActionListener {
    private JFrame frame;
    private  JTextField user_input;
    private JButton check;
    private JLabel info,no_of_attempts;
    private int attempt=1;
    int actual_number=(int)(Math.random()*100)+1;
Oasis_Infobyte_task_2(){
    frame=new JFrame();
    frame.setSize(400,400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    info=new JLabel("Guess the number");
    info.setBounds(125,50,150,25);
    frame.add(info);
    user_input=new JTextField();
    user_input.setBounds(100, 80, 160, 25);
    frame.add(user_input);
    check=new JButton("Check");
	check.setBounds(125,125,80,25);
	frame.add(check);
	check.addActionListener(this);
    no_of_attempts=new JLabel("Remaining attempts : "+(attempt+1));
    no_of_attempts.setBounds(100,150,150,25);
    frame.add(no_of_attempts);
    frame.setVisible(true);
}
public void actionPerformed(ActionEvent e){
     int flag=0;
    System.out.println("Actual number "+actual_number);
    String str=user_input.getText();
    for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        if(c>=48 && c<=57){
           continue;
        }
        else{
            flag++;
            break;
        }
    }
    int Guessed_number=Integer.parseInt(user_input.getText());
    if(attempt!=0){
         attempt--;
        no_of_attempts.setText("Remaining attempts "+(attempt+1));
        //System.out.println(attempt);
    if(flag==0){
     if(Guessed_number==actual_number){
        JOptionPane.showMessageDialog(frame, "You won!!");
         JOptionPane.showMessageDialog(frame, "Game has Over\n\t"+" Wanna play again?");
       frame.setVisible(false);
       new Oasis_Infobyte_task_2();
    }
    else if ((Guessed_number+10>=actual_number)&&(Guessed_number<=actual_number) || (Guessed_number-10<=actual_number)&&(Guessed_number>actual_number)){
        JOptionPane.showMessageDialog(frame, "Your almost near\nRetry?");
         user_input.setText("");
    }
    else if(Guessed_number<actual_number){
        JOptionPane.showMessageDialog(frame, "Its too low\nRetry?");
         user_input.setText("");
    }
    else if(Guessed_number>actual_number){
        JOptionPane.showMessageDialog(frame, "Its too high\nRetry?");
         user_input.setText("");
    }}
    else{
      JOptionPane.showMessageDialog(frame, "Enter a valid number");
      user_input.setText("");
    }}
    else{
        if(Guessed_number==actual_number){
        JOptionPane.showMessageDialog(frame, "You won!!");
         JOptionPane.showMessageDialog(frame, "Game has Over\n\t"+" Wanna play again?");
       frame.setVisible(false);
       new Oasis_Infobyte_task_2();
        }
        else{
       JOptionPane.showMessageDialog(frame, "The number is "+actual_number+"\nGame has Over...\t"+" Wanna play again?");
       frame.setVisible(false);
       new Oasis_Infobyte_task_2();}
    }}
public static void main(String args[]){
    new Oasis_Infobyte_task_2();
}
}