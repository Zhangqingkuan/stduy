package wuziqi;


 
public interface Gobang {
	public static final int size = 40; // ���ø��Ӵ�СΪ40
	public static final int X = 20, Y = 20; // �����������Ͻǵ�λ��
	public static final int coloum = 15;    //��������
	public static final int row = 15;       //��������
	public static final int[][] array1 = new int[coloum][row];   //��¼����λ�õ�����
	public static final int[][] weightArray = new int[coloum][row];    //��¼����ÿ��λ�õ�Ȩֵ
	public static final boolean flag[] = new boolean[2];    //��¼ѡ���ģʽ
}

