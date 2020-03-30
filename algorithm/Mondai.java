package algorithm;

public class Mondai {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long population = 6800000000L;
		System.out.println(population);

		String aisatsu = "\"おはようございます\"、\"こんにちは\"、\"こんばんは\"";
		System.out.println(aisatsu);
		int hour = 10;
		if (8 <= hour || hour <= 11) {
			System.out.println("おはようございます！今日も一日頑張りましょう。");
		} else if (12 <= hour || hour <= 15) {
			System.out.println("こんにちは。居眠りしないように！");
		} else if (16 <= hour || hour <= 18) {
			System.out.println("あと少し頑張りましょう。");
		} else if (19 <= hour || hour <= 21) {
			System.out.println("お疲れ様。また明日！");
		} else {
			System.out.println("頑張り過ぎです。休みましょう。");
		}

		int j = 0;
		for (int i = 1; i <= 10; i++) {
			j += i;
		}
		System.out.println("合計は、" + j + "です。");

		j = 0;
		int i = 1;
		while (i <= 10) {
			j += i;
			i++;
		}
		System.out.println("合計は、" + j + "です。");

	}

}
