import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCricket {
	public static void main (String[]args) {
		ArrayList<Cricket>crickets=new ArrayList<>();
		crickets.add(new Cricket("Harish",105,"Gowdham","Bowler",26));
		crickets.add(new Cricket("Gopi",220,"Suresh","Batsman",34));
		crickets.add(new Cricket("Lohit",167,"Sukesh","AllRounder",26));
		crickets.add(new Cricket("Rajesh",105,"Deepak","AllRounder",26));
		
		List<String>a=crickets.stream().filter(x->x.getSkill().equals("Bowler")).map(x->x.getName()).collect(Collectors.toList());
		a.forEach(x->System.out.println(x));
		System.out.println(a);
		List<String>b=crickets.stream().filter(x->x.getSkill().equals("Bowler")).map(x->x.getLastName()).collect(Collectors.toList());
		b.forEach(x->System.out.println(x));
		System.out.println(b);
		
		List<String>c=crickets.stream().filter(x->x.getSkill().equals("Batsman")).map(x->x.getName()).collect(Collectors.toList());
		System.out.println(c);
		c.forEach(x->System.out.println(x));
		List<String>d=crickets.stream().filter(x->x.getSkill().equals("Batsman")).map(x->x.getLastName()).collect(Collectors.toList());
		System.out.println(d);
		d.forEach(x->System.out.println(x));
		
		List<Cricket>e=crickets.stream().filter(x->x.getSkill().equals("AllRounder")).collect(Collectors.toList());	
		long Allroundercount=e.stream().count();
		System.out.println(Allroundercount);
		
		List<String>f=crickets.stream().filter(x->x.getAge()>28).map(x->x.getLastName()).collect(Collectors.toList());
		System.out.println(f);
		f.forEach(x->System.out.println(x));
		
	
		
		
		
		
	}

}
