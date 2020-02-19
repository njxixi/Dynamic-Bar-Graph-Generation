
import java.awt.*;

import javax.swing.*;

public class question2 {

	static BarFrame _bar1;
	static BarFrame _bar2;
	static BarFrame _bar3;
	static BarFrame _bar4;
	static BarFrame _bar5;
	static BarFrame _bar6;
	static BarFrame _bar7;

	static JLabel bar1 = new JLabel();

	static JLabel bar2 = new JLabel();
	static JLabel bar3 = new JLabel();
	static JLabel bar4 = new JLabel();
	static JLabel bar5 = new JLabel();
	static JLabel bar6 = new JLabel();
	static JLabel bar7 = new JLabel();

	private static int count1 = 0;
	private static int count2 = 0;
	private static int count3 = 0;
	private static int count4 = 0;
	private static int count5 = 0;
	private static int count6 = 0;
	private static int count7 = 0;

	public static void main(String[] args) {
		JFrame textFrame = new JFrame("Numbers");
		JLabel label = new JLabel("Change numbers below and press enter", JLabel.LEFT);
		label.setAlignmentX(0);
		label.setAlignmentY(0);
		textFrame.add(label);
		JTextField t1 = new JTextField(50);
		JTextField t2 = new JTextField(50);
		JTextField t3 = new JTextField(50);
		JTextField t4 = new JTextField(50);
		JTextField t5 = new JTextField(50);
		JTextField t6 = new JTextField(50);
		JTextField t7 = new JTextField(50);
		textFrame.add(t1);
		textFrame.add(t2);
		textFrame.add(t3);
		textFrame.add(t4);
		textFrame.add(t5);
		textFrame.add(t6);
		textFrame.add(t7);
		textFrame.setLayout(new FlowLayout());
		textFrame.setBounds(0, 100, 800, 600);
		textFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textFrame.setVisible(true);

		JFrame graph = new JFrame("Graph");

		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));

		container.add(bar1);

		container.add(bar2);

		container.add(bar3);

		container.add(bar4);

		container.add(bar5);

		container.add(bar6);

		container.add(bar7);

		graph.setLayout(new BoxLayout(graph.getContentPane(), BoxLayout.X_AXIS));
		graph.setBounds(900, 100, 800, 300);

		graph.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		graph.setVisible(true);

		t1.addActionListener(event -> {
			String s1 = t1.getText();
			int i1 = Integer.parseInt(s1);
			if (count1 == 0) {
				_bar1 = new BarFrame(i1);

				bar1 = new JLabel(_bar1);
				bar1.setText(s1);
				;
				bar1.setHorizontalTextPosition(SwingConstants.CENTER);
				bar1.setVerticalTextPosition(SwingConstants.TOP);
			} else {
				_bar1.setIconHeight(i1);
				bar1.setText(s1);
				bar1.setHorizontalTextPosition(SwingConstants.CENTER);
				bar1.setVerticalTextPosition(SwingConstants.TOP);
			}
			container.removeAll();
			container.add(bar1);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar2);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar3);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar4);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar5);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar6);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar7);
			graph.add(container);
			bar1.repaint();
			bar1.updateUI();
			count1++;
		});

		t2.addActionListener(event -> {
			String s2 = t2.getText();
			int i2 = Integer.parseInt(s2);
			if (count2 == 0) {
				_bar2 = new BarFrame(i2);
				bar2 = new JLabel(_bar2);
				bar2.setText(s2);
				bar2.setHorizontalTextPosition(SwingConstants.CENTER);
				bar2.setVerticalTextPosition(SwingConstants.TOP);

			} else {

				_bar2.setIconHeight(i2);
				bar2.setText(s2);
				bar2.setHorizontalTextPosition(SwingConstants.CENTER);
				bar2.setVerticalTextPosition(SwingConstants.TOP);

			}
			container.removeAll();
			container.add(bar1);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar2);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar3);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar4);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar5);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar6);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar7);
			graph.add(container);
			bar2.repaint();
			bar2.updateUI();
			count2++;
		});

		t3.addActionListener(event -> {
			String s3 = t3.getText();
			int i3 = Integer.parseInt(s3);
			if (count3 == 0) {
				_bar3 = new BarFrame(i3);
				bar3 = new JLabel(_bar3);
				bar3.setText(s3);
				bar3.setHorizontalTextPosition(SwingConstants.CENTER);
				bar3.setVerticalTextPosition(SwingConstants.TOP);

			} else {
				_bar3.setIconHeight(i3);
				bar3.setText(s3);
				bar3.setHorizontalTextPosition(SwingConstants.CENTER);
				bar3.setVerticalTextPosition(SwingConstants.TOP);

			}
			container.add(bar1);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar2);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar3);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar4);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar5);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar6);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar7);
			graph.add(container);
			bar3.repaint();
			bar3.updateUI();
			count3++;
		});

		t4.addActionListener(event -> {
			String s4 = t4.getText();
			int i4 = Integer.parseInt(s4);
			if (count4 == 0) {
				_bar4 = new BarFrame(i4);
				bar4 = new JLabel(_bar4);
				bar4.setText(s4);
				bar4.setHorizontalTextPosition(SwingConstants.CENTER);
				bar4.setVerticalTextPosition(SwingConstants.TOP);

			} else {
				_bar4.setIconHeight(i4);
				bar4.setText(s4);
				bar4.setHorizontalTextPosition(SwingConstants.CENTER);
				bar4.setVerticalTextPosition(SwingConstants.TOP);

			}
			container.add(bar1);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar2);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar3);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar4);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar5);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar6);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar7);
			graph.add(container);
			bar4.repaint();
			bar4.updateUI();
			count4++;
		});

		t5.addActionListener(event -> {
			String s5 = t5.getText();
			int i5 = Integer.parseInt(s5);
			if (count5 == 0) {
				_bar5 = new BarFrame(i5);
				bar5 = new JLabel(_bar5);
				bar5.setText(s5);
				bar5.setHorizontalTextPosition(SwingConstants.CENTER);
				bar5.setVerticalTextPosition(SwingConstants.TOP);

			} else {
				_bar5.setIconHeight(i5);
				bar5.setText(s5);
				bar5.setHorizontalTextPosition(SwingConstants.CENTER);
				bar5.setVerticalTextPosition(SwingConstants.TOP);

			}
			container.removeAll();
			container.add(bar1);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar2);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar3);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar4);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar5);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar6);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar7);
			graph.add(container);
			bar5.repaint();
			bar5.updateUI();
			count5++;
		});
		t6.addActionListener(event -> {
			String s6 = t6.getText();
			int i6 = Integer.parseInt(s6);
			if (count6 == 0) {
				_bar6 = new BarFrame(i6);
				bar6 = new JLabel(_bar6);
				bar6.setText(s6);
				bar6.setHorizontalTextPosition(SwingConstants.CENTER);
				bar6.setVerticalTextPosition(SwingConstants.TOP);

			} else {
				_bar6.setIconHeight(i6);
				bar6.setText(s6);
				bar6.setHorizontalTextPosition(SwingConstants.CENTER);
				bar6.setVerticalTextPosition(SwingConstants.TOP);

			}
			container.removeAll();
			container.add(bar1);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar2);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar3);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar4);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar5);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar6);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar7);
			graph.add(container);
			bar6.repaint();
			bar6.updateUI();
			count6++;
		});
		t7.addActionListener(event -> {
			String s7 = t7.getText();
			int i7 = Integer.parseInt(s7);
			if (count7 == 0) {
				_bar7 = new BarFrame(i7);
				bar7 = new JLabel(_bar7);
				bar7.setText(s7);
				bar7.setHorizontalTextPosition(SwingConstants.CENTER);
				bar7.setVerticalTextPosition(SwingConstants.TOP);

			} else {
				_bar7.setIconHeight(i7);
				bar7.setText(s7);
				bar7.setHorizontalTextPosition(SwingConstants.CENTER);
				bar7.setVerticalTextPosition(SwingConstants.TOP);

			}
			container.removeAll();
			container.add(bar1);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar2);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar3);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar4);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar5);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar6);
			container.add(Box.createHorizontalStrut(5));
			container.add(bar7);
			graph.add(container);
			bar7.repaint();
			bar7.updateUI();
			count7++;
		});
	}
}
