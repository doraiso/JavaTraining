package algorithm;

/**
 * @author doraiso
 * ロボット
 *
 */
public class Robot {

	private Position position;	// 現在の位置
	private String name;		// 名前


	public Position getPosition() {
		return position;
	}

	public String getName() {
		return name;
	}

	/***
	 * ロボットを生成する
	 * @param pos
	 * @param nickName
	 */
	public Robot(Position pos, String nickName) {
		position = pos;
		name = nickName;
	}

	/***
	 * X方向にxDeltaだけ移動する
	 * @param xDelta
	 */
	public void moveX(int xDelta) {
		position.moveX(xDelta);
	}

	/***
	 * Y方向にyDeltaだけ移動する
	 * @param yDelta
	 */
	public void moveY(int yDelta) {
		position.moveY(yDelta);
	}

	public void moveXY(int xDelta,int yDelta) {
		position.moveXY(xDelta, yDelta);
	}

	public String toString() {
		return "name : " + name + " position : " + position;
	}


}
