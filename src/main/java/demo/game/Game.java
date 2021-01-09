package demo.game;

import java.util.List;

import demo.game.controller.RoundController;
import demo.game.controller.ViewController;
import demo.game.domain.Car;
import demo.game.domain.Cars;


public class Game {

	public void initGame() {
		
		// 자동 수 숫자를 받고 
        final List<Car> racingCars = ViewController.racingCarCreate();
        // 회수 
        final int GameRound = ViewController.gameRoundCreate();
        	
        //카들의 배열  
        Cars racingGame = new Cars(racingCars);
        
        
        RoundController racingStadium = new RoundController();
        //게임 
        racingStadium.startRound(GameRound, racingGame);
	
	}
}
