
public class Test {

	public static void main(String[] args) {
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "070-0000-0000";
		jiro.address = "jiro@yahoo.co.jp";
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "080-0000-0000";
		hanako.address = "hanako@yahoo.co.jp";
		Person yuki = new Person();
		yuki.name = "高田祐希";
		yuki.age = 25;
		yuki.phoneNumber = "080-0000-0000";
		yuki.address = "hanako@yahoo.co.jp";

		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address + "\n");
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address + "\n");
		System.out.println(yuki.name);
		System.out.println(yuki.age);
		System.out.println(yuki.phoneNumber);
		System.out.println(yuki.address + "\n");

		jiro.talk();
		System.out.println();
		jiro.walk();
		System.out.println();
		jiro.run();
		System.out.println();

		Robot aibo = new Robot();
		aibo.name = "aibo";
		Robot asimo = new Robot();
		asimo.name = "asimo";
		Robot pepper = new Robot();
		pepper.name = "pepper";
		Robot doraemon = new Robot();
		doraemon.name = "doraemon";

		aibo.talk();
		aibo.walk();
		aibo.run();
		asimo.talk();
		asimo.walk();
		asimo.run();
		pepper.talk();
		pepper.walk();
		pepper.run();
		doraemon.talk();
		doraemon.walk();
		doraemon.run();


	}

}
