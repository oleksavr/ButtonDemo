package org.button;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class ButtonDemo implements ActionListener {

	JLabel jlab;
	
	@SuppressWarnings("deprecation")
	ButtonDemo(){
		JFrame jfrm = new JFrame("A Button Example");
		jfrm.setCursor(1);
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(220, 90);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton jbtnUp = new JButton("Up");
		JButton jbtnDown = new JButton("Down");
		
		jbtnUp.addActionListener(this);
		jbtnDown.addActionListener(this);
		
		jfrm.add(jbtnUp);
		jfrm.add(jbtnDown);
		
		jlab = new JLabel("Press a button.");
		
		jfrm.add(jlab);
		
		
		jfrm.setVisible(true);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Up"))
		{
			jlab.setText("You pressed Up");
		    jlab.setForeground(Color.GREEN);
		}
		else 
			{jlab.setText("You pressed Down.");
		jlab.setForeground(Color.RED);}
		
	}

	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				new ButtonDemo();
				
			}
			
		});
	}
	
	
}
