package algorithm;

/***
 * 二分探索法
 * @author doraiso
 *
 */
public class BinarySearch {

	/**
	 * テーブルのエントリ
	 * @author doraiso
	 *
	 */
	class Entry {

		int key;
		Object data;

		/**
		 * エントリを生成する
		 * @param key
		 * @param data
		 */
		public Entry(int key, Object data) {
			this.key = key;
			this.data = data;
		}
	}

	final static int MAX = 100;
	Entry[] table = new Entry[MAX];
	int n = 0;

	/**
	 * データを登録する
	 * @param key
	 * @param data
	 */
	public void add(int key, Object data) {
		if (n >= MAX) {
			System.err.println("データの個数が多すぎます");
			System.exit(1);
		}
		table[n++] = new Entry(key, data);
	}

	public Object search(int key) {
		int low = 0;
		int high = n - 1;
		int middle;

		while (low <= high) {
			middle = (low + high) / 2;
			if (key == table[middle].key) {
				return table[middle].data;
			} else if (key <table[middle].key) {
				high = middle - 1;
			} else {
				low = middle + 1;
			}

		}

		return null;
	}




}
