package example;


/**
 * 素数判定を行うプログラム
 */
public class PrimeNumbers {

	/**
	 * コマンドライン引数で入力された整数に対して、素数かどうかを true/false で出力する。
	 * @param args 整数1つが指定されていることを仮定する。2つめ以降の数値は無視する。
	 */
	public static void main(String[] args) {
		try {
			int n = Integer.parseInt(args[0]);
			System.out.println(isPrime(n));
		} catch (NumberFormatException e) {
			System.out.println(false);
		}
	}
	
	/**
	 * 素数かどうかを判定する。
	 * @param n 判定対象の整数
	 * @return 素数であれば true, そうでなければ false を返す
	 */
	public static boolean isPrime(int n) {
		// 注意! この実装は不完全です。
		int s = (int)Math.sqrt(n);
		for (int i=2; i<=s; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
