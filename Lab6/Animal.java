import java.util.*;
class Animals{
	String name;
    static int noOfAnimal;
	int type_Of_Animal;
	static int total_Leg_Of_All_Animal;
	// int animal_Count;
	
}
class Lion extends Animals{
	final String name="Lion";
	final int no_Of_Leg=4;
	 static int lion_leg=0;
	int lion_Count;
	public Lion(){
		lion_Count++;
		noOfAnimal++;
		lion_leg=no_Of_Leg*lion_Count;
	}

}
class Tiger extends Animals{
	final String name="Tiger";
	final int no_Of_Leg=4;
	static int tiger_leg=0;
	int tiger_Count;
	public Tiger(){
		tiger_Count++;
		noOfAnimal++;
		tiger_leg=no_Of_Leg*tiger_Count;
	}

}
public class Animal{
	public static void main(String[] args) {

		Lion l1=new Lion();
		Tiger t1=new Tiger();
		Animals.total_Leg_Of_All_Animal=Lion.lion_leg+Tiger.tiger_leg;

		System.out.println("name="+l1.name);
		System.out.println("count="+l1.lion_Count);
		System.out.println("no of animal"+Animals.noOfAnimal);
		System.out.println("total leg+"+Animals.total_Leg_Of_All_Animal);
	}
}