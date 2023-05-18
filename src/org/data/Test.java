package org.data;

public class Test extends JavaSingleton {

	private void pub() {
		System.out.println("qwer");

	}

	private void pri() {
		System.out.println("asdf");

	}

	private void tes() {
		System.out.println("qwe");

	}

	public static void main(String[] args) {

		JavaSingleton instance = getInstance();

		System.out.println(System.identityHashCode(instance));
		instance.add();
		

		JavaSingleton instance2 = getInstance();
		System.out.println(System.identityHashCode(instance2));

		instance2.subraction();

		Test t = new Test();

		System.out.println(System.identityHashCode(t));

		t.pub();
		t.pri();

		Test t1 = new Test();
		System.out.println(System.identityHashCode(t1));
		t1.tes();
	}

}
