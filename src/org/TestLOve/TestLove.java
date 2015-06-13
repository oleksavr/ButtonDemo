package org.TestLOve;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JTextField;

public class TestLove extends JFrame implements ActionListener,ItemListener{

	private JPanel contentPane;
	private final JButton btnNewButton = new JButton("Show results");
	private JTextField textField;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton rdbtnNo;
	JRadioButton rdbtnYes;
	JRadioButton rdbtnNo_1;
	int count ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestLove frame = new TestLove();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestLove() {
		
		setPreferredSize(new Dimension(600, 400));
		setSize(new Dimension(488, 300));
		setTitle("TestLove");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TestLove.class.getResource("/com/sun/java/swing/plaf/windows/icons/Question.gif")));
		setForeground(new Color(153, 0, 0));
		setFont(new Font("Bell Gothic Std Light", Font.PLAIN, 14));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(480, 380));
		contentPane.setToolTipText("Choose the answer which right in your opinion");
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 128, 128), UIManager.getColor("Button.highlight"), UIManager.getColor("Button.background"), new Color(64, 64, 64)));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblTestIfYou = new JLabel("Test if you love each other.");
		lblTestIfYou.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(lblTestIfYou);
		
		textField = new JTextField();
		textField.setVisible(true);
		panel.add(textField);
		textField.setColumns(15);
		
		JPanel panel_1 = new JPanel();
		panel_1.setVerifyInputWhenFocusTarget(false);
		panel_1.setAutoscrolls(true);
		panel_1.setSize(new Dimension(650, 400));
		contentPane.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new MigLayout("", "[grow,center][438px]", "[119px][][][][119px]"));
		
		rdbtnNewRadioButton = new JRadioButton("Yes");
		panel_1.add(rdbtnNewRadioButton, "flowx,cell 1 0,growx,aligny center");
		rdbtnNewRadioButton.addItemListener(this);
		
		rdbtnNo = new JRadioButton("No");
		panel_1.add(rdbtnNo, "cell 1 0");
		rdbtnNo.addItemListener(this);
		
		JLabel q1 = new JLabel("1.Do you love her/him?");
		q1.setVerticalTextPosition(SwingConstants.TOP);
		q1.setVerticalAlignment(SwingConstants.TOP);
		q1.setPreferredSize(new Dimension(450, 16));
		q1.setHorizontalTextPosition(SwingConstants.LEFT);
		q1.setAutoscrolls(true);
		q1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(q1, "cell 1 0,grow");
		
		JLabel lblDoYou = new JLabel("2. Do you want to spent time with ? ");
		lblDoYou.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDoYou.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblDoYou, "flowx,cell 1 2");
		
		rdbtnYes = new JRadioButton("Yes");
		panel_1.add(rdbtnYes, "flowx,cell 1 4");
		rdbtnYes.addItemListener(this);
		
		rdbtnNo_1 = new JRadioButton("No");
		panel_1.add(rdbtnNo_1, "cell 1 4");
		rdbtnNo_1.addItemListener(this);
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		btnNewButton.addActionListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(rdbtnNewRadioButton.isSelected() & rdbtnYes.isSelected())
			{count = count +1;
		rdbtnNo_1.setSelected(false);
		rdbtnNo.setSelected(false);}
		
		if(rdbtnNo_1.isSelected() & rdbtnNo.isSelected())
			{count =count +0;
		rdbtnNewRadioButton.setSelected(false);
		rdbtnYes.setSelected(false);}
		
		else
			{count =count +0;
		textField.setVisible(true);
		textField.setText("Press show result!" );}
		
			
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Show results") & count ==1)
			
				{textField.setVisible(true);
				textField.setText("You both love each other!" );}
			
			else
			{textField.setVisible(true);
			textField.setText("You hate each other!" );}
		
	}

}
