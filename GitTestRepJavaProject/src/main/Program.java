package main;

public class Program {

	public static void main(String[] args) {
		printMsg("Hello world!", 3);
	}
	
	public static void printMsg(String msg, int count) {
		for (int index = 1; index <= count; index++) {
			System.out.println(msg);
		}
	}

}
