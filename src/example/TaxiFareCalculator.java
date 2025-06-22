package example;

/**
 * タクシーの「料金メーター」を表現するクラス
 */
public class TaxiFareCalculator {

	private int distance;
	
	/**
	 * 初期状態の料金メーターをつくる
	 */
	public TaxiFareCalculator() {
		distance = 0;
	}
	
	/**
	 * 走行距離を追加する
	 * @param d 走行した距離
	 */
	public void addDistance(int d) {
		distance += d;
	}
	
	/**
	 * @return 現在までの走行距離の合計を返す
	 */
	public int getDistance() {
		return distance;
	}
	
	/**
	 * 走行距離に応じた料金を返す
	 */
	public int getFare() {
		return 0;
	}
	
}
