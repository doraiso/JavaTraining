package algorithm;

/***
 * 大川隆法呼び出しプログラム
 * @author doraiso
 *
 */
public class OkawaRyuho2 {

	private static final String OKAWA_RYUHO = "大川隆法";
	private static final String BEGIN_KAKKO = "「";
	private static final String END_KAKKO = "」";
	private static final int REPEAT_COUNT = 3;

	public static void main(String[] args) {

		System.out.print(OKAWA_RYUHO);

		for (int i = 0; i < REPEAT_COUNT; i++) {
			System.out.print(BEGIN_KAKKO);
			System.out.print(OKAWA_RYUHO);
		}

		for (int i = 0; i < REPEAT_COUNT; i++) {
			System.out.print(END_KAKKO);
		}

	}

}
