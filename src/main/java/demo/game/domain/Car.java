package demo.game.domain;

public class Car {

	private final static int ZREO_VALUE = 0;
	private int carId; 		//자동차 아이디 
	private int carPos;   	//트랙돈 횟수
		
	//
	
	//carId = 1
	//carId = 2
	//carId = 3
	//ZREO_VALUE = 0
	public Car(int carId) {
		super();
		this.carId = carId;
		this.carPos = ZREO_VALUE;
	}
	

	public int getCarId() {
		return carId;
	}
	public int getCarPos() {
		return carPos;
	}
	
    public void move(MoveNumber number) {
    	//carPos 램덤으로 숫자를 생성해서 4 이상면 
    	if (number.isMovable()) {
        	
        	carPos++;
        }
    }
}
