package algorithm.techfun.materialmanagement.purchase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetSupplierName {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("プログラム「GetSupplierName」の処理を開始します");

		BufferedReader brNouhin = null;
		BufferedReader brShiire = null;
		BufferedWriter bwNewNouhin = null;

		List<DeliveryBean> deliBeanList = new ArrayList<>();
		Map<String, String> shiireMap = new HashMap<>();

		try {
			brNouhin = new BufferedReader(new FileReader("C:\\temp\\nouhin.txt")); // 納品予定ファイル
			brShiire = new BufferedReader(new FileReader("C:\\temp\\shiire.txt")); // 仕入先情報ファイル
			bwNewNouhin = new BufferedWriter(new FileWriter("C:\\temp\\newshiire.txt", true)); // 新納品予定ファイル

			String str = null;

			// ファイルには複数行文字が記述されてる場合もあるので繰り返し処理
			// 納品予定ファイルのデータをDeliveryBeanに格納
			while ((str = brNouhin.readLine()) != null) {

				// 読み込んだファイルの内容を一行ずつ表示します
				String[] arrayNouhin = str.split(",");
				DeliveryBean db = new DeliveryBean();
				db.setKoubai(arrayNouhin[0]);
				db.setBuhin(arrayNouhin[1]);
				db.setShiire(arrayNouhin[2]);
				db.setShireName(arrayNouhin[3]);
				db.setQuantity(Integer.parseInt(arrayNouhin[4]));
				deliBeanList.add(db);

			}

			// 仕入先情報ファイルのデータをMapに格納する
			while ((str = brShiire.readLine()) != null) {

				// 仕入先コードをキーとする
				String key = str.substring(0, 8);

				// 仕入先名称を値とする
				String[] tempValue = str.substring(8).split(" ");
				String value = tempValue[0];

				// 仕入先コードをキーに、仕入先名称を値としてMapに格納する
				shiireMap.put(key, value);

			}

			for (DeliveryBean d : deliBeanList) {

				// テストのためコンソール出力
//				System.out.println(d.getKoubai());
//				System.out.println(d.getBuhin());
//				System.out.println(d.getShiire());
//				System.out.println(d.getShireName());
//				System.out.println(d.getQuantity());

				String st = shiireMap.get(d.getShiire());

				// 仕入先名称がない場合はブランクとする
				if (st == null || st.isEmpty()) {
					st = "";
				}

				// 新納品予定ファイルに書き込みをする
				bwNewNouhin.write(
						d.getKoubai() + "," + d.getBuhin() + "," + d.getShiire() + "," + st
								+ "," + d.getQuantity());
				bwNewNouhin.newLine();

			}

			// テストのため出力
//			System.out.println("---");

			// entrySetメソッドを利用してキーと値を全件取得する
			for (Map.Entry<String, String> entry : shiireMap.entrySet()) {
				// テストのためコンソール出力
//				System.out.println(entry.getKey());
//				System.out.println(entry.getValue());

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 入出力ストリームをクローズする
				brNouhin.close();
				brShiire.close();
				bwNewNouhin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("プログラム「GetSupplierName」の処理を終了します");

	}

}
