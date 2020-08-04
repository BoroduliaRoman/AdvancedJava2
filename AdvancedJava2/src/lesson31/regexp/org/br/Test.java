package lesson31.regexp.org.br;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String a = "Hello4564there4564654hey62465465edsadweda54654asda";
		String[] words = a.split("\\d+");
		System.out.println(Arrays.toString(words));

		String b = "Hello21424there3546546hey6541231";
		String modifiendString = b.replace("\\d+", "-");
		System.out.println(modifiendString);

		String modifineString2 = b.replaceFirst("\\d+", "-");
		System.out.println(modifineString2);
	}

}
