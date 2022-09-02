import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class UseCar {
	public static void main (String[]args) {
		ArrayList<Car>cars=new ArrayList<>();
		cars.add(new Car("benz",8723900,"B1","Black",true));
		cars.add(new Car("Audi",9872890,"A8","Blue",false));
		cars.add(new Car("BMW",97282000,"B4","White",true));
		cars.add(new Car("Ford",37892900,"Figo","Red",false));
		
		List<Car>redcars=cars.stream().filter(x->x.getColor().equals("Red")).collect(Collectors.toList());
		System.out.println(redcars);
		System.out.println(" ");
		redcars.forEach(x->System.out.println(x));
		System.out.println(" ");
		
		long redCount=redcars.stream().count();
		System.out.println(redCount);
		System.out.println(" ");
		
		long HighPrice=cars.stream().filter(x->x.getPrice()>100000).count();
		System.out.println(HighPrice);
		System.out.println(" ");
		
		List<String>brand=cars.stream().map(x->x.getBrand()).collect(Collectors.toList());
		System.out.println(brand);
		System.out.println(" ");
		
		List<String>CarsWithColor=cars.stream().filter(x->x.getPrice()>80000).map(x->x.getColor()).collect(Collectors.toList());
		System.out.println(CarsWithColor);
	}

}
