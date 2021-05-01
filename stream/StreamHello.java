package stream;

import java.util.Arrays;
import java.util.List;

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
	}

}
