import java.awt.*;//libraries
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.ArrayList;//to hold
//the particles in order
import java.util.Random;// to make th
//e particles
import java.awt.Toolkit;
import java.util.Timer;// timer,
//toolkit and timertask to schedule
//intervals to update
import java.util.TimerTask;

public class Game extends JFrame implements WindowListener, ActionListener {
	
	LvTPanel p1;
	LvTPanel p2;
	LvTPanel p3;
	LvTPanel p4;
	LvTPanel p5;
	LvTPanel p6;
	LvTPanel p7;
	LvTPanel p8;
	LvTPanel p9;
	LvTPanel p10;
	
	LvTPanel cp1;
	LvTPanel cp2;
	LvTPanel cp3;
	LvTPanel cp4;
	LvTPanel cp5;
	
	ArrayList<LvTPanel> lvlist = new ArrayList<LvTPanel>();
	int lvcount = 0;
	Tutpanel n1, n2;
	JMenuBar main;
	JMenu levels;
	JMenu nav;
	JMenu tutmenu;
	JMenuItem lv1;
	JMenuItem lv2;
	JMenuItem lv3;
	JMenuItem lv4;
	JMenuItem lv5;
	JMenuItem lv6;
	JMenuItem lv7;
	JMenuItem lv8;
	JMenuItem lv9;
	JMenuItem lv10;
	JMenuItem head, gn2;
	
	JMenu contm;
	JMenuItem clv1;
	JMenuItem clv2;
	JMenuItem clv3;
	JMenuItem clv4;
	JMenuItem clv5;
	
	ArrayList<Tutpanel> tutorial = new ArrayList<Tutpanel>();
	Tutpanel tut1;
	Tutpanel tut2;
	Tutpanel tut3;
	Tutpanel tut4;
	Tutpanel tut5;
	Tutpanel tut6;
	Tutpanel tut7;
	Tutpanel tut8;
	Tutpanel tut9;
	Tutpanel tut10;
	
	JMenuItem t1;
	JMenuItem t2;
	JMenuItem t3;
	JMenuItem t4;
	JMenuItem t5;
	JMenuItem t6;
	JMenuItem t7;
	JMenuItem t8;
	JMenuItem t9;
	JMenuItem t10;
	
	int currentlevel;
	
	public static void main (String[] args) {
		
		Game game = new Game();//creates instance of
		//frame
		
	}
	
