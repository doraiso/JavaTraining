package algorithm;

public class Algorithm {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// LinearSearch table = new LinearSearch();	// 線形探索法
		BinarySearch table = new BinarySearch();	// 二分探索法
		table.add(1, "one");
		table.add(2, "two");
		table.add(10, "ten");

		String x = (String)table.search(10);
		if (x != null) {
			System.out.println("value=" + x);
		} else {
			System.out.println("Not Found");
		}

	}

}
