package wuziqi;
 
public class Judge implements Gobang {
	private int x, y;
	private int count;
 
	public Judge(int x, int y) {
		this.x = x;
		this.y = y;
	}
 
	boolean judge() {
		if (judge1(x, y) >= 5)
			return true;
		return false;
	}
 
	public int judge1(int x1, int y2) {
 
		// ������
		count = 1;
		for (int i = x1 + 1; i < coloum; i++) {
			if (array1[x1][y2] != 0) {
				if (array1[x1][y2] == array1[i][y2]) {
					count++;
				} else
					break;
			} else
				break;
		}
		for (int i = x1 - 1; i >= 0; i--) {
			if (array1[x1][y2] != 0) {
				if (array1[x1][y2] == array1[i][y2]) {
					count++;
				} else
					break;
			} else
				break;
		}
 
		if (count >= 5)
			return count;
 
		// ������
		count = 1;
		for (int i = y2 + 1; i < row; i++) {
			if (array1[x1][y2] != 0) {
				if (array1[x1][y2] == array1[x1][i]) {
					count++;
				} else
					break;
			} else
				break;
		}
		for (int i = y2 - 1; i >= 0; i--) {
			if (array1[x1][y2] != 0) {
				if (array1[x1][y2] == array1[x1][i]) {
					count++;
				} else
					break;
			} else
				break;
		}
 
		if (count >= 5)
			return count;
 
		// б����
		count = 1;
		// ���ϵ�����
		for (int i = x1 + 1, j = y2 + 1; i < coloum && j < row; i++, j++) {
			if (array1[x1][y2] != 0) {
				if (array1[x1][y2] == array1[i][j]) {
					count++;
				} else
					break;
			} else
				break;
		}
		// ���µ�����
		for (int i = x1 - 1, j = y2 - 1; i >= 0 && j >= 0; i--, j--) {
			if (array1[x1][y2] != 0) {
				if (array1[x1][y2] == array1[i][j]) {
					count++;
				} else
					break;
			} else
				break;
		}
		if (count >= 5)
			return count;
 
		count = 1;
		// ���µ�����
		for (int i = x1 + 1, j = y2 - 1; i < coloum && j >= 0; i++, j--) {
			if (array1[x1][y2] != 0) {
				if (array1[x1][y2] == array1[i][j]) {
					count++;
				} else
					break;
			} else
				break;
		}
		// ���ϵ�����
		for (int i = x1 - 1, j = y2 + 1; i >= 0 && j < row; i--, j++) {
			if (array1[x1][y2] != 0) {
				if (array1[x1][y2] == array1[i][j]) {
					count++;
				} else
					break;
			} else
				break;
		}
 
		return count;
 
	}
}