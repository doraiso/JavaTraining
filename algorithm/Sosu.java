package algorithm;

/**
 * 素数を出力するよ
 * 2からnumまでを出力するよ
 * @author "doraiso"
 *
 */
public class Sosu {

	/**
	 * 2からこの数まで出力するよ
	 */
	private int num;

	/**
	 * コンストラクタだよ
	 *
	 * @param num
	 */
	public Sosu(int num) {
		this.num = num;
	}

	/**
	 * メインメソッドだよ
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Sosu so = new Sosu(10000);
		for (int i = 2; i < so.num; i++) {
			if (so.isSosu(i) == true) {
				System.out.print(i);
				System.out.print(" ");
			}

		}
	}

	/**
	 * 素数かどうか判別するよ
	 *
	 * @param num
	 *            判別対象となる数
	 * @return 素数ならtrue、違うならfalse
	 */
	//	public boolean isSosu(int num) {
	//		boolean sosu = true;
	//		for (int i = 2; i < num; i++) {
	//			if (num % i == 0) {
	//				sosu = false;
	//			}
	//		}
	//		return sosu;
	//	}

	public boolean isSosu(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

}
