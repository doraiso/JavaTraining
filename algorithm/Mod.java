package algorithm;

public class Mod {

	/**
	 * arr 1,11,111,1111...と7で割った余り
	 */
	int[] arr = {1,4,6,5,2,0,1};

	/**
	 * 剰余
	 * @param l 割られる数
	 * @param j 割る数
	 * @return
	 */
	public long mod(long l,int j) {
		return l % j;
	}

	/**
	 * 111....111(i)を7(j)で割った余りを配列から取得
	 * @param l
	 * @param j
	 * @return
	 */
	public long longtoArr(long l,int j) {
		int valLen = String.valueOf(l).length()-1;
		int m = valLen % j;
		return arr[m];
	}

	public static void main(String[] args) {

		Mod m = new Mod();
		// Long icchou = 1000000000000L; // 111....111(1兆桁)

		Long test = 1000000000000L; // テスト用

		test = test % 7;

		// testぐらいの値なら即座に出るがlぐらいだと詰む
		System.out.println(m.mod(ichi(test),7));
		// System.out.println(m.longtoArr(ichi(test),7));

	}

	/**
	 * 111出力メソッド
	 * @param keta 桁数
	 * @return 桁数に応じて111..11と出力
	 */

	public static long ichi(long keta) {
		long out = 0;
		keta = keta % 7;
		for(int i = 0 ; i < keta ;i++) {
			if (i % 7 == 0) {
				out = 1;
			} else {
				out = out * 10 + 1;
			}
		}
		System.out.println("out= " + out);
		return out;
	}

}