	public Game(){
		super("");//all basic frame info
		addWindowListener(this);
		
		setSize(500,550);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocation(0,0);
		setResizable(false);
		currentlevel = 1;
		p1 = new LvTPanel(true, false, false, false, false, 0, 0, 0, 150, 10, 0, true, 400, 400, 40, false, 0, 0, 0, false, 0, 0, 0, 1, 1);
		p2 = new LvTPanel(true, false, false, false, false, 0, 0, 0, 150, 10, 0, true, 250, 400, 40, false, 0, 0, 0, false, 0, 0, 0, 1, 2);
		p3 = new LvTPanel(true, true, false, false, false, 0, 0, 0, 150, 10, 0, true, 200, 400, 40, false, 0, 0, 0, false, 0, 0, 0, 1, 3);
		p4 = new LvTPanel(false, false, true, false, false, 0, 0, 0, 350, 10, 0, true, 300, 100, 40, false, 0, 0, 0, false, 0, 0, 0, 1, 4);
		p5 = new LvTPanel(true, false, true, false, false, 0, 0, 150, 500, 0, -10, true, 400, 400, 40, false, 0, 0, 0, false, 0, 0, 0, -1, 5);
		p6 = new LvTPanel(false, false, true, true, false, 0, 0, 300, 500, 0, -10, true, 200, 350, 40, true, 400, 100, 20, false, 0, 0, 0, -1, 6);
		p7 = new LvTPanel(false, true, true, true, false, 0, 0, 150, 500, 0, -10, true, 400, 400, 40, true, 100, 100, 30, false, 0, 0, 0, -1, 7);
		p8 = new LvTPanel(true, false, true, true, false, 0, 0, 0, 150, 3, 0, true, 200, 125, 20, true, 400, 300, 50, true, 100, 450, 50, 1, 8);
		p9 = new LvTPanel(true, true, true, true, false, 0, 0, 0, 250, 10, 0, true, 250, 200, 25, true, 250, 400, 25, false, 0, 0, 0, 1, 9);
		p10 = new LvTPanel(true, true, true, true, false, 0, 0, 0, 150, 10, 0, true, 400, 100, 40, true, 350, 350, 30, true, 150, 350, 30, 1, 10);
		cp1 = new LvTPanel(false, false, false, false, true, 100, 150, 0, 250, 10, 0, true, 400, 150, 40, false, 0, 0, 0, false, 0, 0, 0, 1, 11);
		cp2 = new LvTPanel(true, false, false, false, true, 200, 100, 0, 300, 10, 0, true, 250, 250, 40, false, 0, 0, 0, false, 0, 0, 0, 1, 12);
		cp3 = new LvTPanel(false, false, true, false, true, 100, 300, 275, 500, 0, -10, true, 400, 200, 40, true, 200, 200, 40, false, 0, 0, 0, -1, 13);
		cp4 = new LvTPanel(true, false, true, false, true, 100, 400, 0, 150, 10, 0, true, 200, 100, 40, true, 200, 200, 40, true, 200, 400, 40, 1, 14);
		cp5 = new LvTPanel(true, true, true, true, true, 200, 200, 0, 150, 10, 0, true, 400, 100, 40, true, 350, 350, 30, true, 150, 350, 30, 1, 15);
		lvlist.add(lvcount, p1);
		lvcount+=1;
		lvlist.add(lvcount,p2);
		lvcount+=1;
		lvlist.add(lvcount, p3);
		lvcount+=1;
		lvlist.add(lvcount, p4);
		lvcount+=1;
		lvlist.add(lvcount, p5);
		lvcount+=1;
		lvlist.add(lvcount, p6);
		lvcount+=1;
		lvlist.add(lvcount, p7);
		lvcount+=1;
		lvlist.add(lvcount, p8);
		lvcount+=1;
		lvlist.add(lvcount, p9);
		lvcount+=1;
		lvlist.add(lvcount, p10);
		lvcount+=1;
		lvlist.add(lvcount, cp1);
		lvcount+=1;
		lvlist.add(lvcount, cp2);
		lvcount+=1;
		lvlist.add(lvcount, cp3);
		lvcount+=1;
		lvlist.add(lvcount, cp4);
		lvcount+=1;
		lvlist.add(lvcount, cp5);
		lvcount+=1;
		n1 = new Tutpanel(Toolkit.getDefaultToolkit().getImage("logo.jpg"));
		n2 = new Tutpanel(Toolkit.getDefaultToolkit().getImage("I1.jpg"));
		head = new JMenuItem("Home");
		head.addActionListener(this);
		gn2 = new JMenuItem("Goal");
		gn2.addActionListener(this);
		tutorial.add(0, n1);
		tutorial.add(1, n2);
		nav = new JMenu("Navigation");
		nav.add(head);
		nav.add(gn2);
		main = new JMenuBar();
		main.add(nav);
		
		
		tut1 = new Tutpanel(Toolkit.getDefaultToolkit().getImage("I2.jpg"));
		tut2 = new Tutpanel(Toolkit.getDefaultToolkit().getImage("I3.jpg"));
		tut3 = new Tutpanel(Toolkit.getDefaultToolkit().getImage("I4.jpg"));
		tut4 = new Tutpanel(Toolkit.getDefaultToolkit().getImage("I5.jpg"));
		tut5 = new Tutpanel(Toolkit.getDefaultToolkit().getImage("I6.jpg"));
		tut6 = new Tutpanel(Toolkit.getDefaultToolkit().getImage("I7.jpg"));
		tut7 = new Tutpanel(Toolkit.getDefaultToolkit().getImage("I8.jpg"));
		tut8 = new Tutpanel(Toolkit.getDefaultToolkit().getImage("I9.jpg"));
		tut9 = new Tutpanel(Toolkit.getDefaultToolkit().getImage("I10.jpg"));
		tut10 = new Tutpanel(Toolkit.getDefaultToolkit().getImage("I11.jpg"));
		tutorial.add(2, tut1);
		tutorial.add(3, tut2);
		tutorial.add(4, tut3);
		tutorial.add(5, tut4);
		tutorial.add(6, tut5);
		tutorial.add(7, tut6);
		tutorial.add(8, tut7);
		tutorial.add(9, tut8);
		tutorial.add(10, tut9);
		tutorial.add(11, tut10);
		t1 = new JMenuItem("Controls");
		t1.addActionListener(this);
		t2 = new JMenuItem("Fields 1");
		t2.addActionListener(this);
		t3 = new JMenuItem("Fields 2");
		t3.addActionListener(this);
		t4 = new JMenuItem("Fields 3");
		t4.addActionListener(this);
		t5 = new JMenuItem("Gravitation");
		t5.addActionListener(this);
		t6 = new JMenuItem("Electricity");
		t6.addActionListener(this);
		t7 = new JMenuItem("Teleportation");
		t7.addActionListener(this);
		t8 = new JMenuItem("Translating");
		t8.addActionListener(this);
		t9 = new JMenuItem("Resizing");
		t9.addActionListener(this);
		t10 = new JMenuItem("Rotating");
		t10.addActionListener(this);
		tutmenu = new JMenu("Tutorial");
		tutmenu.add(t1);
		tutmenu.add(t2);
		tutmenu.add(t3);
		tutmenu.add(t4);
		tutmenu.add(t5);
		tutmenu.add(t6);
		tutmenu.add(t7);
		tutmenu.add(t8);
		tutmenu.add(t9);
		tutmenu.add(t10);
		main.add(tutmenu);
		
		lv1 = new JMenuItem("Level 1");
		lv1.addActionListener(this);
		lv2 = new JMenuItem("Level 2");
		lv2.addActionListener(this);
		lv3 = new JMenuItem("Level 3");
		lv3.addActionListener(this);
		lv4 = new JMenuItem("Level 4");
		lv4.addActionListener(this);
		lv5 = new JMenuItem("Level 5");
		lv5.addActionListener(this);		
		lv6 = new JMenuItem("Level 6");
		lv6.addActionListener(this);
		lv7 = new JMenuItem("Level 7");
		lv7.addActionListener(this);
		lv8 = new JMenuItem("Level 8");
		lv8.addActionListener(this);
		lv9 = new JMenuItem("Level 9");
		lv9.addActionListener(this);
		lv10 = new JMenuItem("Level 10");
		lv10.addActionListener(this);
		levels = new JMenu("Stream");
		levels.add(lv1);
		levels.add(lv2);
		levels.add(lv3);
		levels.add(lv4);
		levels.add(lv5);
		levels.add(lv6);
		levels.add(lv7);
		levels.add(lv8);
		levels.add(lv9);
		levels.add(lv10);
		main.add(levels);
		
		clv1 = new JMenuItem("Level 1");
		clv1.addActionListener(this);
		clv2 = new JMenuItem("Level 2");
		clv2.addActionListener(this);
		clv3 = new JMenuItem("Level 3");
		clv3.addActionListener(this);
		clv4 = new JMenuItem("Level 4");
		clv4.addActionListener(this);
		clv5 = new JMenuItem("Level 5");
		clv5.addActionListener(this);
		contm = new JMenu("Continuum");
		contm.add(clv1);
		contm.add(clv2);
		contm.add(clv3);
		contm.add(clv4);
		contm.add(clv5);
		main.add(contm);
		setJMenuBar(main);

		//being used right now
		//will be made more general so as to be used
		//like a template for the levels
		
		setContentPane(n1);
		setVisible(true);
		
	}
	 
