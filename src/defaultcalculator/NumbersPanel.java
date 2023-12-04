/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defaultcalculator;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class NumbersPanel extends JPanel implements ActionListener {
        
    private JTextField txtText;
    
    public NumbersPanel(JTextField txtText) {
        this.txtText = txtText;
        
        setLayout(new GridLayout (4,3));
        
        JButton btn1 = new JButton("7");
        btn1.addActionListener(this);
        add(btn1);
        
        JButton btn2 = new JButton("8");
        btn2.addActionListener(this);
        add(btn2);
        
         JButton btn3 = new JButton("9");
        btn3.addActionListener(this);
        add(btn3);
        
         JButton btn4 = new JButton("4");
        btn4.addActionListener(this);
        add(btn4);
        
         JButton btn5 = new JButton("5");
        btn5.addActionListener(this);
        add(btn5);
        
         JButton btn6 = new JButton("6");
        btn6.addActionListener(this);
        add(btn6);
        
         JButton btn7 = new JButton("1");
        btn7.addActionListener(this);
        add(btn7);
        
         JButton btn8 = new JButton("2");
        btn8.addActionListener(this);
        add(btn8);
        
         JButton btn9 = new JButton("3");
        btn9.addActionListener(this);
        add(btn9);
        
        JButton btnEmpty1 = new JButton();
        btnEmpty1.setEnabled(false);
        add(btnEmpty1);
        
        JButton btn11 = new JButton("0");
        btn11.addActionListener(this);
        add(btn11);
        
        JButton btn12 = new JButton(",");
        btn12.addActionListener(this);
        add(btn12);
        
    }
        
        
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(txtText.getText().length() == 10){
            return;
        }
        
        JButton btn = (JButton) e.getSource();
       String number = btn.getText();
       txtText.setText(txtText.getText() + number);
    
    
    
    }
    
    
    
}
