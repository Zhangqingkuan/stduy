package wuziqi;
 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
 
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
 
public class GobangMain extends JPanel implements Gobang {
 
 
	public static void main(String[] args) {
		GobangMain gm = new GobangMain();
		gm.initUI();
	}
 
	public void initUI() {
		JFrame frame = new JFrame("������");
		frame.setSize(780, 635);
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(new BorderLayout());
 
		// �����������ı�����ɫ
		this.setBackground(Color.LIGHT_GRAY);
		// �����������ӵ�������м䲿��
		frame.add(this, BorderLayout.CENTER);
 
		// ʵ����JPanel��������Ϊ���߷��ð�ť�����
		JPanel eastPanel = new JPanel();
		// ���ö������Ĳ��ַ�ʽΪ��ʽ���־��ж���
		eastPanel.setLayout(new FlowLayout());
		// ���������������Ŀ�Ⱥ͸߶�
		eastPanel.setPreferredSize(new Dimension(150, 0));
 
		// ʵ������ѡ��ť�������
		ButtonGroup bg = new ButtonGroup();
 
		// ʵ�����¼�������Ķ���Ȼ�����������Ϊ�������ݵ�GobangListener��Ķ�����
		GobangListener gl = new GobangListener(this, array);
 
		// �������飬�洢�����Ҫ��ʾ��������Ϣ
		String[] array = { "��ʼ����Ϸ", "����", "����", "��սģʽ��", "���˶�ս", "�˻���ս" };
		for (int i = 0; i < array.length; i++) {
			if (i < 3) {
				JButton button = new JButton(array[i]);
				button.setPreferredSize(new Dimension(140, 80));
				eastPanel.add(button);
				button.addActionListener(gl);
			} else if (i == 3) {
				JLabel label = new JLabel(array[i]);
				eastPanel.add(label);
			} else {
				JRadioButton button = new JRadioButton(array[i]);
				button.setSelected(false);
				bg.add(button);
				eastPanel.add(button);
				button.addActionListener(gl);
			}
		}
 
		// ��eastPanel��ӵ������ϵĶ���
		frame.add(eastPanel, BorderLayout.EAST);
		frame.setVisible(true);
	}
 
 
	private MyArrayList<Chess> array = new MyArrayList<Chess>();
 
	public void paint(Graphics g) {
		super.paint(g);
		// System.out.println(">>>");
		for (int i = 0; i < coloum; i++) {
			g.drawLine(X, Y + size * i, X + size * (coloum - 1), Y + size * i);// ���� //����40
			g.drawLine(X + size * i, Y, X + size * i, Y + size * (coloum - 1));// ���� //����40
		}
 
		for (int i = 0; i < array.getSize(); i++) {
			Chess e = array.get(i);
			g.setColor(e.color);
			g.fillOval(X + e.coloum * size - size / 2, Y + e.row * size - size / 2, size, size);
		}
	}
 
}
