import java.util.*;
import java.text.DecimalFormat;
class currency
{
	public static void main(String []args)
	{
		double rupee,dollar,pound,euro,yen;
		int code;
		DecimalFormat f = new DecimalFormat("##.###");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the currency code 1.Rupees\n2.Dollar\n3.Pound\n4.Euro\n5.Yen");
		code = sc.nextInt();
		//For Convertiom
while(true){
		switch(code)
		{
			//Rupees convertion
			case 1 : System.out.println("Enter Currency in Rupees:");
				 rupee = sc.nextFloat();
				 dollar = rupee/66;
				 System.out.println("Dollar:" + f.format(dollar));
				 pound = rupee/98;
				 System.out.println("Pound:" + f.format(pound));
				 euro = rupee/72;
				 System.out.println("Euro:" + f.format(euro));
				 yen = rupee/0.55;
				 System.out.println("Yen:" + f.format(yen));
				 break;
			//Dollar conversion
			case 2 : System.out.println("Enter Currency in Dollars:");
                                 dollar = sc.nextFloat();
                                 rupee = dollar*66;
                                 System.out.println("Rupees:" + f.format(rupee));
                                 pound = dollar*0.67;
                                 System.out.println("Pound:" + f.format(pound));
                                 euro = dollar*0.92;
                                 System.out.println("Euro:" + f.format(euro));
                                 yen = dollar*120.9;
                                 System.out.println("Yen:" + f.format(yen));
                                 break;
			//Pound conversion
			case 3 : System.out.println("Enter Currency in Pounds:");
                                 pound = sc.nextFloat();
                                 rupee = pound*98;
                                 System.out.println("Rupees:" + f.format(rupee));
                                 dollar = pound*1.49;
                                 System.out.println("Dollar:" + f.format(dollar));
                                 euro = pound*1.36;
                                 System.out.println("Euro:" + f.format(euro));
                                 yen = pound*179.89;
                                 System.out.println("Yen:" + f.format(yen));
                                 break;
			//Euro conversion
			case 4 : System.out.println("Enter Currency in Euro:");
                                 euro = sc.nextFloat();
                                 rupee = euro*72;
                                 System.out.println("Rupees:" + f.format(rupee));
                                 dollar = euro*1.09;
                                 System.out.println("Dollar:" + f.format(dollar));
                                 pound = euro*0.73;
                                 System.out.println("Pound:" + f.format(pound));
                                 yen = euro*131.84;
                                 System.out.println("Yen:" + f.format(yen));
                                 break;
			//Yen conversion
			case 5 : System.out.println("Enter Currency in Yen:");
                                 yen = sc.nextFloat();
                                 rupee = yen*0.55;
                                 System.out.println("Rupees:" + f.format(rupee));
                                 dollar = yen*0.01;
				 System.out.println("Dollar:" + f.format(dollar));
                                 pound = yen*0.01;
                                 System.out.println("Pound:" + f.format(pound));
                                 euro = yen*0.01;
                                 System.out.println("Euro:" + f.format(euro));
                                 break;
			default : System.out.println("Invalid Code !");
		}}
	}
}
