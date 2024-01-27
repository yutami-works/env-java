public class Cast {
	public static void main(String[] args){
		// 狭い型から広い型へは暗黙的なキャスト（自動的な型変換）
		int a = 10;
		long b = a;
		System.out.println(b);

		// キャスト（明示的な型変換）
		long c = 10;
		int d = (int)c;
		System.out.println(d);

		// 型の範囲外でキャストすると切り捨てられる
		double e = 3.14;
		System.out.println(e);
		int f = (int)e;
		System.out.println(f);
	}
}
