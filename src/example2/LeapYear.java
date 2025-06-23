package example2;

public class LeapYear {

	/**
	 * うるう年かどうかを判定する。
	 * @param year グレゴリオ暦の年を指定する。
	 * 一般的な情報システムで必要な範囲（1900-2100程度）への対応のみを考慮している。 
	 * @return うるう年であれば true、そうでなければ false を返す。
	 */
	public static boolean isLeapYear(int year) {
		if (year % 4 != 0) {
			return false;
		} else if (year % 100 != 0) {
			return true;
		} else if (year % 400 != 0) {
			return false;
		} else {
			return true;
		}
	}

}
