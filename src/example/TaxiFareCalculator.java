package example;

/**
 * タクシーの「料金メーター」を表現するクラス
 */
public class TaxiFareCalculator {

	public static int MAX_DISTANCE = 9999999;
	
	private int distance;
	
	/**
	 * 初期状態の料金メーターをつくる
	 */
	public TaxiFareCalculator() {
		distance = 0;
	}
	
	/**
	 * 走行距離を追加する
	 * @param d 走行した距離。単位はメートル。
	 */
	public void addDistance(int d) {
		distance += d;
	}
	
	/**
	 * @return 現在までの走行距離の合計を返す。単位はメートル。
	 */
	public int getDistance() {
		return distance;
	}
	
	/**
	 * 走行距離に応じた料金を返す。
	 * 運賃計算ルール: 最初の 1500 メートルは 500 円。追加 300 メートルごとに 100円。
	 * 距離が 0 未満あるいは MAX_DISTANCE を超過した距離のときは、エラーとして 0 を返す。
	 * @return 計算した金額。
	 */
	public int getFare() {
		// 注意! この実装は不完全です。
		return 0;
	}
	
}
