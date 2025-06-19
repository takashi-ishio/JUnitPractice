package example;

public class Triangle {

	public enum Type { 
		/** 不等辺三角形 */ Scalene("不等辺三角形"),
		/** 二等辺三角形 */ Isosceles("二等辺三角形"), 
		/** 正三角形 */ Equilateral("正三角形");
		
		private String description; 

		private Type(String description) {
			this.description = description;
		}
		
		public String toString() {
			return description;
		}
	};
	
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * 三角形のタイプを判定する
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static Type getType(int a, int b, int c) {
		if (a==b && b==c) return Type.Equilateral;
		return null;
	}

}
