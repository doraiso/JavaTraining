package algorithm;

public class Mod {

	/**
	 * arr 1,11,111,1111...と7で割った余り
	 */
	int[] arr = {1,4,6,5,2,0,1};

	/**
	 * 剰余 arr計算プロセスで使った
	 * @param l 割られる数
	 * @param j 割る数
	 * @return
	 */
	/**
	public long mod(long l,int j) {
		return l % j;
	}
	*/

	/**
	 * 111....111(i)を7(j)で割った余りを配列から取得
	 * @param l
	 * @param j
	 * @return
	 */
	public long longtoArr(long l,int j) {
		int m = (int) (l % j);
		return arr[m];
	}

	public static void main(String[] args) {

		Mod m = new Mod();
		// for(int i=0;i<=100;i++) {
			// System.out.println(m.mod(ichi(i),7));
			// System.out.println(m.longtoArr(i, 7));
		// }
		System.out.println(m.longtoArr(1000000000000L, 7));

	}

	/**
	 * 111出力メソッド arr計算プロセスで使った
	 * @param keta 桁数
	 * @return 桁数に応じて111..11と出力
	 */

	/**
	public static int ichi(long keta) {
		String str = "1";
		for(int i = 0 ; i <= keta ;i++) {
			if (i % 7 == 0) {
				str = "1";
			} else {
				str = str + "1";
			}
		}
		System.out.println(str);
		return Integer.parseInt(str);
	}
	*/

}
