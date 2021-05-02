package algorithm;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class UnkoChinkoManko {

	// java.util.loggingの使い方 - Qiita https://qiita.com/Qui/items/40077ce9e33738dd3914
	// Javaでログを出力する（java.util.loggingパッケージ利用） – REONTOSANTA https://knowledge.reontosanta.com/archives/648

	public static void main(String[] args) {
		// Javaで実行中のクラス名・メソッド名を取得する方法 - Qiita https://qiita.com/munieru_jp/items/02533ebe5c822e6e29bb
        final String className = new Object(){}.getClass().getEnclosingClass().getName();
        // Java配列の最後の要素を取得する簡単な方法はありますか？ https://stackoverrun.com/ja/q/4154831
        final String realClassName = className.substring(className.lastIndexOf('.') + 1);
		final Logger logger = Logger.getLogger(className);
		final String filePath = "log/sampleLog.txt";
		FileHandler fileHandler;
		try {
			fileHandler = new FileHandler(filePath, true);
			fileHandler.setFormatter(new SimpleFormatter());
			logger.addHandler(fileHandler);
			logger.setLevel(Level.ALL);

			ConsoleHandler consoleHandler = new ConsoleHandler();
			consoleHandler.setLevel(Level.CONFIG);
			logger.addHandler(consoleHandler);

			logger.setUseParentHandlers(false);
			logger.log(Level.FINE, realClassName + "はじまり");
			new UnkoChinkoManko(10);
			logger.log(Level.FINE, realClassName + "おわり");
		} catch (SecurityException | IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			logger.log(Level.SEVERE, "だめぽ", e);
		}
	}

	public UnkoChinkoManko(int count) {
		for(int i=0; i<count; i++) {
			System.out.println("うんこちんこまんこ");
		}

	}

}
