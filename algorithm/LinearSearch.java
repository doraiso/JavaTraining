package algorithm;

/***
 * 線形探索法
 * @author doraiso
 *
 */

public class LinearSearch {

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

	final static int MAX = 100;	// データの最大個数
	Entry[] table = new Entry[MAX];	//データを格納する配列
	int n = 0;	// tableに登録されているデータの個数


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

	/**
	 * キーkeyに対応するデータを探す
	 * @param key
	 * @return
	 */
	public Object search(int key) {
		int i;

		i = 0;
		while (i < n) {
			if (table[i].key == key) {
				return(table[i].data);
			}
			i++;
		}
		return null;
	}


}
