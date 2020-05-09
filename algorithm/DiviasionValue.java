package algorithm;

/**
 * 標本に対しての平均値・標準偏差・偏差値を返す
 * @author ryosuke
 *
 */
public class DiviasionValue {

	/**
	 *  正規化した場合の標準偏差
	 */
	private int STANDARD_SCALE = 10;

	/**
	 *  正規化した場合の平均
	 */
	private int STANDARD_MEAN = 50;

	public static void main(String[] args) {

		// 標本のすべての値
		int[] scores = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		// 入力値(得点)
		int score = 20;

		DiviasionValue dv = new DiviasionValue();
		System.out.println("平均:" + dv.getMean(scores));
		System.out.println("標準偏差:"+ dv.getSD(scores));
		System.out.println("得点:" + score);
		System.out.println("偏差値:" + dv.getStandardScore(dv.getMean(scores),dv.getSD(scores),score));
	}

	/**
	 * 平均を求める
	 * @param scores 標本のすべての値
	 * @return 標本の平均値を返す
	 */
	private float getMean(int[] scores) {
		// 合計 Σx
		// scoresがx1,x2,..,xi,..,xn(scoresの数はn個)とした場合の合計
		int sum = 0;
		for (int i : scores) {
			sum += i;
		}
		// 平均 μ = Σx / n
		float mean = sum / scores.length;
		return mean;
	}

	/**
	 * 標準偏差を求める
	 * @param scores 標本のすべての値
	 * @return 標本の標準偏差を返す
	 */
	private float getSD(int[] scores) {
		// 分散 σ^2 = Σ(xi - μx) ^ 2
		float variance = 0F;
		for (int i : scores) {
			variance += Math.pow(i - getMean(scores), 2);
		}

		// 標準偏差 σ = sqrt((σ^2) / n)
		float standardDiviasion = (float) Math.sqrt(variance / scores.length);
		return standardDiviasion;
	}

	/**
	 * 偏差値を求める
	 * @param mean 標本の平均値(μ)
	 * @param sd 標本の標準偏差(σ)
	 * @param x 値(得点)
	 * @return 値(得点)に対しての偏差値を返す
	 */
	private float getStandardScore(float mean,float sd,float x) {
		// 標本の平均値μ、標準偏差σを正規化する
		// 正規化では平均値を50,標準偏差を10とする
		// T = 10(x - μ) / σ + 50
		return  (STANDARD_SCALE * (x - mean) / sd) + STANDARD_MEAN;
	}

}
