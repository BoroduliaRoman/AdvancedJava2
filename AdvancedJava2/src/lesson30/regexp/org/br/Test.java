package lesson30.regexp.org.br;

public class Test {

	public static void main(String[] args) {
		/*
		 *  \\d - одна цифра
		 *  \\w - одна буква английская буква
		 *  \\w = [a-zA-Z]
		 *  + - 1 или более
		 *  * - 0 или более
		 *  ? - 0 или 1 символов до
		 *  (x|y|z) - одна строка из множества строк
		 *  [abc] = (a|b|c)
		 *  [a-zA-Z] - все анлгийские буквы
		 *  [0-9] = \\d
		 *  [^abc] - мы хотим все символы кроме [abc]
		 *  . - любой символ
		 *  {2} - 2 символа до (\\d{2})
		 *  {2,} - 2 или более символа (\\d{2,})
		 *  {2, 4} - от 2 до 4 символов (\\d{2,4})
		 */
		
		String a = "-456";
		String b = "2414";
		String c = "+12341";
		
		System.out.println(a.matches("(-|\\+)?\\d*"));
		System.out.println(b.matches("(-|\\+)?\\d*"));
		System.out.println(c.matches("(-|\\+)?\\d*"));
		
		String d = "g333d1111asd123414";
		System.out.println(d.matches("[a-zA-Z31]+\\d+"));
		
		String e = "ahello";
		System.out.println(e.matches("[^abc]*"));
		
		String url1 = "http://www.google.com";
		String url2 = "http://www.yandex.ru";
		String url3 = "Hello threre!";
		System.out.println(url1.matches("http://www\\..+\\.(com|ru)"));
		System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));
		System.out.println(url3.matches("http://www\\..+\\.(com|ru)"));
		
		String f = "187644";
		System.out.println(f.matches("\\d{2,}"));
		
	}

}
