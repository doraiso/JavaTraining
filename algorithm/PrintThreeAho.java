package algorithm; // このパッケージは削除してもいいです(これは僕のプログラムなのでこうしてる感じなので)

/**
 * intBaisuの倍数かintBaisuがつく数字でアホを表示するプログラム
 *
 */
public class PrintThreeAho {
	public static void main(String[] args) {

		// 表示する文言(ここではアホ)を定数として定義します
		String strAho = "おっぱい";
		// まずは3の倍数か3の倍数ということで定数を付けます、とりあえず3にしましょう
		int intBaisu = 3;

		// とりあえず1から100まででやってみましょうß
		// ここで繰り返しをします
		// このfor文では1から100まで繰り返します
		for (int i = 1; i <= 100; i++) {

			// ここでは数値型(int)を文字列型(String)に変換しています
			// このvalueOfというのは数値型(int)を文字列にするメソッドです、他のプログラミング言語では別の書き方もあるので調べましょう
			String str = String.valueOf(i);

			// まずは3の倍数のときにアホになるように書きます
			// % というのは i という数値を3で割ったときの余りになります
			if (i % intBaisu == 0) {
				System.out.println(strAho); // これはコンソール上に出力するためのメソッドです
				// このcontinueという文はfor文での繰り返しをスキップする役目になります
				// 例えばi=3の場合はここを通るのですがその場合ここでスキップしてcontinue以下のプログラムは実行されません
				// i=6,9...3の倍数のときは同じようにスキップします
				continue;
			}

			// このindexOfというのは文字列がどこにあるかを検索するメソッドです、ざっくりで言うと3が入っていたらアホが出力されます
			// indexOfに3が入っていたらこのif文の中を実行します
			// このifステートメントも if (i % intBaisu == 0 || str.indexOf(Integer.toString(intBaisu)) >= 0)
			// とすれば冗長にならなく不要になりますが、コーディング規約に従って読みやすいプログラミングを心がけましょう
			if (str.indexOf(Integer.toString(intBaisu)) >= 0) {
				System.out.println(strAho);
				continue;
			}

			// 3の倍数、または3が含まれていない場合はそのまま出力します
			System.out.println(str);
		}
	}
}
