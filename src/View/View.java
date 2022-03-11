package View;

import Controller.ThreadId;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 5; i++){
			ThreadId id = new ThreadId();
			id.start();
		}
	}

}
