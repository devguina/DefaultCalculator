/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defaultcalculator;

import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class TextPanel extends JPanel{
    
    private JTextField txtNumber;
    
    public TextPanel () {
            setLayout(new FlowLayout());
                txtNumber = new JTextField(25);
                txtNumber.setHorizontalAlignment(JTextField.RIGHT);
                txtNumber.setEnabled(false);
                add(txtNumber);
             
    }
             public JTextField getTxtNumber(){
                 return txtNumber;
             }
    }
    

