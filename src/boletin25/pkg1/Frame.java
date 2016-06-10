package boletin25.pkg1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Frame implements ActionListener {
    JFrame marco;
    JButton boton;
    JLabel etiqueta;
    JPanel panel;
    
    
           
    
    
    public void crearVentana(){
        marco=new JFrame("Evento ");
        panel=new JPanel();
        boton=new JButton("Premer");
        boton.setBackground(Color.CYAN);
        etiqueta=new JLabel();
        marco.setSize(200,200);
        
        boton.addActionListener(this);
        panel.add(boton);
        panel.add(etiqueta);
        marco.add(panel);
        
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        etiqueta.setText("Has hecho click");
    }
    
}
    
    
    
    
    
    
    
    
    
     
    
    

