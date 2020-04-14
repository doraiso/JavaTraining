package algorithm;

/**
 * 3の倍数か3がつく数字でアホを表示するプログラム
 *
 */
public class PrintThreeAho {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println("アホ");
				continue;
			}
			String str = String.valueOf(i);
			if (str.indexOf("3") >= 0) {
				System.out.println("アホ");
				continue;
			}
			System.out.println(str);
		}
	}
}
