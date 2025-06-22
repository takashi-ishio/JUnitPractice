package example;

/**
 * 三角形判定プログラムの実装
 */
public class Triangle {

	/**
	 * 三角形の種類を表現する列挙型。
	 * 三角形は、不等辺三角形、二等辺三角形、正三角形の3種類からなる。
	 */
	public enum Type { 
		/** 不等辺三角形 */ Scalene("不等辺三角形"),
		/** 二等辺三角形 */ Isosceles("二等辺三角形"), 
		/** 正三角形 */ Equilateral("正三角形"),
		/** 三角形ではない */ Invalid("三角形ではない");
		
		private String description; 

		private Type(String description) {
			this.description = description;
		}
		
		public String toString() {
			return description;
		}
	};
	
	
	/**
	 * 3つの引数を受け取り、三角形かどうかを判定して、結果を文字列で出力する。
	 * @param args 3辺の長さ（整数）
	 */
	public static void main(String[] args) {
		Type result;
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);
			result = Triangle.getType(a, b, c);
		} catch (NumberFormatException e) {
			result = Type.Invalid;
		}
		System.out.println(result);
	}
	
	/**
	 * 三角形の種類を判定して、対応する Type を返す。
	 * 引数 a, b, c は3辺の長さを表す。
	 * @return 辺の長さから、Type で表される三角形のどれかを判定し、対応するものを返す。
	 */
	public static Type getType(int a, int b, int c) {
		// 注意! この実装は不完全です。
		if (a==b && b==c) return Type.Equilateral;
		return null;
	}

}
