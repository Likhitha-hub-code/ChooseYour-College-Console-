import java.util.Scanner;
class Login
{
	static String Name;
	static int age;
	static String Branch;
	private String M_No="9876543219";
	private String pwd="1234";
	static String RegisterM_No;
	static String RegisterPwd;
	static int x1=0;
	static int x2=0;
	void setMobileNumber(String M_No)
	{
		if(M_No.length()==10)
		{
			if(M_No.charAt(0)=='6'||M_No.charAt(0)=='7'||M_No.charAt(0)=='8'||M_No.charAt(0)=='9')
			{
				this.M_No=M_No;
			}
			else
			{
				x1=1;
				System.out.println("Enter valid Mobile Number");
				return;
			}
			
		}
		else
		{
			x1=1;
			System.out.println("Mobile number should be 10 digits");
			return;
		}
		
	}
	void setPwd(String pwd)
	{
		if(pwd.length()==4)
		{
			this.pwd=pwd;
		}
		else
		{
			x2=1;
			System.out.println("password should be 4 digits");
			return;
		}
	}
	String getMobileNumber()
	{
		return M_No;
	}
	String getPwd()
	{
		return pwd;
	}
}
class Register extends Login
{
	static int y1=0;
	static int y2=0;
	static Login user1=new Login();
	static Scanner sc=new Scanner(System.in);
	static void Register()
	{
		System.out.print("Enter your Mobile Number: +91  ");
		String z=sc.next();
			
		if(z.length()==10)
		{
			if(z.charAt(0)=='6'||z.charAt(0)=='7'||z.charAt(0)=='8'||z.charAt(0)=='9')
			{
				RegisterM_No=z;
				user1.setMobileNumber(RegisterM_No);
			}
			else
			{
				y1=1;
				System.out.println("Enter valid Mobile Number");
				Register();
			}
		}
		else
		{
			y1=1;
			System.out.println("mobile number should be 10 digits");
			return;
		}
		
		System.out.println("Enter your Password:");
		String y=sc.next();
		if(y.length()==4)
		{
			RegisterPwd=y;
			System.out.println("Re-enter password: ");
			String n=sc.next();
			if(n.equals(RegisterPwd))
			{
				
				user1.setPwd(RegisterPwd);
					
				System.out.println("Register Successful");
			}
			else
			{
				System.out.println("Enter valid pin");
				return;
			}
		}
		else
		{
			y2=1;
			System.out.println("password should be 4 digits");
			return;
		}
			
		
	}
}
class User extends Register 
{
	
	static Scanner sc=new Scanner(System.in);
	static void login()
	{
		 String t1=user1.getMobileNumber();
		 String t2=user1.getPwd();
		System.out.print("Enter Your Name:");
		Name=sc.next();
		System.out.print("Enter Your Age:");
		age=sc.nextInt();
		System.out.print("Enter your Branch:");
		Branch=sc.next();
		System.out.print("Enter your Mobile Number: +91");
		System.out.print("Note:Mobile Number Should Start with 6,7,8 and 9");
		String MobileNumber=sc.next();
		System.out.println("Enter your Password:");
		System.out.print("Password Should be four Digits");
		String password=sc.next();
		if(t1.equals(MobileNumber)&&t2.equals(password))
		{
			System.out.println("Login Successful");
			
		}
		else
		{
			System.out.println("check your credentials");
			login();
		
		}
	}
	public static void main(String[] args)
	{
		System.out.println("1.login");
		System.out.println("2.Register");
		System.out.println("3.exit");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
				login();
				break;
			case 2:
				Register();
				if(y1==0)
				{
				  login();
				}
			case 3:
				System.exit(0);
			
		}
	}
}
