package lesson32.regexp.org.br;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author BR
 */
public class Test {
    public static void main(String[] args) {
        String text = "Hello, Guys! I send you my joe@gmail.com so we can\n" +
                "keep in touch. Thanks, Joe! That's cool. A am sending you\n" +
                "me address: tim@yandex.ru. Let's stay in touch...";

        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group(3));
        }
    }
}