		public void windowActivated (WindowEvent e){
			 //blank
		}
		public void windowClosed (WindowEvent e){
			p1.time.cancel(); //cancels timer on window
			p2.time.cancel();
			p3.time.cancel();
			p4.time.cancel();
			p5.time.cancel();
			p6.time.cancel();
			p7.time.cancel();
			p8.time.cancel();
			p9.time.cancel();
			p10.time.cancel();
			cp1.time.cancel();
			cp2.time.cancel();
			cp3.time.cancel();
			cp4.time.cancel();
			cp5.time.cancel();
			//close
		}	
		public void windowClosing (WindowEvent e){
			//blank
		}	
		public void windowDeactivated (WindowEvent e){
			  //blank
		}
		public void windowDeiconified (WindowEvent e){
			 //blank
		}
		public void windowIconified (WindowEvent e){
			//blank
		}
		public void windowOpened (WindowEvent e){
			//blank
		}
		
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == head){
			Tutpanel t;
			LvTPanel x;
			for (int i = 0 ; i < 12 ; i++){
				t = tutorial.get(i);
				t.setVisible(false);
			}
			for (int i = 0 ; i < lvcount ; i++){
				x = lvlist.get(i);
				x.setVisible(false);
			}
			n1.setVisible(true);
			setContentPane(n1);

		}else if (e.getSource() == gn2){
			Tutpanel t;
			LvTPanel x;
			for (int i = 0 ; i < 12 ; i++){
				t = tutorial.get(i);
				t.setVisible(false);
			}
			for (int i = 0 ; i < lvcount ; i++){
				x = lvlist.get(i);
				x.setVisible(false);
			}
			n2.setVisible(true);
			setContentPane(n2);

		}else if (e.getSource() == lv1){
			currentlevel = 1;
			Tutpanel t;
			LvTPanel x;
			for (int i = 0 ; i < 12 ; i++){
				t = tutorial.get(i);
				t.setVisible(false);
			}
			for (int i = 0 ; i < lvcount ; i++){
				x = lvlist.get(i);
				x.setVisible(false);
			}
			p1.setVisible(true);
			setContentPane(p1);

		}else if (e.getSource() == lv2){
			currentlevel = 2;
			if (p1.won){
				Tutpanel t;
				LvTPanel x;
				for (int i = 0 ; i < 12 ; i++){
					t = tutorial.get(i);
					t.setVisible(false);
				}
				for (int i = 0 ; i < lvcount ; i++){
					x = lvlist.get(i);
					x.setVisible(false);
				}
				p2.setVisible(true);
				setContentPane(p2);
			}
		}else if (e.getSource() == lv3){
			currentlevel = 3;
			if (p2.won){
				Tutpanel t;
				LvTPanel x;
				for (int i = 0 ; i < 12 ; i++){
					t = tutorial.get(i);
					t.setVisible(false);
				}
				for (int i = 0 ; i < lvcount ; i++){
					x = lvlist.get(i);
					x.setVisible(false);
				}
				p3.setVisible(true);
				setContentPane(p3);
			}
		}else if (e.getSource() == lv4){
			currentlevel = 4;
			if (p3.won){
				Tutpanel t;
				LvTPanel x;
				for (int i = 0 ; i < 12 ; i++){
					t = tutorial.get(i);
					t.setVisible(false);
				}
				for (int i = 0 ; i < lvcount ; i++){
					x = lvlist.get(i);
					x.setVisible(false);
				}
				p4.setVisible(true);
				setContentPane(p4);
			}	
		}else if (e.getSource() == lv5){
			currentlevel = 5;
			if (p4.won){
				Tutpanel t;
				LvTPanel x;
				for (int i = 0 ; i < 12 ; i++){
					t = tutorial.get(i);
					t.setVisible(false);
				}
				for (int i = 0 ; i < lvcount ; i++){
					x = lvlist.get(i);
					x.setVisible(false);
				}
				p5.setVisible(true);
				setContentPane(p5);
			}	
		}else if (e.getSource() == lv6){
			currentlevel = 6;
			if (p5.won){
				Tutpanel t;
				LvTPanel x;
				for (int i = 0 ; i < 12 ; i++){
					t = tutorial.get(i);
					t.setVisible(false);
				}
				for (int i = 0 ; i < lvcount ; i++){
					x = lvlist.get(i);
					x.setVisible(false);
				}
				p6.setVisible(true);
				setContentPane(p6);
			}	
		}else if (e.getSource() == lv7){
			currentlevel = 7;
			if (p6.won){
				Tutpanel t;
				LvTPanel x;
				for (int i = 0 ; i < 12 ; i++){
					t = tutorial.get(i);
					t.setVisible(false);
				}
				for (int i = 0 ; i < lvcount ; i++){
					x = lvlist.get(i);
					x.setVisible(false);
				}
				p7.setVisible(true);
				setContentPane(p7);
			}		
		}else if (e.getSource() == lv8){
			currentlevel = 8;
			if (p7.won){
				Tutpanel t;
				LvTPanel x;
				for (int i = 0 ; i < 12 ; i++){
					t = tutorial.get(i);
					t.setVisible(false);
				}
				for (int i = 0 ; i < lvcount ; i++){
					x = lvlist.get(i);
					x.setVisible(false);
				}
				p8.setVisible(true);
				setContentPane(p8);
			}		
		}
		else if (e.getSource() == lv9){
			currentlevel = 9;
			if (p8.won){
				Tutpanel t;
				LvTPanel x;
				for (int i = 0 ; i < 12 ; i++){
					t = tutorial.get(i);
					t.setVisible(false);
				}
				for (int i = 0 ; i < lvcount ; i++){
					x = lvlist.get(i);
					x.setVisible(false);
				}
				p9.setVisible(true);
				setContentPane(p9);
			}		
		}
		else if (e.getSource() == lv10){
			currentlevel = 10;
			if (p9.won){
				Tutpanel t;
				LvTPanel x;
				for (int i = 0 ; i < 12 ; i++){
					t = tutorial.get(i);
					t.setVisible(false);
				}
				for (int i = 0 ; i < lvcount ; i++){
					x = lvlist.get(i);
					x.setVisible(false);
				}
				p10.setVisible(true);
				setContentPane(p10);
			}		
		}else if (e.getSource() == clv1){
			currentlevel = 11;
			if (p7.won){
				Tutpanel t;
				LvTPanel x;
				for (int i = 0 ; i < 12 ; i++){
					t = tutorial.get(i);
					t.setVisible(false);
				}
				for (int i = 0 ; i < lvcount ; i++){
					x = lvlist.get(i);
					x.setVisible(false);
				}
				cp1.setVisible(true);
				setContentPane(cp1);
			}		
		}else if (e.getSource() == clv2){
			currentlevel = 12;
			if (cp1.won){
				Tutpanel t;
				LvTPanel x;
				for (int i = 0 ; i < 12 ; i++){
					t = tutorial.get(i);
					t.setVisible(false);
				}
				for (int i = 0 ; i < lvcount ; i++){
					x = lvlist.get(i);
					x.setVisible(false);
				}
				cp2.setVisible(true);
				setContentPane(cp2);
			}		
		}else if (e.getSource() == clv3){
			currentlevel = 13;
			if (cp2.won){
				Tutpanel t;
				LvTPanel x;
				for (int i = 0 ; i < 12 ; i++){
					t = tutorial.get(i);
					t.setVisible(false);
				}
				for (int i = 0 ; i < lvcount ; i++){
					x = lvlist.get(i);
					x.setVisible(false);
				}
				cp3.setVisible(true);
				setContentPane(cp3);
			}		
		}else if (e.getSource() == clv4){
			currentlevel = 14;
			if (cp3.won){
				Tutpanel t;
				LvTPanel x;
				for (int i = 0 ; i < 12 ; i++){
					t = tutorial.get(i);
					t.setVisible(false);
				}
				for (int i = 0 ; i < lvcount ; i++){
					x = lvlist.get(i);
					x.setVisible(false);
				}
				cp4.setVisible(true);
				setContentPane(cp4);
			}		
		}else if (e.getSource() == clv5){
			currentlevel = 15;
			if (cp4.won){
				Tutpanel t;
				LvTPanel x;
				for (int i = 0 ; i < 12 ; i++){
					t = tutorial.get(i);
					t.setVisible(false);
				}
				for (int i = 0 ; i < lvcount ; i++){
					x = lvlist.get(i);
					x.setVisible(false);
				}
				cp5.setVisible(true);
				setContentPane(cp5);
			}		
		}
		
		else if (e.getSource() == t1){
			Tutpanel t;
			LvTPanel x;
			for (int i = 0 ; i < 12 ; i++){
				t = tutorial.get(i);
				t.setVisible(false);
			}
			for (int i = 0 ; i < lvcount ; i++){
				x = lvlist.get(i);
				x.setVisible(false);
			}
			tut1.setVisible(true);
			setContentPane(tut1);
					
		}else if (e.getSource() == t2){
			Tutpanel t;
			LvTPanel x;
			for (int i = 0 ; i < 12 ; i++){
				t = tutorial.get(i);
				t.setVisible(false);
			}
			for (int i = 0 ; i < lvcount ; i++){
				x = lvlist.get(i);
				x.setVisible(false);
			}
			tut2.setVisible(true);
			setContentPane(tut2);
					
		}else if (e.getSource() == t3){
			Tutpanel t;
			LvTPanel x;
			for (int i = 0 ; i < 12 ; i++){
				t = tutorial.get(i);
				t.setVisible(false);
			}
			for (int i = 0 ; i < lvcount ; i++){
				x = lvlist.get(i);
				x.setVisible(false);
			}
			tut3.setVisible(true);
			setContentPane(tut3);
					
		}else if (e.getSource() == t4){
			Tutpanel t;
			LvTPanel x;
			for (int i = 0 ; i < 12 ; i++){
				t = tutorial.get(i);
				t.setVisible(false);
			}
			for (int i = 0 ; i < lvcount ; i++){
				x = lvlist.get(i);
				x.setVisible(false);
			}
			tut4.setVisible(true);
			setContentPane(tut4);
					
		}else if (e.getSource() == t5){
			Tutpanel t;
			LvTPanel x;
			for (int i = 0 ; i < 12 ; i++){
				t = tutorial.get(i);
				t.setVisible(false);
			}
			for (int i = 0 ; i < lvcount ; i++){
				x = lvlist.get(i);
				x.setVisible(false);
			}
			tut5.setVisible(true);
			setContentPane(tut5);
					
		}else if (e.getSource() == t6){
			Tutpanel t;
			LvTPanel x;
			for (int i = 0 ; i < 12 ; i++){
				t = tutorial.get(i);
				t.setVisible(false);
			}
			for (int i = 0 ; i < lvcount ; i++){
				x = lvlist.get(i);
				x.setVisible(false);
			}
			tut6.setVisible(true);
			setContentPane(tut6);
					
		}else if (e.getSource() == t7){
			Tutpanel t;
			LvTPanel x;
			for (int i = 0 ; i < 12 ; i++){
				t = tutorial.get(i);
				t.setVisible(false);
			}
			for (int i = 0 ; i < lvcount ; i++){
				x = lvlist.get(i);
				x.setVisible(false);
			}
			tut7.setVisible(true);
			setContentPane(tut7);
					
		}else if (e.getSource() == t8){
			Tutpanel t;
			LvTPanel x;
			for (int i = 0 ; i < 12 ; i++){
				t = tutorial.get(i);
				t.setVisible(false);
			}
			for (int i = 0 ; i < lvcount ; i++){
				x = lvlist.get(i);
				x.setVisible(false);
			}
			tut8.setVisible(true);
			setContentPane(tut8);
					
		}else if (e.getSource() == t9){
			Tutpanel t;
			LvTPanel x;
			for (int i = 0 ; i < 12 ; i++){
				t = tutorial.get(i);
				t.setVisible(false);
			}
			for (int i = 0 ; i < lvcount ; i++){
				x = lvlist.get(i);
				x.setVisible(false);
			}
			tut9.setVisible(true);
			setContentPane(tut9);
					
		}else if (e.getSource() == t10){
			Tutpanel t;
			LvTPanel x;
			for (int i = 0 ; i < 12 ; i++){
				t = tutorial.get(i);
				t.setVisible(false);
			}
			for (int i = 0 ; i < lvcount ; i++){
				x = lvlist.get(i);
				x.setVisible(false);
			}
			tut10.setVisible(true);
			setContentPane(tut10);
					
		}
	
	}
	
	
	public class Tutpanel extends JPanel{
			
		Image todisp;
		
		public Tutpanel(Image i){
			
			todisp = i;
			
		}
		public void paintComponent(Graphics g){
			setBackground(Color.BLACK);
			super.paintComponent(g);
			g.drawImage(todisp, 0, 0, this);
		}
		
		
	}	
	
	
	class LvTPanel extends JPanel implements MouseListener, MouseMotionListener, KeyListener{
		Image[] lvcs = new Image[10];

		
		//MouseListener: Select the center of the circle
		//MouseMotion : move the fields aroudn
		//Window : stop timer task on window close
		//Key : CTRL/ALT/SHIFT
		ArrayList<Particle> plist = new ArrayList<Particle>(50);
		//this arraylist holds all the particles
		boolean p_exists = false;
		//are there any particles? (boolean)
		Random rand;//random to spawn particles
		Timer time;//timer to schedule event
		Toolkit toolkit;
		int p_count = 0;
		//number of particles - used later
		//as loop counter
		GField gf1;
		GField gf2;
		EField ef1;
		EField ef2;
		TField tf1;
		//declares the fields
		boolean exists_gfield = false;
		boolean over_gfc = false;
		boolean exists_gfield2 = false;
		boolean over_gfc2 = false;
		boolean exists_efield = false;
		boolean over_efc = false;

		boolean exists_efield2 = false;
		boolean over_efc2 = false;
		boolean exists_tfield = false;
		boolean over_tfc = false;
		//are the fields there (boolean)
		//this is there to prevent
		//nullpointer exceptions
		
		//is the mouse clicke on the center
		//of a field
		boolean shift = false;
		boolean ctrl = false;
		boolean alt = false;
		boolean left = false;
		boolean right = false;
		boolean up = false;
		boolean down = false;
		//key pressed booleans
		//one for shift, ctrl, and alt
		
		int ivy = 0;
		int ivx = 0;
		int ix = 0;
		int iy = 0;
		
		Goal g1;
		Goal g2;
		Goal g3;
		boolean exists_goal1 = false;
		boolean exists_goal2 = false;
		boolean exists_goal3 = false;
		int flux1 = 10;
		int flux2 = 10;
		int flux3 = 10;
		int p_state;
		boolean won = false;
		boolean replay = false;
		
		Color back_color = Color.BLACK;
		Color p_color = Color.RED;
		Color g_color = Color.WHITE;
		Color e_color = Color.PINK;
		Color goal_color = Color.YELLOW;
		Color t_color = Color.CYAN;
		int lvidx;
		public LvTPanel(boolean gfield1, boolean gfield2, boolean efield1, boolean efield2, boolean tfield, int tfxi, int tfyi, int xloc, int yloc, int xv, int yv, boolean goal1, int goal1x, int goal1y, int goal1r, boolean goal2, int goal2x, int goal2y, int goal2r, boolean goal3, int goal3x, int goal3y, int goal3r, int p_statei, int lvidxi){
			lvidx = lvidxi;
			lvcs[0] = Toolkit.getDefaultToolkit().getImage("1.jpg");
			lvcs[1] = Toolkit.getDefaultToolkit().getImage("2.jpg");
			lvcs[2] = Toolkit.getDefaultToolkit().getImage("3.jpg");
			lvcs[3] = Toolkit.getDefaultToolkit().getImage("4.jpg");
			lvcs[4] = Toolkit.getDefaultToolkit().getImage("5.jpg");
			lvcs[5] = Toolkit.getDefaultToolkit().getImage("6.jpg");
			lvcs[6] = Toolkit.getDefaultToolkit().getImage("7.jpg");
			lvcs[7] = Toolkit.getDefaultToolkit().getImage("8.jpg");
			lvcs[8] = Toolkit.getDefaultToolkit().getImage("9.jpg");
			lvcs[9] = Toolkit.getDefaultToolkit().getImage("10.jpg");			
			//listeners to be added
			addKeyListener(this);//key
			addMouseListener(this);//mouse
			addMouseMotionListener(this);//mm

			toolkit = Toolkit.getDefaultToolkit();
			time = new Timer();//make objects
			ivy = yv;
			ivx = xv;
			ix = xloc;
			iy = yloc;
			p_state = p_statei;
			//timer and random
			rand = new Random();
			plist.add(0 , new Particle(rand.nextInt(30)+ix,rand.nextInt(30)+iy,ivx,ivy));
			plist.add(1 , new Particle(rand.nextInt(30)+ix,rand.nextInt(30)+iy,ivx,ivy));
			//2 particles to start simulation
			p_count = 2;
			//2 particles added
			p_exists = true;
			//the particles exist now
			//for paintcomponent	
			if (gfield1){		
				gf1 = new GField(100,100,50);
				exists_gfield = true;
			}
			if (efield1){
				ef1 = new EField(100,200,50);
				exists_efield = true;
			}
			if (efield2){
				ef2 = new EField(200,100,50);
				exists_efield2 = true;
			}
			if (gfield2){		
				gf2 = new GField(200,200,50);
				exists_gfield2 = true;
			}
			if (tfield){		
				tf1 = new TField(400,400,50,tfxi,tfyi);
				exists_tfield = true;
			}
			if (goal1){
				g1 = new Goal(goal1x,goal1y,goal1r);
				exists_goal1 = true;
				flux1 = 0;
			}
			if (goal2){
				g2 = new Goal(goal2x, goal2y, goal2r);
				exists_goal2 = true;
				flux2 = 0;
			}
			if (goal3){
				g3 = new Goal(goal3x, goal3y, goal3r);
				exists_goal3 = true;
				flux3 = 0;
			}
			
			//makes the efield and gfield and informs
			//of their existence - see paintcomponent
			time.schedule(new PaddTask(), 10);
			
		}
		
		public void mousePressed ( MouseEvent e ){
		  //is the mouse clicked over the center of the
		  //efield or the gfield?
		  //let paintcomponent know
			requestFocus();
			int xmousecurrent = e.getX();
			int ymousecurrent = e.getY(); //gets mouse location
			if (exists_gfield){
				
				if ((Math.abs(xmousecurrent-gf1.xc) < 20)&&(Math.abs(ymousecurrent-gf1.yc)<20)){
					over_gfc = true;//this would mean that mouse
					//is over center of gfield
				}else{
					over_gfc = false;
				}				
				
			}
			if (exists_gfield2){
				
				if ((Math.abs(xmousecurrent-gf2.xc) < 20)&&(Math.abs(ymousecurrent-gf2.yc)<20)){
					over_gfc2 = true;//this would mean that mouse
					//is over center of gfield
				}else{
					over_gfc2 = false;
				}				
				
			}
			if (exists_efield){
      
				if ((Math.abs(xmousecurrent-ef1.xc) < 20)&&(Math.abs(ymousecurrent-ef1.yc)<20)){
					over_efc = true;//this would mean that mouse
					//is over center of efield
				}else{
					over_efc = false;
				}
      
			}
			if (exists_efield2){
      
				if ((Math.abs(xmousecurrent-ef2.xc) < 20)&&(Math.abs(ymousecurrent-ef2.yc)<20)){
					over_efc2 = true;//this would mean that mouse
					//is over center of bfield
				}else{
					over_efc2 = false;
				}
      
			}
			if (exists_tfield){
      
				if ((Math.abs(xmousecurrent-tf1.xc) < 20)&&(Math.abs(ymousecurrent-tf1.yc)<20)){
					over_tfc = true;//this would mean that mouse
					//is over center of bfield
				}else{
					over_tfc = false;
				}
      
			}
			repaint();			
		}
		public void mouseReleased ( MouseEvent e ){
		//mouse if, by default, no longer clicked
		//over efield center and gfield center
			over_efc = false;
			over_gfc = false;
			over_gfc2 = false;
			over_efc2 = false;
			over_tfc = false;
		}
		public void mouseClicked ( MouseEvent e ){
      //blank
		}
		public void mouseEntered ( MouseEvent e ){
	    //blank		
		}	
		public void mouseExited ( MouseEvent e ){
      //blank
		}
		public void mouseDragged ( MouseEvent e){
		  //this method exists to move the fields
			int xmousecurrent = e.getX();
			int ymousecurrent = e.getY();//current pos
			if (over_gfc){
				gf1.xc = xmousecurrent;
				gf1.yc = ymousecurrent;
			//is the mouse is clicked over the center
      //then dragged, the field
      //follows the mouse	
			}else if (over_efc){
 				ef1.xc = xmousecurrent;
				ef1.yc = ymousecurrent;       
			}else if (over_efc2){
 				ef2.xc = xmousecurrent;
				ef2.yc = ymousecurrent;       
			}else if (over_gfc2){
 				gf2.xc = xmousecurrent;
				gf2.yc = ymousecurrent;       
			}else if (over_tfc){
 				tf1.xc = xmousecurrent;
				tf1.yc = ymousecurrent;       
			}
			repaint();
		}
		public void mouseMoved ( MouseEvent e){
	     //blank
		}

		public void keyTyped ( KeyEvent e ){
			 //blank
		}
		public void keyPressed ( KeyEvent e ){
		//checks to see whether ctrl, alt, or shift
		//is pressed
			int key = e.getKeyCode();
			if (key == KeyEvent.VK_SHIFT){
				shift = true;//shift is pressed - extend
			}else if (key == KeyEvent.VK_CONTROL){
				ctrl = true;//ctrl is pressed - retract
			}else if (key == KeyEvent.VK_DOWN){
				if ((won)&&(!replay)){
					replay = true;
					resetScrn();
					repaint();
				}else{
					down = true;
				}
			}else if (key == KeyEvent.VK_LEFT){
				left = true;
			}else if (key == KeyEvent.VK_RIGHT){
				right = true;
			}else if (key == KeyEvent.VK_UP){
				up = true;
			}
		}
		public void keyReleased ( KeyEvent e ){
			shift = false;
			ctrl = false;
			up = false;
			down = false;
			left = false;
			right = false;
			//alt, ctrl, and shift no longer pressed
		}		
		class PaddTask extends TimerTask{
			
			public void run(){
				//makes the task that repeats every 0.5 seconds
				if (p_count <= 100){
					plist.add(0 , new Particle(rand.nextInt(30)+ix,rand.nextInt(30)+iy,ivx,ivy));
					p_count += 1;//adds particle when there are less than 50
				}
				for (int i = 0; i < p_count; i++){
					//loops through each particle and defines behavior
					//use arraylist
					plist.get(i).x += plist.get(i).dx;//ds = v dt
					//uses basic math/calculus to get positions
					plist.get(i).y += plist.get(i).dy;
					plist.get(i).p_reset(ix, iy, ivx, ivy);
					if (exists_gfield){
						plist.get(i).p_in_gfield(gf1.xc, gf1.yc, gf1.r);
					}//checks if particle is in gfield
					if (exists_efield){
						plist.get(i).p_in_efield(ef1.xc, ef1.yc, ef1.r, ef1.dxmod, ef1.dymod);
					}//check is particle is in efield	
					if (exists_efield2){
						plist.get(i).p_in_efield(ef2.xc, ef2.yc, ef2.r, ef2.dxmod, ef2.dymod);
					} 
					if (exists_gfield2){
						plist.get(i).p_in_gfield(gf2.xc, gf2.yc, gf2.r);
					} 
					if (exists_tfield){
						plist.get(i).p_in_tfield(tf1.xc, tf1.yc, tf1.r, tf1.destx, tf1.desty);
					} 	
				} 
				repaint();
				time.schedule(new PaddTask(), 50);//repeat task within timer					
			}			
		}
		
		
		public int calFlux(Goal given){
			int count=0;
			Particle selct;			
			for (int i = 0 ; i < p_count ; i++){
				
				selct = plist.get(i);
				if ((selct.x>given.xc-given.r)&&(selct.x<given.xc+given.r)&&(selct.y>given.yc-given.r)&&(selct.y<given.yc+given.r)){
					count += 1;
				}
				
			}
			return count;
		}
		
		
		public void paintComponent(Graphics g){//to do all the visuals
			setBackground(back_color);
			super.paintComponent(g);
			if (!(won) || (replay)){
				g.setColor(p_color);//to do circles, etc.
				if (p_exists){
					//if there is a particle, we won't get nullpointer
					//or index oob;
					for (int i = 0; i < p_count; i++){
						//each particle is represented by an oval, filled in white
						g.fillOval(plist.get(i).x, plist.get(i).y, 7, 7);
					}				
				}
				if (exists_gfield){
				g.setColor(g_color);
					if ((over_gfc) && (!shift) && (!ctrl)){//center clicked on
						g.fillOval(gf1.xc-5, gf1.yc-5, 10, 10);//draws small oval  
					}else if ((over_gfc) && (shift) && (!ctrl)){
						gf1.extend();//extends field if only shift pressed
					}else if ((over_gfc) && (!shift) && (ctrl)){
						gf1.retract();//retracts field if only ctrl pressed
					}
					for (int i = gf1.r-5; i <= gf1.r; i++){
						g.drawOval(gf1.xc-i, gf1.yc-i, i * 2, i * 2);
					  //draws the circle that represents the field
					}
				}
				if (exists_gfield2){
				 g.setColor(g_color);
					if ((over_gfc2) && (!shift) && (!ctrl)){//center clicked on
						g.fillOval(gf2.xc-5, gf2.yc-5, 10, 10);//draws small oval  
					}else if ((over_gfc2) && (shift) && (!ctrl)){
						gf2.extend();//extends field if only shift pressed
					}else if ((over_gfc2) && (!shift) && (ctrl)){
						gf2.retract();//retracts field if only ctrl pressed
					}
					for (int i = gf2.r-5; i <= gf2.r; i++){
						g.drawOval(gf2.xc-i, gf2.yc-i, i * 2, i * 2);
					  //draws the circle that represents the field
					}
				}
				
				if (exists_efield){			
					g.setColor(e_color);
					if ((over_efc) && (!shift) && (!ctrl) && (!left) &&(!down) &&(!up) &&(!right)){
						g.fillOval(ef1.xc-5, ef1.yc-5, 10, 10);//same as gfield
					}else if ((over_efc) && (shift) && (!ctrl) && (!left) &&(!down) &&(!up) &&(!right)){
						ef1.extend();//alt also does something for an efield
						//that can't be pressed - extends with shift only
					}else if ((over_efc) && (!shift) && (ctrl) && (!left) &&(!down) &&(!up) &&(!right)){
						ef1.retract();//retracts - control only
					}else if ((over_efc) && (!shift) && (!ctrl) && (left) &&(!down) &&(!up) &&(!right)){
						ef1.flip(0);
					}else if ((over_efc) && (!shift) && (!ctrl) && (!left) &&(down) &&(!up) &&(!right)){
						ef1.flip(3);
					}else if ((over_efc) && (!shift) && (!ctrl) && (!left) &&(!down) &&(up) &&(!right)){
						ef1.flip(1);
					}else if ((over_efc) && (!shift) && (!ctrl) && (!left) &&(!down) &&(!up) &&(right)){
						ef1.flip(2);
					}
					for (int i = ef1.r-5; i <= ef1.r; i++){
						g.drawOval(ef1.xc-i, ef1.yc-i, i * 2, i * 2);
						g.drawArc(ef1.xc-i-10, ef1.yc-i-10, (i+10)*2, (i+10)*2, (((ef1.modkey+2)*-90)+30),-60);
					}//draws the oval, along with the arc that represents the efield        
				}
				if (exists_efield2){			
					g.setColor(e_color);
					if ((over_efc2) && (!shift) && (!ctrl) && (!left) &&(!down) &&(!up) &&(!right)){
						g.fillOval(ef2.xc-5, ef2.yc-5, 10, 10);//same as gfield
					}else if ((over_efc2) && (shift) && (!ctrl) && (!left) &&(!down) &&(!up) &&(!right)){
						ef2.extend();//alt also does something for an efield
						//that can't be pressed - extends with shift only
					}else if ((over_efc2) && (!shift) && (ctrl) && (!left) &&(!down) &&(!up) &&(!right)){
						ef2.retract();//retracts - control only
					}else if ((over_efc2) && (!shift) && (!ctrl) && (left) &&(!down) &&(!up) &&(!right)){
						ef2.flip(0);
					}else if ((over_efc2) && (!shift) && (!ctrl) && (!left) &&(down) &&(!up) &&(!right)){
						ef2.flip(3);
					}else if ((over_efc2) && (!shift) && (!ctrl) && (!left) &&(!down) &&(up) &&(!right)){
						ef2.flip(1);
					}else if ((over_efc2) && (!shift) && (!ctrl) && (!left) &&(!down) &&(!up) &&(right)){
						ef2.flip(2);
					}
					for (int i = ef2.r-5; i <= ef2.r; i++){
						g.drawOval(ef2.xc-i, ef2.yc-i, i * 2, i * 2);
						g.drawArc(ef2.xc-i-10, ef2.yc-i-10, (i+10)*2, (i+10)*2, (((ef2.modkey+2)*-90)+30),-60);
					  //draws the circle that represents the field
					} 

				}if (exists_tfield){
				g.setColor(t_color);
					if ((over_tfc) && (!shift) && (!ctrl)){//center clicked on
						g.fillOval(tf1.xc-5, tf1.yc-5, 10, 10);//draws small oval  
					}else if ((over_tfc) && (shift) && (!ctrl)){
						tf1.extend();//extends field if only shift pressed
					}else if ((over_tfc) && (!shift) && (ctrl)){
						tf1.retract();//retracts field if only ctrl pressed
					}
					for (int i = tf1.r-5; i <= tf1.r; i++){
						g.drawOval(tf1.xc-i, tf1.yc-i, i * 2, i * 2);
					  //draws the circle that represents the field
					}for (int i = 35; i <= 40; i++){
						g.drawOval(tf1.destx-i, tf1.desty-i, i * 2, i * 2);
					  //draws the circle that represents the field
					}
				}		
				
				if (exists_goal1){
					g.setColor(goal_color);
					for (int i = g1.r-5; i <= g1.r; i++){
						g.drawOval(g1.xc-i, g1.yc-i, i * 2, i * 2);
					  //draws the circle that represents the field
					}
				}
				if (exists_goal2){
					g.setColor(goal_color);
					for (int i = g2.r-5; i <= g2.r; i++){
						g.drawOval(g2.xc-i, g2.yc-i, i * 2, i * 2);
					  //draws the circle that represents the field
					}				
				}
				if (exists_goal3){
					g.setColor(goal_color);
					for (int i = g3.r-5; i <= g3.r; i++){
						g.drawOval(g3.xc-i, g3.yc-i, i * 2, i * 2);
					  //draws the circle that represents the field
					}				
				}
				
				if (exists_goal1){flux1 = calFlux(g1);}
				if (exists_goal2){flux2 = calFlux(g2);}
				if (exists_goal3){flux3 = calFlux(g3);}
				
				vicCondt();
			}else{
				if (lvidx != 7){
					g.drawImage(lvcs[(lvidx-1)%10], 0, 0, 450, 225, this);//put the picture on the screen
				}else{
					g.drawImage(lvcs[(lvidx-1)%10], 0, 0, 450, 300, this);//put the picture on the screen
				}
			}
		}
		
		public void vicCondt(){
			if ((flux1>3)&&(flux2>3)&&(flux3>3)){
				won = true;		
				replay = false;
			}
		}
		
		public void resetScrn(){
			if (exists_gfield){
				gf1.xc = 100;
				gf1.yc = 100;
				gf1.r = 50;
			}
			if (exists_gfield2){
				gf2.xc = 200;
				gf2.yc = 200;
				gf2.r = 50;
			}
			if (exists_efield){
				ef1.xc = 100;
				ef1.yc = 200;
				ef1.r = 50;
			}
			if (exists_efield2){
				ef2.xc = 200;
				ef2.yc = 100;
				ef2.r = 50;
			}
			if (exists_tfield){
				tf1.xc = 400;
				tf1.yc = 400;
				tf1.r = 50;
			}
			for (int i = 0 ; i < p_count ; i++){
				Particle x = plist.get(i);
				if (p_state == 1){//sideways
					x.x = rand.nextInt(500)+ix;
					x.y = rand.nextInt(30)+iy;
					x.dx = ivx;
					x.dy = ivy;
				}else if (p_state == -1){//bottom-top
					x.x = rand.nextInt(30)+ix;
					x.y = rand.nextInt(550)+iy;
					x.dx = ivx;
					x.dy = ivy;					
				}
			}
		}
		
	}	
	
	
	
	
	class Particle {
		
		//arguments - the main ones are x,y,dx,dy
		int x;          // ndx, ndy for resetting
		int y;
		int dx;         // x is x position, y
		int dy;         // dx as in dx/dt, dy
		int ndx;
		int ndy;
		Random rand;
		
		public Particle(int xi, int yi, int dxi, int dyi){ 
			//constructor that uses the 4 main parameters
			this.x = xi;                //^listed above
			this.y = yi;
			this.dx = dxi;
			this.dy = dyi;
			this.ndx = dxi;
			this.ndy = dyi;
			rand = new Random();
			
		}
		
		public void p_reset(int rx, int ry, int rdx1, int rdy1){    //brings particles back
								  //to where they started
			
			if ((x>500)||(x<0)){
				x = rand.nextInt(40)+rx;   //random nos used
				y = rand.nextInt(40)+ry;                    //to place particle
				p_nLize(rdx1, rdy1);                  //on screen
			}
			if ((y>500)||(y<0)){
				x = rand.nextInt(40)+rx;
				y = rand.nextInt(40)+ry;
				p_nLize(rdx1, rdy1);
			}
		}
		
		public void p_nLize(int rdx, int rdy){    //restores speed of
			
			dx = ndx;               //particles
			dy = ndy;     //ndx and ndy used to restore
			
		}
		public void p_in_gfield(int xc, int yc, int r){
			if ((x>xc-r)&&(x<xc+r)&&(y>yc-r)&&(y<yc+r)){
				dy += 1;   //condition to check whether particle
				//is in the given field
				//field pulls the particle downwards
				//dy plus c of some kind
			}
		}
		public void p_in_efield(int xc, int yc, int r, int xmod, int ymod){
			if ((x>xc-r)&&(x<xc+r)&&(y>yc-r)&&(y<yc+r)){
				dx += xmod;   //condition checks whether particle is in electric
				//field
				dy += ymod;   //electric field direction is variable
				//have 2 vars - ymod and xmod defined and taken from EField class
			}    
		}
		
		public void p_in_tfield(int xc, int yc, int r, int xf, int yf){
			if ((x>xc-(int)(0.5*r))&&(x<xc+(int)(0.5*r))&&(y>yc-r)&&(y<yc+r)){
				x = xf + (rand.nextInt(40)-20);   //condition checks whether particle is in electric
				//field
				y = yf + (rand.nextInt(40)-20);   //electric field direction is variable
				//have 2 vars - ymod and xmod defined and taken from EField class
			}  			
		}
		
	}
	
	
	
	class GField {

		int xc;  //3 parameters
		int yc;  //important: xc, yc are co-ordinates
									 //of the center
		int r;   //r is the radius
		//parameters used in methods in Tester
		
		boolean over_gfc;
		
		public GField(int xci, int yci, int ri){
			//accepts 3 main parameters
			this.xc = xci;   //initializes given user
			this.yc = yci;   //input
			this.r = ri;
			over_gfc = false;
		
		}
		
		public void extend(){
			if (this.r < 80){
				this.r += 2; //same as gfield
			}
		}
		public void retract(){
			if (this.r > 20){
				this.r -= 2;  //same as gfield
			}
		}

	}



	class EField {

		int xc;  //basic parameters
		int yc;  //xc is center of circle, y
		int r;   //r is radius
		int dxmod;    //dxmod and dymod are
		//special - e field changes x and y
		//so dxmod changes dx of particle, dymod
		//modifies dx
		int dymod;
		int[] xmodvals = {-1,0,1,0}; //array for 
		//dxmod and dymod to loop through
		int[] ymodvals = {0,-1,0,1};
		int modkey = 0; //determines state
		
		public EField(int xci, int yci, int ri){
			
			this.xc = xci;
			this.yc = yci;  //makes field
			//given specifics in the constructor
			this.r = ri;
			this.dxmod = xmodvals[modkey];
			this.dymod = ymodvals[modkey];
		
		}
		
		public void extend(){
			if (this.r < 80){
				this.r += 2; //same as gfield
			}
		}
		public void retract(){
			if (this.r > 20){
				this.r -= 2;  //same as gfield
			}
		}

		public void flip(int p){ //changes direction
		//of electric field - activated with alt
		//by changing modkey, the state changes
		//%4 to prevent overflow error
			modkey = p;
			dxmod = xmodvals[modkey];
			dymod = ymodvals[modkey];//change dymod, dxmod
		}

	}

	
	class TField {

		int xc;  //3 parameters
		int yc;  //important: xc, yc are co-ordinates
									 //of the center
		int r;   //r is the radius
		//parameters used in methods in Tester
		int destx;
		int desty;
		boolean over_tfc;
		
		public TField(int xci, int yci, int ri, int destxi, int destyi){
			//accepts 3 main parameters
			this.xc = xci;   //initializes given user
			this.yc = yci;   //input
			this.r = ri;
			this.destx = destxi;
			this.desty = destyi;
			over_tfc = false;
		
		}
		
		public void extend(){
			if (this.r < 80){
				this.r += 2; //same as gfield
			}
		}
		public void retract(){
			if (this.r > 20){
				this.r -= 2;  //same as gfield
			}
		}

	}
	
	
	class Goal {

		int xc;  //basic parameters
		int yc;  //xc is center of circle, y
		int r;   //r is radius
		
		public Goal(int xci, int yci, int ri){
			
			this.xc = xci;
			this.yc = yci;  //makes field
			//given specifics in the constructor
			this.r = ri;
		
		}
		
		
		
		

	}
	
	
}