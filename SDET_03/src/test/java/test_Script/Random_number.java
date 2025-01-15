package test_Script;

import java.util.Random;

public class Random_number {

	public static void main(String[] args) {

		Random r=new Random();
		int random=r.nextInt(1000);
		System.out.println(random);
	}

}
