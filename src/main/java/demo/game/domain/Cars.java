package demo.game.domain;

import java.util.List;


public class Cars {
	
	private List<Car> cars;
	
	public Cars(List<Car> cars) {       
        this.cars = cars;
    }
	
	public List<Car> getRacingCars() {
        return this.cars;
    }
	
	public void moveCar() {
		cars.forEach(car -> car.move(RandomNumber.generateRandomIntIntRange()));
    }
}
