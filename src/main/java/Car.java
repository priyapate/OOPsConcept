import java.util.Scanner;

class Driver {
	String name;
	int mobile;

	public Driver() {
		this.name = "Car Owner";
		this.mobile = 1111;
	}

	public void drive() {
		System.out.println("Drive start" + "have nice drive!");
	}

	public void profile(String name) {
		this.name = name;
	}

	public void profile(String name, int mobile) {
		this.name = name;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}
}

class Car1 {
	Driver driver;
	Beverage b;
	String carchoice;

	Car1() {
		this.carchoice = "suv";
	}

	Car1(String carchoice) {
		this.carchoice = carchoice;
	}

	void GetINtheCar(Driver driver) {
		System.out.println("hi" + driver.getName() + "Enjoy driveing with" + this.carchoice + "car");
	}

	void EnjoyBeverages() {
		System.out.println("want to beverages" + "enter 1 for tea/ 2 for coffee!");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		if (choice == 1) {
			b = new Tea();
		}
		if (choice == 2) {
			b = new Coffee();
		}
		b.getBeverage();

	}
}

abstract class Beverage {

	private void addwater() {
		System.out.println("add water");
	}

	private void addmilk() {
		System.out.println("add Milk");
	}

	private void addsugar() {
		System.out.println("add sugar");
	}

	public void getMixture() {
		System.out.println("your Beverages is ready");
		addwater();
		addmilk();
		addsugar();
	}

	public abstract void getBeverage();

	public abstract void addIngredients();
}

interface Clean {
	void cleanPot();
}

class Tea extends Beverage implements Clean {
	public void addIngredients() {
		System.out.println("tea bag added");
	}

	public void getBeverage() {
		cleanPot();
		getMixture();
		addIngredients();
		System.out.println("tea ready enjoy");
	}

	public void cleanPot() {
		System.out.println("cleaning tea pot");
	}
}

class Coffee extends Beverage implements Clean {
	public void addIngredients() {
		System.out.println("coffee bag added");
	}

	public void getBeverage() {
		cleanPot();
		getMixture();
		addIngredients();
		System.out.println("coffee ready enjoy");
	}

	public void cleanPot() {
		System.out.println("cleaning tea pot");
	}
}

public class Car {
	public static void main(String[] args) {
		System.out.println("Welcome for drive");
		Scanner s = new Scanner(System.in);
		Driver swara = new Driver();
		swara.profile("swara");
		Car1 c;
		System.out.println("want to choice car?" + "0 for no/1 for yes");
		int carType = s.nextInt();
		if (carType == 1) {
			System.out.println("enter car name");
			String carname = s.next();
			c = new Car1(carname);
		} else {
			c = new Car1();
		}
		c.GetINtheCar(swara);
		c.EnjoyBeverages();
	}
}
