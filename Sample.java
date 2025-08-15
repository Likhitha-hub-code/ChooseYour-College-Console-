import java.util.Scanner;
abstract class Managment
{
	static Scanner sc=new Scanner(System.in);
	abstract int facultyexperience();
	abstract float placementpercentage();
	abstract float studentpasspercentage();
}
class College1 extends Managment
{
	int facultyexperience()
	{
		return 5;
	}
	float placementpercentage()
	{
		return 85; 
	}
	float studentpasspercentage()
	{
		return 90;
	}
	void Details()
	{
		System.out.println("Allow Only Below 10000 rank");
		System.out.print("Enter 1 to see the Details of Branches");
		System.out.print("Enter 2 to see Details of Co-Curricular Activities");
		switch(sc.nextInt())
		{
			case 1:
				System.out.println("1.CSE");
				System.out.println("2.IT");
				System.out.println("3.ECE");
				System.out.println("4.EEE");
				System.out.println("5.MechE");
				switch(sc.nextInt())
				{
					case 1:
						System.out.print("Allow Only For the Below 2000 Rank");
						break;
					case 2:
						System.out.print("Allow Only for the Below 4000 Rank");
						break;
					case 3:
						System.out.print("Allow Only for the below 6000 Rank");
						break;
					case 4:
						System.out.print("Allow Only for the below 9000 Rank:");
						break;
					case 5:
						System.out.print("Allow Only for the Bellow 10000 Rank ");
						break;
					default:
						System.out.print("Invalid Number");
				}
				break;
			case 2:
				System.out.println("Enter 1 to see Details of Sports");
				System.out.println("Enter 2 to see the Details of NCC");
				switch(sc.nextInt())
				{
					case 1:
						System.out.println("Cricket");
						System.out.println("Vollyball");
						System.out.println("Batminton");
						System.out.println("Kabaddi");
						System.out.println("Chess");
						break;
					case 2:
						System.out.println("NCC Details");
						System.out.println("10T Batallion");
						System.out.println("Every Day Practice Parade");
						break;
					default:
						System.out.print("Invalid Number");
				}
			default:
				System.out.print("Invalid Number");
		}
		
			
	}
}
class College2 extends Managment
{
	int facultyexperience()
	{
		return 4;
	}
	float placementpercentage()
	{
		return 80;
	}
	float studentpasspercentage()
	{
		return 80;
	}
	void Details()
	{
		System.out.println("Allow only Bellow 30000 Rank");
		System.out.println("Enter 1 to see the Details of Branches");
		System.out.println("Enter 2 to see Details of Co-Curricular Activities");
		switch(sc.nextInt())
		{
			case 1:
				System.out.println("1.CSE");
				System.out.println("2.IT");
				System.out.println("3.ECE");
				System.out.println("4.EEE")
				switch(sc.nextInt())
				{
					case 1:
						System.out.println("Allow Only For the Below 2000 Rank");
						break;

					case 2:
						System.out.print("Allow Only for the Below 4000 Rank");
						break;
					case 3:
						System.out.print("Allow Only for the below 6000 Rank");
						break;
					case 4:
						System.out.print("Allow Only for the below 9000 Rank:");
						break;
					default:
						System.out.print("Invalid Number");
				}
			case 2:
				System.out.println("Enter 1 to see Details of Sports");
				System.out.println("Enter 2 to see the Details of NCC");
				switch(sc.nextInt())
				{
					case 1:
						System.out.println("Cricket");
						System.out.println("Vollyball");
						System.out.println("Kabaddi");
						System.out.println("Chess");
						break;
					case 2:
						System.out.println("NCC Details");
						System.out.println("2T Batallion");
						System.out.println("Every Day Practice Parade");
						break;

					default:
						System.out.print("Invalid Number");
				}
				default:
					System.out.print("Invalid Number");
		}
		
	}
}
class College3 extends Managment
{
	int facultyexperience()
	{
		return 3;
	}
	float placementpercentage()
	{
		return 75;
	}
	float studentpasspercentage()
	{
		return 75;
	}
	void Details()
	{
		System.out.println("Allow Only Below 50000 rank");
		System.out.println("Enter 1 to see the Details of Branches");
		System.out.println("Enter 2 to see Details of Co-Curricular Activities");
		switch(sc.nextInt())
		{
			case 1:
				System.out.println("1.CSE");
				System.out.println("2.ECE");
				System.out.println("3.EEE");
				System.out.println("4.MechE");
				switch(sc.nextInt())
				{
					case 1:
						System.out.println("Allow Only For the Below 2000 Rank");
						break;
					case 2:
						System.out.println("Allow Only for the Below 4000 Rank");
						break;
					case 3:
						System.out.println("Allow Only for the below 6000 Rank");
						break;
					case 4:
						System.out.println("Allow Only for the below 9000 Rank:");
						break;
					default:
						System.out.print("Invalid Number");
				}
			case 2:
				System.out.println("Enter 1 to see Details of Sports");
				System.out.println("Enter 2 to see the Details of NCC");
				switch(sc.nextInt())
				{
					case 1:
						System.out.println("Cricket");
						System.out.println("Vollyball");
						System.out.println("Batminton");
						System.out.println("Kabaddi");
						break;
					case 2:
						System.out.println("NCC Details");
						System.out.println("10T Batallion");
						System.out.println("Every Day Practice Parade");
						break;
					default:
					System.out.print("Invalid Number");
				}
			default:
				System.out.print("Invalid Number");
		}
	}
}
class College4 extends Managment
{
	int facultyexperience()
	{
		return 3;
	}
	float placementpercentage()
	{
		return 70;
	}
	float studentpasspercentage()
	{
		return 70;
	}
	void Details()
	{
		System.out.println("Allow Only Below 70000 rank");
		System.out.println("Enter 1 to see the Details of Branches");
		System.out.println("Enter 2 to see Details of Co-Curricular Activities");
		switch(sc.nextInt())
		{
			case 1:
				System.out.println("1.CSE");
				System.out.println("2.IT");
				System.out.println("3.ECE");
				switch(sc.nextInt())
				{
					case 1:
						System.out.println("Allow Only For the Below 20000 Rank");
						break;
					case 2:
						System.out.println("Allow Only for the Below 40000 Rank");
						break;
					case 3:
						System.out.println("Allow Only for the below 70000 Rank");
						break;
					default:
						System.out.print("Invalid Number");
				}
				break;
				
			case 2:
				System.out.println("Enter 1 to see Details of Sports");
				System.out.println("Enter 2 to see the Details of NCC");
				switch(sc.nextInt())
				{
					case 1:
						System.out.println("Cricket");
						System.out.println("Batminton");
						System.out.println("Chess");
						break;
					case 2:
						System.out.println("NCC Details");
						System.out.println("8T Batallion");
						System.out.println("Every Day Practice Parade");
						break;
					default:
						System.out.print("Invalid Number");
				}
				break;
			default:
				System.out.print("Invalid Number");
			
		}
	}	

