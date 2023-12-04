/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defaultcalculator;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class DefaultCalculator extends JFrame {

    public DefaultCalculator() throws Exception {
        setTitle("Calculadora");
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setLocation(400,200);
        
        setLayout (new BorderLayout());
        
        TextPanel textPnael = new TextPanel();
        add(BorderLayout.NORTH, textPnael);
        
        JPanel digitsPanel = new JPanel();
        digitsPanel.setLayout(new BorderLayout());
        digitsPanel.add(BorderLayout.CENTER, new NumbersPanel(textPnael.getTxtNumber()));
        digitsPanel.add(BorderLayout.EAST, new OperationsPanel(textPnael.getTxtNumber()));
        
        add(BorderLayout.CENTER, digitsPanel);
        
        setVisible(true);
        
        
    }
    
       
    public static void main(String[] args) throws Exception {
            new DefaultCalculator();
        
    }

   
}
