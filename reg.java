import java.util.Scanner;
class Registration
{
	static Scanner sc=new Scanner(System.in);
	static Registration obj=new Registration();
	static String bold="\033[0;1m";
	static String blink="\u001B[5m";
	static String yellow="\u001B[33m";
	static String red="\u001B[31m";
	static String blue="\u001B[34m";
	static String green="\u001B[32m";
	static String orange="\u001B[38;5;201m";
	static String purple="\u001B[35m";
	static String skyblue="\u001B[36m";
	static String stopcolor="\u001B[0m";
    	static String BLACK_BACKGROUND = "\033[40m";  // BLACK
    	static String RED_BACKGROUND = "\033[41m";    // RED
     	static String GREEN_BACKGROUND = "\033[42m";  // GREEN
    	static String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    	static String BLUE_BACKGROUND = "\033[44m";   // BLUE
    	static String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    	static String CYAN_BACKGROUND = "\033[46m";   // CYAN
	static String Name="CHINNI";
	static int age=23;
	static String Branch="MPC";
	static long Mobilenumber=9951134863l;
	private String Username="1234567891";
	private int password=12345;
	static int a=0;
	static int d=0;
	static int l=0;
	static int m=0;
	static int loginattempts;
	static String Collegename;
	void M_no(long Mobilenumber)
	{
		String mobilenumberstring=String.valueOf(Mobilenumber);
		if(mobilenumberstring.length() == 10 && mobilenumberstring.charAt(0) >= '6' && mobilenumberstring.charAt(0) <= '9')
		{
			this.Mobilenumber=Mobilenumber;
		}
		else
		{
			System.out.println(red+"         Invalid Mobile Number       "+stopcolor);
			System.out.println();
			System.out.println("Re-enter Mobile Number");
			M_no(sc.nextLong());
				
		}
	}
	void setPassword(int password)
	{
		if(password<100000)
		{
			this.password=password;
			System.out.println(green+"-----------------Registration Successfull------------------"+stopcolor);
			System.out.println();
		}
		else
		{
			a=1;
			System.out.println(red+"       Invalid Password       "+stopcolor);
			System.out.println();
			System.out.println("Re-set your Password");
			setPassword(sc.nextInt());
			return;
		}
	}
	void setUsername(String Username)
	{
		if(Username.length()==10)
		{
			this.Username=Username;
		}
		else
	
		{
			System.out.println(red+"         Invalid Username        "+stopcolor);
			System.out.println();
			System.out.println("Re-set your Username");
			setUsername(sc.next());

		}
	}
	int getPassword()
	{
		return password;
	}
	String getUsername()
	{
		return Username;
	}
	static void login() 
	{
		System.out.print("Enter Your Username ");
		String username=sc.next();
		System.out.println();
		System.out.print("Enter Your Password ");
		int enteredpassword=sc.nextInt();
		if((obj.getUsername().equals(username) )&& (obj.getPassword() == enteredpassword))
		{
			System.out.println(green+"_________________________Login Successfully______________________"+stopcolor);
			System.out.println();
		}
		else
		{
			loginattempts++;
			System.out.println(red+"              Wrong username and password         "+stopcolor); 
			System.out.println();
			if(loginattempts<=3)
			{
				System.out.println("Re-enter your Username and Password");
				login();
			}
			else
			{
				System.out.println(red+blink+"         Too many unsuccessful login attempts. Exiting.         "+stopcolor);
            			System.exit(0);
			}
		}
	}
	public static void Display() 
	{
			System.out.println("Enter Your Name:"+" ");
			Name=sc.next();
			System.out.println();
			System.out.println("Enter Your Age");
			age=sc.nextInt();
			System.out.println();
			System.out.println("Choose your Branch");
			System.out.println("1.MPC");
			System.out.println("2.BIPC");
			switch(sc.nextInt())
			{
				case 1:
			l=1;
			System.out.println();
			System.out.println("Enter Your Mobile Number");
			obj.M_no(sc.nextLong());
			System.out.println();
			System.out.println(red+blink+"       Note:Username Shoulb Be 10 Characters        "+stopcolor);
			System.out.println();
			System.out.println("Set Your UserName");
			obj.setUsername(sc.next());
			System.out.println();
			System.out.println(red+blink+"       Note:Password Should Be Five Digits     "+stopcolor);
			System.out.println();
			System.out.println("Set your Password"); 
			obj.setPassword(sc.nextInt());
			System.out.println();
			break;
			case 2:
				m=1;
				System.out.println("Here Only Provide BTech Colleges Only");
				System.out.println("1.If you want to check Btech Colleges");
				System.out.println("2.Dont Want");
				switch(sc.nextInt())
				{
					case 1:
					System.out.println();
					System.out.println("Enter Your Mobile Number");
					obj.M_no(sc.nextLong());
					System.out.println();
					System.out.println(red+blink+"       Note:Username Shoulb Be 10 Characters        "+stopcolor);
					System.out.println();
					System.out.println("Set Your UserName");
					obj.setUsername(sc.next());
					System.out.println();
					System.out.println(red+blink+"       Note:Password Should Be Five Digits     "+stopcolor);
					System.out.println();
					System.out.println("Set your Password"); 
					obj.setPassword(sc.nextInt());
					System.out.println();
					break;
					case 2:
						d=1;
						break;
						
				}
				break;
			}
	}
	static void Home()
	{
		
		System.out.println("1.Registration");
		System.out.println();
		System.out.println("2.Login");
		System.out.println();
		System.out.println("3.Exit");
		System.out.println();
		switch(sc.nextInt())
		{
			case 1:
				Display();
				if(d==0)
				{
					Home();
				}
				break;
			case 2:
				login();
				System.out.println(orange+" To see the College Details You Must Pay the Registration Fee  "+stopcolor);
				System.out.println();
				Union obj=new Union();
				obj.displaypay();
				Mallareddy obj1=new Mallareddy();
				obj1.CollegeDisplay();
				
			case 3:
				System.exit(0);

		}
	}
	public static void main(String[] args)
	{
				System.out.println("________________"+bold+skyblue+blink+BLUE_BACKGROUND+"WELCOME TO CHOOSE MY COLLEGE"+stopcolor+"__________________");
				System.out.println();
		Home();
	}
	
}
abstract class A extends Registration
{
	
