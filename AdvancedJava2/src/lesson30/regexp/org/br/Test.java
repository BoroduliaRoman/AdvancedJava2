package lesson30.regexp.org.br;

public class Test {

	public static void main(String[] args) {
		/*
		 *  \\d - ���� �����
		 *  \\w - ���� ����� ���������� �����
		 *  \\w = [a-zA-Z]
		 *  + - 1 ��� �����
		 *  * - 0 ��� �����
		 *  ? - 0 ��� 1 �������� ��
		 *  (x|y|z) - ���� ������ �� ��������� �����
		 *  [abc] = (a|b|c)
		 *  [a-zA-Z] - ��� ���������� �����
		 *  [0-9] = \\d
		 *  [^abc] - �� ����� ��� ������� ����� [abc]
		 *  . - ����� ������
		 *  {2} - 2 ������� �� (\\d{2})
		 *  {2,} - 2 ��� ����� ������� (\\d{2,})
		 *  {2, 4} - �� 2 �� 4 �������� (\\d{2,4})
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
