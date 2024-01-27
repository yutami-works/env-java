public class Array {
	public static void main(String[] args) {
		int[] a = new int[10];
		a[5] = 100;

		System.out.println(a[5]);

		// 初期値を指定することを可能（newも省略できる）
		int[] b = {10,20,30};

		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);

		// 連想配列
		int[][] c = { {10,20,30},{40,50,60} };
		System.out.println(c[0][0]);
		System.out.println(c[0][1]);
		System.out.println(c[0][2]);

		System.out.println(c[1][0]);
		System.out.println(c[1][1]);
		System.out.println(c[1][2]);

		// Stringは実は文字列型ではなくてクラス
		String s1 = new String("こんにちは "); // インスタンス化する
		String s2 = "Java"; // インスタンス化を省略して文字列型みたいな書き方もできるけどね
		String s3 = s1 + s2;

		System.out.println(s3);
		System.out.println("Hello " + s2);

		// Java SE 10以降はvarで宣言すると型推論してくれる
		var d = 10;    // int 型
		var e = 3.14;  // double 型
		var f = 'あ';  // char 型
		var g = "ABC"; // String 型

		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
}
