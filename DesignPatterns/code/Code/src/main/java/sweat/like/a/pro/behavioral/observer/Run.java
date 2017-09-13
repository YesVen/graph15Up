package sweat.like.a.pro.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class Run extends Observable{
	
	public void addRun(int run){
		System.out.println("\t\t"+run+" runs scored by player");
		setChanged();
		notifyObservers(run);
	}
}


class TeamScore implements Observer{
	private int score = 20;

	@Override
	public void update(Observable o, Object arg) {
		this.score +=  	(Integer)arg;
		System.out.println("\t\tteam score is now :"+ score);
	}
}

class PlayerScope implements Observer{
	private int score = 10;
	
	@Override
	public void update(Observable o, Object arg) {
		this.score +=  	(Integer)arg;
		System.out.println("\t\tplayer score is now :"+ score);
	}
}