	abstract String paymentByAccount(long accno);
	
}	
class SBI extends A
{
	static Scanner sc = new Scanner(System.in);
	public static double bal=5000;
	public static int fee=100;

	static{
	System.out.println("Registration Fee is 100");
	System.out.println();
	}
	 void payment(String upi)
	{
		if (bal < fee) 
		{
       			System.out.println(red+"Insufficient balance"+stopcolor);
     		} 
		else
		{
           		bal=bal-fee;
            		System.out.println(green+"_________________________Successful Transaction______________________"+stopcolor);
			System.out.println();
        	}
	}
	String paymentByAccount(long accno) 
	{
        	if (bal < fee) 
		{
           		return red+"Insufficient balance"+stopcolor;
        	} 
		else 
		{
            		bal=bal-fee;
            		return green+"_________________________Successful Transaction______________________"+stopcolor;
        	}
    	}
	void payment(long mobno)
	{
		String mobilenumberstring=String.valueOf(mobno);
		if(mobilenumberstring.length() == 10 && mobilenumberstring.charAt(0) >= '6' && mobilenumberstring.charAt(0) <= '9')
		{
			if (bal < fee) 
			{
           			System.out.println(red+"Insufficient balance"+stopcolor);
        		}
		}
		else
		{
			System.out.println(red+"Invalid Mobile Number"+stopcolor);
			System.out.println("Re-enter Mobile Number");
			payment(sc.nextLong());	
		}
	}
}
class Union extends SBI
{
	static Scanner sc = new Scanner(System.in);
	void payment(String upi)
	{
		if (bal < fee) 
		{
			System.out.println(red+"insufficient Balance"+stopcolor);
     		} 
		else
		{
           		bal=bal-fee;
            		System.out.print(green+"______________________Successful Transaction________________________"+stopcolor);
			System.out.println();
        	}
	}
	String paymentByAccount(long accno) 
	{
        	if (bal < fee) 
		{
           		return red+"Insufficient balance"+stopcolor;
        	} 
		else 
		{
            		bal=bal-fee;
            		return green+"____________________________Successful Transaction________________________"+stopcolor;
        	}
    	}
	void payment(long mobno)
	{
		String mobilenumberstring=String.valueOf(mobno);
		if(mobilenumberstring.length() == 10 && mobilenumberstring.charAt(0) >= '6' && mobilenumberstring.charAt(0) <= '9')
		{
			if (bal < fee) 
			{
           			System.out.println(red+"Insufficient balance"+stopcolor);
        		}
		}
		else
		{
			System.out.println(red+"Invalid Mobile Number"+stopcolor);
			System.out.println("Re-enter Mobile Number");
			payment(sc.nextLong());	
		}
	}
	public static void displaypay() 
	{
		SBI obj=new SBI();
		Union obj1=new Union();

		System.out.println("1."+blue+"SBI"+stopcolor);
		System.out.println("2."+red+"Union"+stopcolor);
		int s=sc.nextInt();
		if(s==1)
		{
			System.out.println("1."+purple+"PhonePe"+stopcolor);
			System.out.println("2."+blue+"G"+yellow+"P"+green+"A"+red+"Y"+stopcolor);
			System.out.println("3."+blue+"Paytm"+stopcolor);
			switch(sc.nextInt())
			{
				case 1:
			
	System.out.println("1.Payment by UPI");
				System.out.println("2.Payment by Account Number");
				System.out.println("3.Payment by Mobile Number");	
				switch(sc.nextInt())
				{
				case 1:
					System.out.println("Enter UPI Id");
					obj.payment(sc.next());
					break;
				case 2:	
					System.out.println("Enter AccountNumber");
																	System.out.println(obj.paymentByAccount(sc.nextLong()));
					break;
				case 3:
					System.out.println("Enter Mobile Number");
					obj.payment(sc.nextLong());
					break;
				default:
					System.out.println("enter correct details!");
					break;
				}
				break;
			case 2:
				System.out.println("1.Payment by UPI");
				System.out.println("2.Payment by Account Number");
				System.out.println("3.Payment by Mobile Number");	
				switch(sc.nextInt())
				{
				case 1:
					System.out.println("Enter UPI Id");
					obj.payment(sc.next());
					break;
				case 2:	
					System.out.println("Enter Accountnumber");												System.out.println(obj.paymentByAccount(sc.nextLong()));
					break;
				case 3:
					System.out.println("Enter MobileNumber");
					obj.payment(sc.nextLong());
					break;
				default:
					System.out.println("enter correct details!");
					break;
				}
				break;
			case 3:
				System.out.println("1.Payment by UPI");
				System.out.println("2.Payment by Account Number");
				System.out.println("3.Payment by Mobile Number");	
				switch(sc.nextInt())
				{
				case 1:
					System.out.println("Enter UPI Id");
					obj.payment(sc.next());
					break;
				case 2:	
					System.out.println("Enter Accountnumber");												System.out.println(obj.paymentByAccount(sc.nextLong()));
					break;
				case 3:
					System.out.println("Enter Mobilenumber");
					obj.payment(sc.nextLong());
					break;
				default:
					System.out.println("Invalid!");
					break;
				}
				break;
			}
		
		}
		else if(s==2)
		{
			System.out.println("1."+purple+"PhonePe"+stopcolor);
			System.out.println("2."+blue+"G"+yellow+"P"+green+"A"+red+"Y"+stopcolor);
			System.out.println("3."+blue+"Paytm"+stopcolor);

			switch(sc.nextInt())
			{
				case 1:
					System.out.println("1.Payment by UPI");
					System.out.println("2.Payment by Account Number");
					System.out.println("3.Payment by Mobile Number");
					
					switch(sc.nextInt())
					{
						case 1:
							System.out.println("Enter UPI Id");
							obj1.payment(sc.next());
							break;
						case 2:
							System.out.println("Enter Accountnumber");																System.out.println(obj1.paymentByAccount(sc.nextLong()));								break;
						case 3:
							System.out.println("Enter Mobilenumber");
							obj1.payment(sc.nextLong());
							break;
						default:
							System.out.println("Invalid!");
							break;
					}
					break;
				case 2:
					System.out.println("1.Payment by UPI");
					System.out.println("2.Payment by Account Number");
					System.out.println("3.Payment by Mobile Number");	
					switch(sc.nextInt())

					{
						case 1:
							System.out.println("Enter UPI Id");
							obj1.payment(sc.next());
							break;
						case 2:	
							System.out.println("Enter Accountnumber");															System.out.println(obj1.paymentByAccount(sc.nextLong()));								break;
						case 3:
							System.out.println("Enter Mobilenumber");
							obj1.payment(sc.nextLong());
							break;
						default:
							System.out.println("Invalid!");
							break;
					}
					break;
				case 3:
					System.out.println("1.Payment by UPI");
					System.out.println("2.Payment by Account Number");
					System.out.println("3.Payment by Mobile Number");	
					switch(sc.nextInt())
					{
						case 1:
							System.out.println("Enter UPI Id");
							obj1.payment(sc.next());
							break;
						case 2:	
							System.out.println("Enter Accountnumber");															System.out.println(obj1.paymentByAccount(sc.nextLong()));														break;
						case 3:
							System.out.println("Enter Mobilenumber");
							obj1.payment(sc.nextLong());
							break;
						default:
							System.out.println("Invalid");
							break;
					}
				break;
					default:
						System.out.print("Invalid");
			}
		}
		else
		{
			System.out.println("Must Select Bank And Pay");
			displaypay();
		}
	}
}
abstract class Managment extends Union
{
	static Scanner sc=new Scanner(System.in);
	abstract int facultyexperience();
	abstract float placementpercentage();
	abstract float studentpasspercentage();
}
class JNTUH extends Managment
{
	int facultyexperience()
	{
		return 3;
	}
	float placementpercentage()
	{
		return 79; 
	}
	float studentpasspercentage()
	{
		return 90;
	}
	void Details()
	{
		System.out.println("Allow Only Below 10000 rank Students");
		System.out.println();
		System.out.print("1.To see the Details of Branches");
		System.out.print("2.To see Details of Co-Curricular Activities");
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
						System.out.print("Allow Only Below 2000 Rank Students for CSE Branch");
						break;
					case 2:
						System.out.print("Allow Only Below 4000 Rank Students for IT branch");
						break;
					case 3:
						System.out.print("Allow Only Below 6000 Rank Students for ECE Branch");
						break;
					case 4:
						System.out.print("Allow Only Below 9000 Rank Students for EEE Branch");
						break;
					case 5:
						System.out.print("Allow Only Bellow 10000 Rank Students for MechE Branch");
						break;
					default:
						System.out.print("Invalid Number");
				}
				System.out.println();
				System.out.println(bold+skyblue+"             -----Student Details------          "+stopcolor);
				System.out.println("___________________________________");
				System.out.println();
				System.out.println("Name                  "+Name);
				System.out.println("Age                   "+age);
				if(l==1)
				{
				System.out.println("Branch                "+"MPC");
				}
				else if(m==1)
				{
					System.out.println("Branch                "+"BIPC");
				}
				System.out.println("Mobilenumber          "+Mobilenumber);
				System.out.println("Matched College       "+Collegename);
				System.out.println();
				System.out.println("------------------------------------");
				break;
			case 2:
				System.out.println("1.To see Details of Sports");
				System.out.println("2.To see the Details of NCC");
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
				}
				System.out.println();
				System.out.println(bold+skyblue+"	------Student Details-----	  "+stopcolor);
				System.out.println("___________________________________");
				System.out.println();
				System.out.println("Name                  "+Name);
				System.out.println("Age                   "+age);
				if(l==1)
				{
				System.out.println("Branch                "+"MPC");
				}
				else if(m==1)
				{
					System.out.println("Branch                "+"BIPC");
				}
				System.out.println("Mobilenumber          "+Mobilenumber);
				System.out.println("Matched College       "+Collegename);
				System.out.println();
				System.out.println("------------------------------------");
				break;
			default:
				System.out.print(red+"Invalid Number"+stopcolor);
		}	
			
	}
}
class Osmania extends Managment
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
		System.out.println("Allow only Bellow 30000 Rank Students");
		System.out.println();
		System.out.println("1.To see the Details of Branches");
		System.out.println("2.To see Details of Co-Curricular Activities");
		switch(sc.nextInt())
		{
			case 1:
				System.out.println("1.CSE");
				System.out.println("2.IT");
				System.out.println("3.ECE");
				System.out.println("4.EEE");
				switch(sc.nextInt())
				{
					case 1:
						System.out.println("Allow Only For the Below 2000 Rank Students");
						break;

					case 2:
						System.out.print("Allow Only for the Below 4000 Rank Students");
						break;
					case 3:
						System.out.print("Allow Only for the below 6000 Rank Students");
						break;
					case 4:
						System.out.print("Allow Only for the below 9000 Rank Students");
						break;
					default:
						System.out.print("Invalid Number");
				}
				System.out.println();
				System.out.println(skyblue+"               ------Student Details------         "+stopcolor);
				System.out.println("___________________________________");
				System.out.println();
				System.out.println("Name                  "+Name);
				System.out.println("Age                   "+age);
				if(l==1)
				{
				System.out.println("Branch                "+"MPC");
				}
				else if(m==1)
				{
					System.out.println("Branch                "+"BIPC");
				}
				System.out.println("Mobilenumber          "+Mobilenumber);
				System.out.println("Matched College       "+Collegename);
				System.out.println();
				System.out.println("------------------------------------");
				break;
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
				System.out.println();
				System.out.println(skyblue+"       -------Student Details------       "+stopcolor);
				System.out.println("___________________________________");
				System.out.println();
				System.out.println("Name                  "+Name);
				System.out.println("Age                   "+age);
				if(l==1)
				{
				System.out.println("Branch                "+"MPC");
				}
				else if(m==1)
				{
					System.out.println("Branch                "+"BIPC");
				}
				System.out.println("Mobilenumber          "+Mobilenumber);
				System.out.println("Matched College       "+Collegename);
				System.out.println();
				System.out.println("------------------------------------");
				break;
				default:
					System.out.print("Invalid");
						break;
		}
		
	}
}
class PBsiddartha extends Managment
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
		System.out.println("Allow Only Below 50000 rank Students");
		System.out.println();
		System.out.println("1.To see the Details of Branches");
		System.out.println("2.To see Details of Co-Curricular Activities");
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
						System.out.println("Allow Only For the Below 2000 Rank Students");
						break;
					case 2:
						System.out.println("Allow Only for the Below 4000 Rank Students");
						break;
					case 3:
						System.out.println("Allow Only for the below 6000 Rank Students");
						break;
					case 4:
						System.out.println("Allow Only for the below 9000 Rank Students");
						break;
					default:
						System.out.print("Invalid Number");
				}
				System.out.println();
				System.out.println(skyblue+"         ------Student Details------      "+stopcolor);
				System.out.println("___________________________________");
				System.out.println();
				System.out.println("Name                  "+Name);
				System.out.println("Age                   "+age);
				if(l==1)
				{
				System.out.println("Branch                "+"MPC");
				}
				else if(m==1)
				{
					System.out.println("Branch                "+"BIPC");
				}
				System.out.println("Mobilenumber          "+Mobilenumber);
				System.out.println("Matched College       "+Collegename);
				System.out.println();
				System.out.println("------------------------------------");
				break;
			case 2:
				System.out.println("1.To see Details of Sports");
				System.out.println("2.To see the Details of NCC");
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
					break;
				}
				System.out.println();
				System.out.println(skyblue+"         ------Student Details------        "+stopcolor);
				System.out.println("___________________________________");
				System.out.println();
				System.out.println("Name                  "+Name);
				System.out.println("Age                   "+age);
				if(l==1)
				{
				System.out.println("Branch                "+"MPC");
				}
				else if(m==1)
				{
					System.out.println("Branch                "+"BIPC");
				}
				System.out.println("Mobilenumber          "+Mobilenumber);
				System.out.println("Matched College       "+Collegename);
				System.out.println();
				System.out.println("------------------------------------");
				break;
			default:
				System.out.print(red+"Invalid Number"+stopcolor);
				break;
		}
	}
}
class Mallareddy extends Managment
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
		System.out.println("Allow Only Below 70000 rank Students");
		System.out.println();
		System.out.println("1.To see the Details of Branches");
		System.out.println("2.To see Details of Co-Curricular Activities");
		switch(sc.nextInt())
		{
			case 1:
				System.out.println("1.CSE");
				System.out.println("2.IT");
				System.out.println("3.ECE");
				switch(sc.nextInt())
				{
					case 1:
						System.out.println("Allow Only For the Below 20000 Rank Students");
				
						break;
					case 2:
						System.out.println("Allow Only for the Below 40000 Rank Students");
						
						break;
					case 3:
						System.out.println("Allow Only for the Below 70000 Rank Students");
						
						break;
					default:
						System.out.print("Invalid Number");
						break;
				
				}
				System.out.println();
				System.out.println(skyblue+"          -----Student Details-----        "+stopcolor);
				System.out.println("___________________________________");
				System.out.println();
				System.out.println("Name                  "+Name);
				System.out.println("Age                   "+age);
				if(l==1)
				{
				System.out.println("Branch                "+"MPC");
				}
				else if(m==1)
				{
					System.out.println("Branch                "+"BIPC");
				}
				System.out.println("Mobilenumber          "+Mobilenumber);
				System.out.println("Matched College       "+Collegename);
				System.out.println();
				System.out.println("------------------------------------");
				
				break;
				
			case 2:
				System.out.println("1.To see Details of Sports");
				System.out.println("2 To see the Details of NCC");
				switch(sc.nextInt())
				{
					case 1:
						System.out.println("Cricket");
						System.out.println("Batminton");
						System.out.println("Chess");
						break;
					case 2:
						System.out.println("NCC Details");
						System.out.println();
						System.out.println("8T Batallion");
						System.out.println("Every Day Practice Parade");
						break;
					default:
						System.out.print("Invalid Number");
						break;
				}
				System.out.println();
				System.out.println(skyblue+"        ----Student Details----      "+stopcolor);
				System.out.println("___________________________________");
				System.out.println();
				System.out.println("Name                  "+Name);
				System.out.println("Age                   "+age);
				if(l==1)
				{
				System.out.println("Branch                "+"MPC");
				}
				else if(m==1)
				{
					System.out.println("Branch                "+"BIPC");
				}
				System.out.println("Mobilenumber          "+Mobilenumber);
				System.out.println("Matched College       "+Collegename);
				System.out.println();
				System.out.println("------------------------------------");
				break;
			default:
				System.out.print("Invalid Number");
				break;
			
		}
	}	

	public static void CollegeDisplay()
	{
		System.out.println(red+GREEN_BACKGROUND+"                *****Welcome to College Details*****              "          +stopcolor);
		System.out.println();
		System.out.println("Here we Provide Some Colleges Based On Faculty Experience,Placement Percentage,Student Pass Percentage");
		System.out.println(skyblue+"               Please Provide your Requirement            "+stopcolor);
		System.out.println();
		System.out.println("Enter Faculty Experience:"+" ");
		int facultyexperience=sc.nextInt();
		System.out.println();
		System.out.println("Enter Placement Percentage:"+" ");
		float placementpercentage=sc.nextFloat();
		System.out.println();
		System.out.println("Enter Student Pass Percentage:"+" ");
		float studentpasspercentage=sc.nextFloat();
		System.out.println();
		if(facultyexperience>10 || placementpercentage>80 || studentpasspercentage>100)
		{
			System.out.println("Not Found");
		}
		else
		{
		JNTUH obj=new JNTUH();
		Osmania obj1=new Osmania();
		PBsiddartha obj2=new PBsiddartha();
		Mallareddy obj3=new Mallareddy();
		if(obj.facultyexperience()==facultyexperience && obj.placementpercentage()==placementpercentage && obj.studentpasspercentage()==studentpasspercentage)
		{
		int c=1;
		if(c==1)
		{
			Collegename="JNTUH";
		}
		System.out.println("College Name:JNTUH");
		System.out.println();
		obj.facultyexperience();
		obj.placementpercentage();
		obj.studentpasspercentage();
		obj.Details();
		}
		else if(obj1.facultyexperience()==facultyexperience && obj1.placementpercentage()==placementpercentage && obj1.studentpasspercentage()==studentpasspercentage)
		{
		int c=2;
		if(c==2)
		{
			Collegename="Osmania University";
		}
		System.out.println("College Name:Osmania University");
		System.out.println();
		obj1.facultyexperience();
		obj1.placementpercentage();
		obj1.studentpasspercentage();
		obj1.Details();
		}
		else if(obj2.facultyexperience()==facultyexperience && obj2.placementpercentage()==placementpercentage && obj2.studentpasspercentage()==studentpasspercentage)
		{
		int c=3;
		if(c==3)
		{
			Collegename="PB Siddhartha College";
		}
		System.out.println("College Name:PB Siddartha College");
		System.out.println();
		obj2.facultyexperience();
		obj2.placementpercentage();
		obj2.studentpasspercentage();
		obj2.Details();
		}
		else
		{
		int c=4;
		if(c==4)
		{
			Collegename="Mallareddy Engineering College";
		}
		System.out.println("College Name:Mallareddy Engineering College");
		System.out.println();
		obj3.facultyexperience();
		obj3.placementpercentage();
		obj3.studentpasspercentage();
		obj3.Details();
		}
		}
	}
		
	
}



	

		
