
package wuziqi;
 
import java.util.HashMap;
 
public class AI implements Gobang {
	static HashMap<String, Integer> map = new HashMap<String, Integer>();
	static {
 
		/**
		 * Ȩֵ
		 */
		// ����Ȩֵ
		// ��1��
		map.put("010", 20);
		map.put("0-10", 10);
		// ��1��
		map.put("-110", 1);
		map.put("1-10", 1);
		// ��2��
		map.put("0110", 200);
		map.put("0-1-10", 100);
		// ��2��
		map.put("-1110", 20);
		map.put("1-1-10", 10);
		// ��3��
		map.put("01110", 7000);
		map.put("0-1-1-10", 5000);
		// ��3��
		map.put("-11110", 50);
		map.put("1-1-1-10", 30);
		// ��4��
		map.put("011110", 10000);
		map.put("0-1-1-1-10", 10000);
		// ��4��
		map.put("-111110", 10000);
		map.put("1-1-1-1-10", 10000);
		// ������4��
		map.put("11110", 10000);
		map.put("-1-1-1-10", 10000);
 
		// //����Ȩֵ
		// //��1��
		// map.put("010",10);
		// map.put("0-10",20);
		// //��1��
		// map.put("-110",1);
		// map.put("1-10",1);
		// //��2��
		// map.put("0110", 100);
		// map.put("0-1-10",200);
		// //��2��
		// map.put("-1110",10);
		// map.put("1-1-10",20);
		// //��3��
		// map.put("01110", 5000);
		// map.put("0-1-1-10",7000);
		// //��3��
		// map.put("-11110",30);
		// map.put("1-1-1-10",50);
		// //��4��
		// map.put("011110", 10000);
		// map.put("0-1-1-1-10",10000);
		// //��4��
		// map.put("-111110",10000);
		// map.put("1-1-1-1-10",10000);
		// //������4��
		// map.put("11110", 10000);
		// map.put("-1-1-1-10", 15000);
	}
 
	static String code;
	static Integer weight;
 
