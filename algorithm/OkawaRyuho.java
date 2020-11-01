package algorithm;

/**
 * 大川隆法呼び出しスクリプト
 * @author doraiso
 *
 */
public class OkawaRyuho {

	private static final String OKAWA_RYUHO = "大川隆法";
	private static final String BEGIN_KAKKO = "「";
	private static final String END_KAKKO = "」";
	private static int END_KAKKO_NUM = 0;

	// なんかここいろいろいじるといっぱい大川隆法呼べるけどよく分からん
	private static int OKAWA_CALL_NUM = 6;

	public static void main(String[] args) {
		// スゥ……大川隆法です
		OkawaRyuho okawaRyuho = new OkawaRyuho();
		System.out.println(okawaRyuho.getOkawaRyuho(OKAWA_CALL_NUM) + okawaRyuho.repeat(END_KAKKO, END_KAKKO_NUM - 1));
	}

	/**
	 * 大川隆法呼び出しメソッド
	 * @param num
	 * @return 大川隆法いっぱい
	 */
	public String getOkawaRyuho(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(OKAWA_RYUHO + BEGIN_KAKKO + getOkawaRyuho(i));
		}
		END_KAKKO_NUM += 1;
		return sb.toString();
	}

	/**
	 * 繰り返しメソッド
	 * @param str 繰り返したい文字
	 * @param n 繰り返したい回数
	 * @return
	 * @see https://qiita.com/neko_the_shadow/items/78ad73e86f45e4994a89
	 */
	public String repeat(String str, int n) {
		StringBuilder sb = new StringBuilder();
		while (n-- > 0)
			sb.append(str);
		return sb.toString();
	}
}
