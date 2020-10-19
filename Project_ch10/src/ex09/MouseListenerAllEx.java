package ex09;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerAllEx extends JFrame{
	private JLabel la = new JLabel("No Mouse Event");
	
	public MouseListenerAllEx() {
		setTitle("MouseListener¿Í MouseMotionListener ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseListener(listener);
		
		c.add(la);
		
		setSize(300,200);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("MouseDragged (" +e.getX()+","+e.getY()+")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("MouseMoved (" +e.getX()+","+e.getY()+")");
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.blue);
			la.setText("MousePressed (" +e.getX()+","+e.getY()+")");
			
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
			la.setText("MouseReleased (" +e.getX()+","+e.getY()+")");
			
		}
		
	}

	public static void main(String[] args) {
		new MouseListenerAllEx();
	}

}