	public static void Quan() {
		for (int r = 0; r < array1.length; r++) {
			for (int c = 0; c < array1[r].length; c++) {
				if (array1[r][c] == 0) {// �����λ��û��������ʼͳ��
					code = countHL(r, c);// ����ˮƽ����ͳ�Ƶķ���
					weight = map.get(code);// �����������������ȡ��Ӧ��Ȩֵ
					if (weight != null) {// �ж��Ƿ��и����������������
						weightArray[r][c] += weight;// �ۼ�Ȩֵ
					}
					// �������߸�����ͳ����Ϻ󣬾����Ȩֵͳ��
					code = countHR(r, c);// ����ˮƽ����ͳ�Ƶķ���
					weight = map.get(code);// �����������������ȡ��Ӧ��Ȩֵ
					if (weight != null) {// �ж��Ƿ��и����������������
						weightArray[r][c] += weight;// �ۼ�Ȩֵ
					}
 
					code = countHT(r, c);// ����ˮƽ����ͳ�Ƶķ���
					weight = map.get(code);// �����������������ȡ��Ӧ��Ȩֵ
					if (weight != null) {// �ж��Ƿ��и����������������
						weightArray[r][c] += weight;// �ۼ�Ȩֵ
					}
 
					code = countHB(r, c);// ����ˮƽ����ͳ�Ƶķ���
					weight = map.get(code);// �����������������ȡ��Ӧ��Ȩֵ
					if (weight != null) {// �ж��Ƿ��и����������������
						weightArray[r][c] += weight;// �ۼ�Ȩֵ
					}
 
					code = countHZXS(r, c);// ����ˮƽ����ͳ�Ƶķ���
					weight = map.get(code);// �����������������ȡ��Ӧ��Ȩֵ
					if (weight != null) {// �ж��Ƿ��и����������������
						weightArray[r][c] += weight;// �ۼ�Ȩֵ
					}
 
					code = countHYXS(r, c);// ����ˮƽ����ͳ�Ƶķ���
					weight = map.get(code);// �����������������ȡ��Ӧ��Ȩֵ
					if (weight != null) {// �ж��Ƿ��и����������������
						weightArray[r][c] += weight;// �ۼ�Ȩֵ
					}
 
					code = countHZXX(r, c);// ����ˮƽ����ͳ�Ƶķ���
					weight = map.get(code);// �����������������ȡ��Ӧ��Ȩֵ
					if (weight != null) {// �ж��Ƿ��и����������������
						weightArray[r][c] += weight;// �ۼ�Ȩֵ
					}
 
					code = countHYXX(r, c);// ����ˮƽ����ͳ�Ƶķ���
					weight = map.get(code);// �����������������ȡ��Ӧ��Ȩֵ
					if (weight != null) {// �ж��Ƿ��и����������������
						weightArray[r][c] += weight;// �ۼ�Ȩֵ
					}
 
					// �ж�����2����һ��ֱ�ߵ��м���һ����λ�����
					if ((countHL(r, c) + countHR(r, c) == "01100110")
							|| (countHL(r, c) + countHR(r, c) == "0-1-100-1-10")
							|| (countHL(r, c) + countHR(r, c) == "-11100110")
							|| (countHL(r, c) + countHR(r, c) == "1-1-100-1-10")
							|| (countHL(r, c) + countHR(r, c) == "0110-1110")
							|| (countHL(r, c) + countHR(r, c) == "0-1-101-1-10")
							|| (countHL(r, c) + countHR(r, c) == "-1110-1110")
							|| (countHL(r, c) + countHR(r, c) == "1-1-101-1-10")) {
						weightArray[r][c] = weightArray[r][c] + 5000;
					}
 
					if ((countHT(r, c) + countHB(r, c) == "01100110")
							|| (countHT(r, c) + countHB(r, c) == "0-1-100-1-10")
							|| (countHT(r, c) + countHB(r, c) == "-11100110")
							|| (countHT(r, c) + countHB(r, c) == "1-1-100-1-10")
							|| (countHT(r, c) + countHB(r, c) == "0110-1110")
							|| (countHT(r, c) + countHB(r, c) == "0-1-101-1-10")
							|| (countHT(r, c) + countHB(r, c) == "-1110-1110")
							|| (countHT(r, c) + countHB(r, c) == "1-1-101-1-10")) {
						weightArray[r][c] = weightArray[r][c] + 5000;
					}
 
					if ((countHZXS(r, c) + countHYXX(r, c) == "01100110")
							|| (countHZXS(r, c) + countHYXX(r, c) == "0-1-100-1-10")
							|| (countHZXS(r, c) + countHYXX(r, c) == "-11100110")
							|| (countHZXS(r, c) + countHYXX(r, c) == "1-1-100-1-10")
							|| (countHZXS(r, c) + countHYXX(r, c) == "0110-1110")
							|| (countHZXS(r, c) + countHYXX(r, c) == "0-1-101-1-10")
							|| (countHZXS(r, c) + countHYXX(r, c) == "-1110-1110")
							|| (countHZXS(r, c) + countHYXX(r, c) == "1-1-101-1-10")) {
						weightArray[r][c] = weightArray[r][c] + 5000;
					}
 
					if ((countHYXS(r, c) + countHZXX(r, c) == "01100110")
							|| (countHYXS(r, c) + countHZXX(r, c) == "0-1-100-1-10")
							|| (countHYXS(r, c) + countHZXX(r, c) == "-11100110")
							|| (countHYXS(r, c) + countHZXX(r, c) == "1-1-100-1-10")
							|| (countHYXS(r, c) + countHZXX(r, c) == "0110-1110")
							|| (countHYXS(r, c) + countHZXX(r, c) == "0-1-101-1-10")
							|| (countHYXS(r, c) + countHZXX(r, c) == "-1110-1110")
							|| (countHYXS(r, c) + countHZXX(r, c) == "1-1-101-1-10")) {
						weightArray[r][c] = weightArray[r][c] + 5000;
					}
 
					// �ж�һ����2����һ����1����һ��ֱ���ϵ��м���һ����λ�����
					if ((countHL(r, c) + countHR(r, c) == "0100110") || (countHL(r, c) + countHR(r, c) == "0-100-1-10")
							|| (countHL(r, c) + countHR(r, c) == "0110010")
							|| (countHL(r, c) + countHR(r, c) == "0-1-100-10")) {
						weightArray[r][c] = weightArray[r][c] + 3000;
					}
 
					if ((countHT(r, c) + countHB(r, c) == "0100110") || (countHT(r, c) + countHB(r, c) == "0-100-1-10")
							|| (countHT(r, c) + countHB(r, c) == "0110010")
							|| (countHT(r, c) + countHB(r, c) == "0-1-100-10")) {
						weightArray[r][c] = weightArray[r][c] + 3000;
					}
 
					if ((countHZXS(r, c) + countHYXX(r, c) == "0100110")
							|| (countHZXS(r, c) + countHYXX(r, c) == "0-100-1-10")
							|| (countHZXS(r, c) + countHYXX(r, c) == "0110010")
							|| (countHZXS(r, c) + countHYXX(r, c) == "0-1-100-10")) {
						weightArray[r][c] = weightArray[r][c] + 3000;
					}
 
					if ((countHYXS(r, c) + countHZXX(r, c) == "0100110")
							|| (countHYXS(r, c) + countHZXX(r, c) == "0-100-1-10")
							|| (countHYXS(r, c) + countHZXX(r, c) == "0110010")
							|| (countHYXS(r, c) + countHZXX(r, c) == "0-1-100-10")) {
						weightArray[r][c] = weightArray[r][c] + 3000;
					}
 
					// ��3����һ�˱�����
					// "1-1-1-10"&"010" "0-1-1-10"&"010"
					if ((countHL(r, c) + countHR(r, c) == "1-1-1-10010")
							|| (countHL(r, c) + countHR(r, c) == "0101-1-1-10")
							|| (countHL(r, c) + countHR(r, c) == "1-1-1-100")
							|| (countHL(r, c) + countHR(r, c) == "01-1-1-10")
							|| (countHL(r, c) + countHR(r, c) == "1-1-1-100110")
							|| (countHL(r, c) + countHR(r, c) == "01101-1-1-10")) {
						weightArray[r][c] = 1;
					}
 
					if ((countHT(r, c) + countHB(r, c) == "1-1-1-10010")
							|| (countHT(r, c) + countHB(r, c) == "0101-1-1-10")
							|| (countHT(r, c) + countHB(r, c) == "1-1-1-100")
							|| (countHT(r, c) + countHB(r, c) == "01-1-1-10")
							|| (countHT(r, c) + countHB(r, c) == "1-1-1-100110")
							|| (countHT(r, c) + countHB(r, c) == "01101-1-1-10")) {
						weightArray[r][c] = 1;
						;
					}
 
					if ((countHZXS(r, c) + countHYXX(r, c) == "1-1-1-10010")
							|| (countHZXS(r, c) + countHYXX(r, c) == "0101-1-1-10")
							|| (countHZXS(r, c) + countHYXX(r, c) == "1-1-1-100")
							|| (countHZXS(r, c) + countHYXX(r, c) == "01-1-1-10")
							|| (countHZXS(r, c) + countHYXX(r, c) == "1-1-1-100110")
							|| (countHZXS(r, c) + countHYXX(r, c) == "01101-1-1-10")) {
						weightArray[r][c] = 1;
					}
 
					if ((countHYXS(r, c) + countHZXX(r, c) == "1-1-1-10010")
							|| (countHYXS(r, c) + countHZXX(r, c) == "0101-1-1-10")
							|| (countHYXS(r, c) + countHZXX(r, c) == "1-1-1-100")
							|| (countHYXS(r, c) + countHZXX(r, c) == "01-1-1-10")
							|| (countHYXS(r, c) + countHZXX(r, c) == "1-1-1-100110")
							|| (countHYXS(r, c) + countHZXX(r, c) == "01101-1-1-10")) {
						weightArray[r][c] = 1;
					}
 
					// 3����1����һ�����ϲ�һ����λ
					if ((countHL(r, c) + countHR(r, c) == "0-1-1-100-10")
							|| (countHL(r, c) + countHR(r, c) == "0-101-1-1-10")
							|| (countHL(r, c) + countHR(r, c) == "01110010")
							|| (countHL(r, c) + countHR(r, c) == "010-11110")
							|| (countHL(r, c) + countHR(r, c) == "0-100-1-1-10")
							|| (countHL(r, c) + countHR(r, c) == "1-1-1-100-10")
							|| (countHL(r, c) + countHR(r, c) == "01001110")
							|| (countHL(r, c) + countHR(r, c) == "-11110010")) {
						weightArray[r][c] = weightArray[r][c] + 4000;
					}
 
					if ((countHT(r, c) + countHB(r, c) == "0-1-1-100-10")
							|| (countHT(r, c) + countHB(r, c) == "0-101-1-1-10")
							|| (countHT(r, c) + countHB(r, c) == "01110010")
							|| (countHT(r, c) + countHB(r, c) == "010-11110")
							|| (countHT(r, c) + countHB(r, c) == "0-100-1-1-10")
							|| (countHT(r, c) + countHB(r, c) == "1-1-1-100-10")
							|| (countHT(r, c) + countHB(r, c) == "01001110")
							|| (countHT(r, c) + countHB(r, c) == "-11110010")) {
						weightArray[r][c] = weightArray[r][c] + 4000;
					}
 
					if ((countHZXS(r, c) + countHYXX(r, c) == "0-1-1-100-10")
							|| (countHZXS(r, c) + countHYXX(r, c) == "0-101-1-1-10")
							|| (countHZXS(r, c) + countHYXX(r, c) == "01110010")
							|| (countHZXS(r, c) + countHYXX(r, c) == "010-11110")
							|| (countHZXS(r, c) + countHYXX(r, c) == "0-100-1-1-10")
							|| (countHZXS(r, c) + countHYXX(r, c) == "1-1-1-100-10")
							|| (countHZXS(r, c) + countHYXX(r, c) == "01001110")
							|| (countHZXS(r, c) + countHYXX(r, c) == "-11110010")) {
						weightArray[r][c] = weightArray[r][c] + 4000;
					}
 
					if ((countHYXS(r, c) + countHZXX(r, c) == "0-1-1-100-10")
							|| (countHYXS(r, c) + countHZXX(r, c) == "0-101-1-1-10")
							|| (countHYXS(r, c) + countHZXX(r, c) == "01110010")
							|| (countHYXS(r, c) + countHZXX(r, c) == "010-11110")
							|| (countHYXS(r, c) + countHZXX(r, c) == "0-100-1-1-10")
							|| (countHYXS(r, c) + countHZXX(r, c) == "1-1-1-100-10")
							|| (countHYXS(r, c) + countHZXX(r, c) == "01001110")
							|| (countHYXS(r, c) + countHZXX(r, c) == "-11110010")) {
						weightArray[r][c] = weightArray[r][c] + 4000;
					}
				}
			}
		}
	}
 
