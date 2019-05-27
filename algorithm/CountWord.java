package algorithm;

import java.util.HashMap;
import java.util.Map.Entry;

public class CountWord {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String,Integer>();
		args.toString().split(" ");

        for(int i = 0; i < args.length; i++) {
            if (map.containsKey(args[i])) {
                int x = map.get(args[i]);
                x++;
                map.put(args[i],x);
            } else {
                map.put(args[i],1);
            }
        }

        for(Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

	}

}
