package algorithm;

/**
 * 111...111(1兆桁)を7で割った余りを返します<br>
 * 汎用性はクソくらえです
 * @author "doraiso"
 *
 */
public class Mod {

	/**
	 * arr 1,11,111,1111...と7で割った余り<br>
	 * このあたりは循環するから計算したの
	 */
	static int[] arr = {1,4,6,5,2,0};


	public static void main(String[] args) {

		Mod m = new Mod();
		Long keta = 1000000000000L; // 111....111(1兆桁)
		System.out.println("111...111(" + keta + "桁)を7で割った余り is " + m.getSurplus(keta));

	}

	/**
	 * 111...111で割った余りを返す
	 * @param keta 111...111の桁数
	 * @return 余り
	 */
	public int getSurplus(Long keta) {

		int modKeta =  (int) (keta % arr.length - 1);
		return arr[modKeta];

	}

}