	// ˮƽ����ͳ�Ƶķ���
	public static String countHL(int r, int c) {
		String code = "0";
		int chess = 0;// �洢��һ�ų��ֵ�����
		// ѭ������
		for (int r1 = r - 1; r1 >= 0; r1--) {
			if (array1[r1][c] == 0) {// ��ʾ��λ�]������
				if (r1 + 1 == r) {// ����
					break;
				} else {
					code = array1[r1][c] + code;// ��¼�����������
					break;
				}
			} else {// ��ʾ��λ��������
				if (chess == 0) {// ��һ�γ�������
					chess = array1[r1][c];// ��¼����
					code = array1[r1][c] + code;// ��¼�����������
				} else if (chess == array1[r1][c]) {
					code = array1[r1][c] + code;// ��¼�����������
				} else {
					code = array1[r1][c] + code;// ��¼�����������
					break;
				}
			}
		}
		return code;
	}
 
	// ˮƽ����ͳ�Ƶķ���
	public static String countHR(int r, int c) {
		String code = "0";
		int chess = 0;// �洢��һ�ų��ֵ�����
		// ѭ������
		for (int r1 = r + 1; r1 < coloum; r1++) {
			if (array1[r1][c] == 0) {// ��ʾ��λ�]������
				if (r1 - 1 == r) {// ����
					break;
				} else {
					code = array1[r1][c] + code;// ��¼�����������
					break;
				}
			} else {// ��ʾ��λ��������
				if (chess == 0) {// ��һ�γ�������
					chess = array1[r1][c];// ��¼����
					code = array1[r1][c] + code;// ��¼�����������
				} else if (chess == array1[r1][c]) {
					code = array1[r1][c] + code;// ��¼�����������
				} else {
					code = array1[r1][c] + code;// ��¼�����������
					break;
				}
			}
		}
		return code;
	}
 
