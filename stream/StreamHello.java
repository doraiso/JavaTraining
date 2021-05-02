package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class StreamHello {

	public static void main(String[] args) {

		//		Java8のラムダ式を理解する - Qiita https://qiita.com/sano1202/items/64593e8e981e8d6439d3
		Runnable runner = () -> {
			System.out.println("hello, world");
		};
		runner.run();

		//		Java のラムダ式と StreamAPI。入門レベルを図解で | コード７区 http://ailaby.com/java_lambda/
		//		コレクションを強化したStream - Qiita https://qiita.com/pepepe/items/337134b4fccbfee83a2d
		List<Integer> list = Arrays.asList(100, 200, 300, 400, 500);
		//		List<String> listStr = Arrays.asList("100", "200", "300", "400");
		Integer sum = list.stream()
				//		.mapToInt(s -> Integer.parseInt(s))
				.filter(i -> i >= 300)
				//	Javaのラムダ式とStream API https://www.petitmonte.com/java/java_lambda_stream.html
				.reduce((a, b) -> a + b)
				.get();
		//				.forEach(i -> System.out.println(i))
		System.out.println(sum);
		Hello hello = name -> name;
		System.out.println(hello.sayHello("test"));

		//		Java8のラムダ式を理解する - Qiita https://qiita.com/sano1202/items/64593e8e981e8d6439d3
//		Function<Integer, String> asterisker = (i) -> { return "*"+ i; };
		Function<Integer, String> asterisker = (i) -> {
			String str = "";
			for (int j = 0; j < i; j++) {
				str += "*";
			}
			return str;
		};
		String result = asterisker.apply(10);
		System.out.println(result); // *10

		Consumer<String> buyer = (goods) -> {
			System.out.println(goods + "を購入しました");
		};
		buyer.accept("おにぎり"); // おにぎりを購入しました。

		int[] numbers = { -1, 2, 0, -3, 8 };

		List<Integer> numbersList = new ArrayList<>();

		for (int n : numbers) {
			numbersList.add(n);
		}

		numbersList.stream().forEach((i) -> {
			System.out.print(i + " ");
		});
		// -1 2 0 -3 8

		numbersList.stream().filter((i) -> { return i > 0; })
        .forEach((i) -> { System.out.print(i + " "); });
        // 2 8

		numbersList.stream().filter((i) -> { return i >= 0; })
        .map((i) -> { return "*" + i + "*"; })
        .forEach((s) -> { System.out.print(s + " "); });
        // *2* *0* *8*

		numbersList.stream().filter((i) -> { return i >= 0; })
        .sorted((i1, i2) -> { return i1 - i2; })
        .map((i) -> { return "*" + i + "*"; })
        .forEach((s) -> { System.out.print(s + " "); });
        // *0* *2* *8*

		Integer sumNumberList = numbersList.stream().filter(i -> i>=0).reduce((a, b) -> a+b).get();
		System.out.println(sumNumberList);

//		【Java】Javaプログラマーなら知らないと今後が危うい！？ラムダ式をわかりやすく解説(Java8以降） | プログラミングマガジン http://www.code-magagine.com/?p=2145
//		IntBinaryOperator ramda = (int a,int b) -> {return a + b;};
//		IntBinaryOperator ramda = (a,b) -> {return a + b;};
		IntBinaryOperator ramda = (a,b) -> a + b;



		System.out.println(ramda.applyAsInt(2,4));
	}



}
