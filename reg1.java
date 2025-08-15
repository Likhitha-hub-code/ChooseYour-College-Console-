
   
import java.util.Scanner;

class Registration {
    static Scanner sc = new Scanner(System.in);
    static String Name;
    static int age;
    static String Branch;
    static long Mobilenumber;
    private String Username = " ";
    private int password;
    static int a = 0;
    static int loginattempts;
	private static Registration obj = new Registration();

    void setM_no(long Mobilenumber) {
        String mobilenumberstring = String.valueOf(Mobilenumber);
        if (mobilenumberstring.length() == 10 && mobilenumberstring.charAt(0) >= '6' && mobilenumberstring.charAt(0) <= '9') {
            this.Mobilenumber = Mobilenumber;
        } else {
            System.out.println("Invalid Mobile Number");
            System.out.println("Re-enter Mobile Number");
            setM_no(sc.nextLong());
        }
    }

    void setPassword(int password) {
        String passwordString = String.valueOf(password);
        if (passwordString.length() == 5) {
            this.password = password;
            System.out.println("Registration Successful");
            Home();
        } else {
            a = 1;
            System.out.println("Invalid Password");
            System.out.println("Re-enter your Password");
            setPassword(sc.nextInt());
        }
    }

    void setUsername(String Username) {
        if (Username.length() == 10) {
            this.Username = Username;
        } else {
            System.out.println("Invalid Username");
            System.out.println("Re-Enter your Username");
            setUsername(sc.next());
        }
    }

    int getPassword() {
        return password;
    }

    String getUsername() {
        return Username;
    }

    static void login() {
        System.out.print("Enter Your Username: ");
        String username = sc.next();
        System.out.print("Enter Your Password: ");
        int enteredPassword = sc.nextInt();
	String correctUsername = obj.getUsername().trim(); // Trim to remove leading/trailing spaces
    	int correctPassword = obj.getPassword();

        if (correctUsername.equals(username) && correctPassword == enteredPassword) {
            System.out.println("Login Successfully");
        } else {
            loginattempts++;
            System.out.println("Wrong username and password");

            if (loginattempts < 3) {
                System.out.println("Re-enter your username and password");
                login();
            } else {
                System.out.println("Too many unsuccessful login attempts. Exiting.");
                System.exit(0);
            }
        }
    }

    public static void Display()
	 {
        Registration obj = new Registration();
        System.out.print("Enter Your Name: ");
        Name = sc.next();
        System.out.print("Enter Your Age: ");
        age = sc.nextInt();
        System.out.print("Enter your Branch: ");
        Branch = sc.next();
        System.out.print("Enter Your Mobile Number: ");
        obj.setM_no(sc.nextLong());
        System.out.println("Note: Username Should be 10 Digits");
        System.out.print("Set Your UserName: ");
        obj.setUsername(sc.next());
        System.out.print("Set your Password: ");
        if (a == 0)
	 {
            obj.setPassword(sc.nextInt());
        }
	 else 
	{
            return;
        }
    }

    static void Home() {
        System.out.println("1. Registration");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        switch (sc.nextInt()) {
            case 1:
                Display();
                break;
            case 2:
                login();
                break;
        }
    }

    public static void main(String[] args) {
        Home();
    }
}