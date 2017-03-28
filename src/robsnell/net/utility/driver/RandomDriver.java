package robsnell.net.utility.driver;

import robsnell.net.utility.RandomUtil;

public class RandomDriver {

	public static void main(String[] args) {
		RandomUtil ru = new RandomUtil(5, new int[]{2,3,5});
		System.out.println(String.format("next()->%1d", ru.next()));
		System.out.println(String.format("next()->%1d", ru.next()));
		System.out.println(String.format("next()->%1d", ru.next()));
	}
}
