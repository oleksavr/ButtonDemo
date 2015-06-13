package org.button;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListDemo  implements ListSelectionListener{
	
	
	JList <String> jlst;
	JLabel jlab;
	JScrollPane jscrlp;
	
	//Create names
	
	String names[] = {
			"Jon","Rachel","Sasha","Randy","Tom","Matt","Todd","Andrew"};
	
	
	ListDemo(){
		//create JFrame comtainer
		JFrame jfrm = new JFrame("JList Demo");
		//specify a flow layout
		jfrm.setLayout(new FlowLayout());
		
		jfrm.setSize(200,160);
		
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create a JList
		jlst = new JList<String>(names);
		
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		jscrlp =new JScrollPane(jlst);
		
		jscrlp.setPreferredSize(new Dimension(120,90));
		
		jlab=new JLabel ("Please shoose a name");
		
		jlst.addListSelectionListener(this);
		
		jfrm.add(jscrlp);
		jfrm.add(jlab);
		
		jfrm.setVisible(true);
		
		
		
		
	}
	
	//Handle list selection events
	@Override
	public void valueChanged(ListSelectionEvent e) {
		int idx = jlst.getSelectedIndex();
		
		if(idx != -1)
			jlab.setText("Current selection: " + names[idx]);
		
		else 
			
			jlab.setText("Please choose a name");
		
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				new ListDemo();
				
			}
			
		}
		
				);
		
	}

	
	
	
}
