import org.junit.Test;

public class Execute implements ToyCar{

	@Test
	public void test2()
	{
		Cat c=new Cat();
		Day[] days=Day.values();
		for(Day day:days)
		{
			System.out.println(day);
		}
		Animal a[]=new Animal[2];
		a[0]=new Cat();
		a[1]=new Dog();
		for(int i=0;i<a.length;i++)
		{
			a[i].eat();
		}
		
	}
	
	
	
	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println(a);
	}

	@Override
	public void getLength() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nopower() {
		// TODO Auto-generated method stub
		
	}

}
