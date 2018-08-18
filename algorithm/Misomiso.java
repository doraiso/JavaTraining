package algorithm;

public class Misomiso {


/*	public Misomiso() {
		// TODO 自動生成されたコンストラクター・スタブ
		if (true) {
			System.out.print("みそみそ～");
		}
	}
*/
	private String str;

	public Misomiso(String str) {
		this.str = str;
	}

	// setterはコンストラクタで設定する？
	public void setStr(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public String getRepeatString(int repNum) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < repNum; i++) {
			sb.append(str);
		}
		return sb.toString();
	}

}
