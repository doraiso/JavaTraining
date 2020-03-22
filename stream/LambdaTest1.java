package stream;

import java.util.Arrays;
import java.util.List;

public class LambdaTest1 {

	public static void main(String[] args) {
		Hello hello = name -> name;
		System.out.println(hello.sayHello("test"));

		Integer[] num = { 1, 2, 3, 4, 5 };
		List<Integer> l = Arrays.asList(num);
		l.stream().filter(x -> x < 3).forEach(System.out::println);

	}

}
