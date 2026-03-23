package com.sist.music;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MusicMain extends JFrame {
	CardLayout card = new CardLayout();
	JMenuBar bar = new JMenuBar();
	JMenuItem genieItem = new JMenuItem("지니뮤직"	);
	JMenuItem melonItem = new JMenuItem("멜론뮤직"	);
	JMenuItem exitItem = new JMenuItem("종료"	);
	// UI
	MusicList mList = new MusicList();
	
	public MusicMain() {
		JMenu menu = new JMenu("파일");
		menu.add(genieItem);
		menu.add(melonItem);
		menu.addSeparator();
		menu.add(exitItem);
		
		bar.add(menu);
		setJMenuBar(bar);
		
		setLayout(card);
		add("mList",mList);
		
		setSize(1024,768);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
		} catch (Exception e) {
			// TODO: handle exception
		}
		new MusicMain();
	}

}
