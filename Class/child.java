package Class;
class base {
	int x = 10;

	void show() {
		System.out.println("show");
	}
}

class child extends base {
	int x = 20;

	void show() {
		System.out.println("hello");
	}

	void display() {
		System.out.println("display");
	}

	public static void main(String ar[]) {

		base b = new child();
		System.out.println(b.x);
		child c = (child) b;// downcasting
		b.show();
		c.display();
	}
}