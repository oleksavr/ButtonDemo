package org.button;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class CBDemo implements ItemListener{

	JLabel jlabSelected;
	JLabel jlabChanged;
	JCheckBox jcbAlpha;
	JCheckBox jcbBeta;
	JCheckBox jcbGamma;
	
	
	CBDemo(){
		JFrame jfrm = new JFrame ("Demonstrate Check Boxes");
		
		jfrm.setLayout(new FlowLayout());
		
		jfrm.setSize(280, 120);
		
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlabSelected = new JLabel ("");
		jlabChanged = new JLabel("");
		
		jcbAlpha =new JCheckBox("Alpha");
		jcbBeta = new JCheckBox("Beta");
		jcbGamma = new JCheckBox("Gamma");
		
		jcbAlpha.addItemListener(this);
		jcbBeta.addItemListener(this);
		jcbGamma.addItemListener(this);
		
		jfrm.add(jcbAlpha);
		jfrm.add(jcbBeta);
		jfrm.add(jcbGamma);
		jfrm.add(jlabSelected);
		
		
		jfrm.setVisible(true);
		
	
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		String str="";
		
		JCheckBox cb =(JCheckBox) e.getItem();
		
		if(cb.isSelected())
			jlabChanged.setText(cb.getText() + " was just selected .");
		else 
			jlabChanged.setText(cb.getText()+" was just cleared.");
		
		if(jcbAlpha.isSelected()){
			str += "Alpha ";
		}
		if(jcbBeta.isSelected()){
			str += "Beta ";
		}
		if(jcbGamma.isSelected()){
			str += "Gamma";
			
		}
		jlabSelected.setText("Selected check boxes: " + str);
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				new CBDemo();
				
			}
			
		});
	}

}
