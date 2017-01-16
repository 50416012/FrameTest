package frametest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;

public class Frame_view extends Frame implements ActionListener, WindowListener {
	
	private TextField text1 = new TextField("", 10);
	private TextField text2 = new TextField("", 10);
	private TextField text3 = new TextField("", 10);
	private Button button1 = new Button("四則演算");
	
	private TextField text4 = new TextField("", 10);
	private TextField text5 = new TextField("", 10);
	private TextField text6 = new TextField("", 10);
	
	public Frame_view() {
		addWindowListener(this);
		setTitle("FrameTest");
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(text1);
		add(text2);
		add(button1);
		add(text3);
		add(text4);
		add(text5);
		add(text6);
		button1.addActionListener(this); // ボタン押したときにactionPerformed
										 // 呼び出し
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		// parseで文字列をInteger型に，String.valueOfで整数を文字列に
		int val1 = Integer.parseInt(text1.getText());
		int val2 = Integer.parseInt(text2.getText());
		//text3.setText(String.valueOf(val1 + val2));
		Calculation_lib clib = new Calculation_lib(val1, val2);
		text3.setText(String.valueOf(clib.getPlus()));
		text4.setText(String.valueOf(clib.getMinus()));
		text5.setText(String.valueOf(clib.getMulti()));
		text6.setText(String.valueOf(clib.getDiv()));
		
	}
}
