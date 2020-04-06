package algorithm;

public class ArrayMondai8_1 {
    public static void main(String[] args) {
        // 2次元配列seisekiの宣言と要素の代入
        int[][] seiseki = {{65, 80, 75},     // 山田さんの国語、数学、英語の点数
                           {100, 90, 90},    // 佐藤さんの国語、数学、英語の点数
                           {40, 30, 0}};     // 鈴木さんの国語、数学、英語の点数

        // 山田さん、佐藤さん、鈴木さんのそれぞれの合計点を計算
        /* ここに追加 */

        int [] sum = new int[] {0,0,0};

        for (int i = 0 ; i<seiseki.length;i++)
        	for (int j = 0; j<3 ;j++)  {
        		sum[i] += seiseki[i][j];
        	}

        // 山田さん、佐藤さん、鈴木さんのそれぞれの合計点を表示
        /* ここに追加 */

        for (int i=0 ; i<sum.length;i++) {
        	System.out.println(sum[i]);
        }
    }
}