	// ��ֱ����ͳ�Ƶķ���
	public static String countHT(int r, int c) {
		String code = "0";
		int chess = 0;// �洢��һ�ų��ֵ�����
		// ѭ������
		for (int c1 = c - 1; c1 >= 0; c1--) {
			if (array1[r][c1] == 0) {// ��ʾ��λ�]������
				if (c1 + 1 == r) {// ����
					break;
				} else {
					code = array1[r][c1] + code;// ��¼�����������
					break;
				}
			} else {// ��ʾ��λ��������
				if (chess == 0) {// ��һ�γ�������
					chess = array1[r][c1];// ��¼����
					code = array1[r][c1] + code;// ��¼�����������
				} else if (chess == array1[r][c1]) {
					code = array1[r][c1] + code;// ��¼�����������
				} else {
					code = array1[r][c1] + code;// ��¼�����������
					break;
				}
			}
		}
		return code;
	}
 
	// ��ֱ����ͳ�Ƶķ���
	public static String countHB(int r, int c) {
		String code = "0";
		int chess = 0;// �洢��һ�ų��ֵ�����
		// ѭ������
		for (int c1 = c + 1; c1 < row; c1++) {
			if (array1[r][c1] == 0) {// ��ʾ��λ�]û������
				if (c1 - 1 == c) {// ����
					break;
				} else {
					code = array1[r][c1] + code;// ��¼�����������
					break;
				}
			} else {// ��ʾ��λ��������
				if (chess == 0) {// ��һ�γ�������
					chess = array1[r][c1];// ��¼����
					code = array1[r][c1] + code;// ��¼�����������
				} else if (chess == array1[r][c1]) {
					code = array1[r][c1] + code;// ��¼�����������
				} else {
					code = array1[r][c1] + code;// ��¼�����������
					break;
				}
			}
		}
		return code;
	}
 
