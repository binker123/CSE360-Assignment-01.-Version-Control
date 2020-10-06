package cse360assignment02;

public class AddingMachineTest {

	public static void main(String[] args) {
		AddingMachine test1 = new AddingMachine();
		
		test1.add(4);
		System.out.println(test1.toString());
		test1.clear();
		System.out.println(test1.toString());
		test1.add(4);
		System.out.println(test1.toString());
		test1.subtract(2);
		System.out.println(test1.toString());
		test1.add(5);
		System.out.println(test1.toString());
	}

}
