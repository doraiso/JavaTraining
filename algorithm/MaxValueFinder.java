package algorithm;


/**
 * 最大値を求めるクラス
 *
 * このクラスは、整数の配列を受け取り、その中から最大値を見つけて表示するプログラムです。
 * 配列が空である場合、最大値を求められない旨を表示します。
 */

public class MaxValueFinder {

    /**
     * プログラムのエントリーポイント
     *
     * 数値が格納された配列から最大値を求め、結果を表示します。
     * 配列が空の場合、最大値を求められない旨のメッセージを表示します。
     *
     * @param args コマンドライン引数（使用しない）
     */
	public static void main(String[] args) {
		int[] numbers = {-3, -7, -2, -9, -5};

		// Streamを使う場合の代替方法（コメントアウトされている）
        // int max = Arrays.stream(numbers).max().orElseThrow();

		if (numbers.length == 0) {
            System.out.println("配列が空です。最大値を求められません。");
            return;
        }

		int max = numbers[0];

		for(int number : numbers) {
			if (number > max) {
				max = number;
			}
		}

        System.out.println("最大値: " + max);
	}

}