	// ��б����ͳ�Ƶķ���
	public static String countHZXS(int r, int c) {
		String code = "0";
		int chess = 0;// �洢��һ�ų��ֵ�����
		// ѭ������
		for (int r1 = r - 1, c1 = c - 1; r1 >= 0 && c1 >= 0; r1--, c1--) {
			if (array1[r1][c1] == 0) {// ��ʾ��λ�]������
				if (c1 + 1 == c && r1 + 1 == r) {// ����
					break;
				} else {
					code = array1[r1][c1] + code;// ��¼�����������
					break;
				}
			} else {// ��ʾ��λ��������
				if (chess == 0) {// ��һ�γ�������
					chess = array1[r1][c1];// ��¼����
					code = array1[r1][c1] + code;// ��¼�����������
				} else if (chess == array1[r1][c1]) {
					code = array1[r1][c1] + code;// ��¼�����������
				} else {
					code = array1[r1][c1] + code;// ��¼�����������
					break;
				}
			}
		}
		return code;
	}
 
	// ��б����ͳ�Ƶķ���
	public static String countHYXS(int r, int c) {
		String code = "0";
		int chess = 0;// �洢��һ�ų��ֵ�����
		// ѭ������
		for (int r1 = r + 1, c1 = c - 1; c1 >= 0 && r1 < coloum; r1++, c1--) {
			if (array1[r1][c1] == 0) {// ��ʾ��λ�]������
				if (r1 - 1 == r && c1 + 1 == c) {// ����
					break;
				} else {
					code = array1[r1][c1] + code;// ��¼�����������
					break;
				}
			} else {// ��ʾ��λ��������
				if (chess == 0) {// ��һ�γ�������
					chess = array1[r1][c1];// ��¼����
					code = array1[r1][c1] + code;// ��¼�����������
				} else if (chess == array1[r1][c1]) {
					code = array1[r1][c1] + code;// ��¼�����������
				} else {
					code = array1[r1][c1] + code;// ��¼�����������
					break;
				}
			}
		}
		return code;
	}
 
	// ��б����ͳ�Ƶķ���
	public static String countHZXX(int r, int c) {
		String code = "0";
		int chess = 0;// �洢��һ�ų��ֵ�����
		// ѭ������
		for (int r1 = r - 1, c1 = c + 1; c1 < row && r1 >= 0; c1++, r1--) {
			if (array1[r1][c1] == 0) {// ��ʾ��λ�]������
				if (c1 - 1 == c && r1 + 1 == r) {// ����
					break;
				} else {
					code = array1[r1][c1] + code;// ��¼�����������
					break;
				}
			} else {// ��ʾ��λ��������
				if (chess == 0) {// ��һ�γ�������
					chess = array1[r1][c1];// ��¼����
					code = array1[r1][c1] + code;// ��¼�����������
				} else if (chess == array1[r1][c1]) {
					code = array1[r1][c1] + code;// ��¼�����������
				} else {
					code = array1[r1][c1] + code;// ��¼�����������
					break;
				}
			}
		}
		return code;
	}
 
	// ��б����ͳ�Ƶķ���
	public static String countHYXX(int r, int c) {
		String code = "0";
		int chess = 0;// �洢��һ�ų��ֵ�����
		// ѭ������
		for (int r1 = r + 1, c1 = c + 1; r1 < coloum && c1 < row; r1++, c1++) {
			if (array1[r1][c1] == 0) {// ��ʾ��λ�]������
				if (c1 - 1 == c && r1 - 1 == r) {// ����
					break;
				} else {
					code = array1[r1][c1] + code;// ��¼�����������
					break;
				}
			} else {// ��ʾ��λ��������
				if (chess == 0) {// ��һ�γ�������
					chess = array1[r1][c1];// ��¼����
					code = array1[r1][c1] + code;// ��¼�����������
				} else if (chess == array1[r1][c1]) {
					code = array1[r1][c1] + code;// ��¼�����������
				} else {
					code = array1[r1][c1] + code;// ��¼�����������
					break;
				}
			}
		}
		return code;
	}
}
