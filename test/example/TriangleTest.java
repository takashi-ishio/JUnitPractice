package example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import example.Triangle.Type;

/**
 * Triangle クラスに対するテストを記述したクラス。
 * 歴史的に、テスト対象クラス (Class under test) の名称の後ろに Test を付けることが多い。
 */
public class TriangleTest {
	
	/**
	 * 正三角形が正しく認識できるかを確認するテストの例
	 */
	@Test
	public void testEquilateral() {
		Assertions.assertEquals(Type.Equilateral, Triangle.getType(10, 10, 10), "3辺が10なので正三角形となるべき");
	}
	
}