	public static void main(String[] args)
	{
		System.out.println("Enter Faculty Experience:"+" ");
		int facultyexperience=sc.nextInt();
		System.out.println("Enter Placement Percentage:"+" ");
		float placementpercentage=sc.nextFloat();
		System.out.println("Enter Student Pass Percentage:"+" ");
		float studentpasspercentage=sc.nextFloat();
		College1 obj=new College1();
		College2 obj1=new College2();
		College3 obj2=new College3();
		College4 obj3=new College4();
		if(obj.facultyexperience()==facultyexperience && obj.placementpercentage()==placementpercentage && obj.studentpasspercentage()==studentpasspercentage)
		{
		System.out.println("College Name:College1");
		obj.facultyexperience();
		obj.placementpercentage();
		obj.studentpasspercentage();
		obj.Details();
		}
		else if(obj1.facultyexperience()==facultyexperience && obj1.placementpercentage()==placementpercentage && obj1.studentpasspercentage()==studentpasspercentage)
		{
		System.out.println("College Name:College2");
		obj1.facultyexperience();
		obj1.placementpercentage();
		obj1.studentpasspercentage();
		obj1.Details();
		}
		else if(obj2.facultyexperience()==facultyexperience && obj2.placementpercentage()==placementpercentage && obj2.studentpasspercentage()==studentpasspercentage)
		{
		System.out.println("College Name:College3");
		obj2.facultyexperience();
		obj2.placementpercentage();
		obj2.studentpasspercentage();
		obj2.Details();
		}
		else
		{
		System.out.println("College Name:College4");
		obj3.facultyexperience();
		obj3.placementpercentage();
		obj3.studentpasspercentage();
		obj3.Details();
		}
	}
		
	
}
