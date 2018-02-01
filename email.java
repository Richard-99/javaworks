import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
class email
{
	public static void main(String []args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter email id:");
		String email = br.readLine();
		boolean result = isValidEmail(email);
		if(result)
		{
			System.out.println(email + " is valid email address");
		}
		else
		{
			System.out.println(email + " is invalid email address");
		}
	}
	public static boolean isValidEmail(String email)
	{
		String s = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		Pattern emailPattern = Pattern.compile(s);
		Matcher m = emailPattern.matcher(email);
		return m.matches();
	}
}
