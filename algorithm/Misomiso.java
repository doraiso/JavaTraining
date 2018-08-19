package algorithm;

/**
 * ただ単に文字列を指定回数繰り返すだけのやつ
 * @author "doraiso"
 *
 */
public class Misomiso {

	// 繰り返したい文字列
	private String str;

	/**
	 * ゲッターロボ
	 * @return 文字列を返すよ
	 */
	public String getStr() {
		return str;
	}

	/**
	 * セットしてね
	 * @param str 繰り返したい文字列
	 */
	public void setStr(String str) {
		this.str = str;
	}

	/**
	 * メインだよー
	 * @param args
	 */
	public static void main(String[] args) {
		Misomiso misomiso = new Misomiso(); // TODO 全部コンストラクタでよくない？
		misomiso.setStr("みそみそ～"); // TODO こんなんmainのargsでいいでしょ
		System.out.println(misomiso.getRepeatString(100));
	}

	/**
	 * 文字列を何回繰り返したいのー
	 * @param repNum 繰り返す数
	 * @return 繰り返す文字列
	 */
	private String getRepeatString(int repNum) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < repNum; i++) {
			sb.append(str);
		}
		return sb.toString();
	}

}
