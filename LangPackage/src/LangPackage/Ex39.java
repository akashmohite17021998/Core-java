package LangPackage;

public class Ex39 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(1000);
		System.out.println(sb.capacity());
		sb.append("abc");
		sb.trimToSize();
		System.out.println(sb.capacity());
	}

}
