package algorithm;

/***
 * 位置
 * @author doraiso
 *
 */

public class Position {

	private int x; // x座標
	private int y; // y座標

	/***
	 * 位置を生成する
	 * @param xPos
	 * @param yPos
	 */
	public Position(int xPos, int yPos) {
		x = xPos;
		y = yPos;
	}

	/***
	 * X方向にxDeltaだけ移動する
	 * @param xDelta
	 */
	public void moveX(int xDelta) {
		x += xDelta;
	}

	/***
	 * Y方向にyDeltaだけ移動する
	 * @param yDelta
	 */
	public void moveY(int yDelta) {
		y += yDelta;
	}

	/***
	 * X方向にxDelta,Y方向にyDeltaだけ移動する
	 *
	 * @param xDelta
	 * @param yDelta
	 */
	public void moveXY(int xDelta, int yDelta) {
		x += xDelta;
		y += yDelta;
	}

	/***
	 * X座標を得る
	 * @return
	 */
	public int getX() {
		return x;
	}

	/***
	 * Y座標を得る
	 * @return
	 */
	public int getY() {
		return y;
	}

	/***
	 * 位置を表す文字列を返す
	 */
	public String toString() {
		return "(" + x + ", " + y + ")";
	}


}
