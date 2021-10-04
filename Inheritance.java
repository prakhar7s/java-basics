class Parent {

	int numberOne;
	int numberTwo;

}

class Inheritance extends Parent {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.numberOne + " " + p.numberTwo);
	}
}