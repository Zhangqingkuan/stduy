package wuziqi;


 
public interface Gobang {
	public static final int size = 40; // 设置格子大小为40
	public static final int X = 20, Y = 20; // 设置棋盘右上角的位置
	public static final int coloum = 15;    //设置行数
	public static final int row = 15;       //设置列数
	public static final int[][] array1 = new int[coloum][row];   //记录棋子位置的数组
	public static final int[][] weightArray = new int[coloum][row];    //记录棋盘每个位置的权值
	public static final boolean flag[] = new boolean[2];    //记录选择的模式
}

