package demo.game.domain;

public class Car {

	private final static int ZREO_VALUE = 0;
	private int carId; 		//�ڵ��� ���̵� 
	private int carPos;   	//Ʈ���� Ƚ��
		
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
    	//carPos �������� ���ڸ� �����ؼ� 4 �̻�� 
    	if (number.isMovable()) {
        	
        	carPos++;
        }
    }
}
