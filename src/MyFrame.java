import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	
	Calendar calendar;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Clock Programm *spooky* ");
		this.setLayout(new FlowLayout());
		this.setSize(350, 200);
		this.getContentPane().setBackground(Color.BLACK);
		
		ImageIcon image = new ImageIcon("ghostie.jpg");
		this.setIconImage(image.getImage());
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat = new SimpleDateFormat("EEEE");
		dateFormat = new SimpleDateFormat("MMM dd, yyyy");
		
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("TimesRoman",Font.BOLD,50));
		timeLabel.setForeground(new Color(255,00,00));
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("TimesRoman",Font.BOLD,35));
		dayLabel.setForeground(Color.DARK_GRAY);
		
		dateLabel = new JLabel();
		dateLabel.setFont(new Font("TimesRoman",Font.BOLD,25));
		
		time = timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);
		
		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		this.setVisible(true);
		
		setTime();
	}
	
	public void setTime() {
		while(true) {
		time = timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);
		day = dayFormat.format(Calendar.getInstance().getTime());
		dayLabel.setText(day);
		date = dateFormat.format(Calendar.getInstance().getTime());
		dateLabel.setText(date);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}

}
