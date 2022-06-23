package jdk5above;

public enum Fruits {
	mango("yellow color"),orange("orange color"),apple("red color"),pineapple,grapes("green color"),berry;
	String colors;
	private Fruits() {
		
	}
	private Fruits(String colors) {
		this.colors=colors;
		
	}

}
