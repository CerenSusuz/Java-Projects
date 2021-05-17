package thread;

public class Main {

	public static void main(String[] args) {
		StopwatchThread threadOne = new StopwatchThread("threadOne");
		
		StopwatchThread threadTwo = new StopwatchThread("threadTwo");
		
		StopwatchThread threadThree = new StopwatchThread("threadThree");

		threadOne.start();
		threadTwo.start();
		threadThree.start();
	}

}
