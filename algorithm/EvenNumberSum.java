package algorithm;

/**
 * 偶数の合計を求めるクラス
 *
 * このクラスは、整数の配列から偶数を見つけ出し、それらの合計を計算して表示するプログラムです。
 * 配列内の各要素を順番にチェックし、偶数の数値だけを合計します。
 */
public class EvenNumberSum {

	public static void main(String[] args) {

		int[] numbers = {1, 2, 3, 4, 5, 6};

		int sum = 0;

		for(int i=0;i<numbers.length;i++) {
			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
			}
		}

		System.out.println(sum);

	}

}
