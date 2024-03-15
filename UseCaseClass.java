import java.util.Scanner;
class UseCaseClass 
{
public static void main(String[] args)
	{
	menu();
	}
	public static void menu() 
	{
		while(true)
	{
		Scanner sc=new Scanner(System.in);
		printIndex();
		switch (userInput())
		{
		case 1: 
			{
			System.out.println("Enter a number to check if it is Even or not: ");
			System.out.println("==>"+Utility.isEven(userInput()));
				break;
			}
		case 2: 
			{
			System.out.println("Enter a number to count the number of digits in it: ");
			System.out.println("The count of digits is: "+Utility.countDigits(userInput()));
			break;
			}
		case 3: 
			{
			System.out.println("Enter a number to do the sum of digits in it:  ");
			System.out.println("The sum of digits is: "+Utility.sumDigits(userInput()));
			break;
			}
		case 4: 
			{
			System.out.println("Enter a number to calculate the product of digits in it: ");
			System.out.println("The product of digits is: "+Utility.productDigits(userInput()));
			break;
			}
		case 5: 
			{
			System.out.println("Enter the value of Base: ");
			int x=userInput();
			System.out.println("Enter the value of Raise: ");
			int y=userInput();
			System.out.println(x+" raised to "+y+" is: "+Utility.power(x,y));
			break;
			}
		case 6: 
			{
			System.out.println("Enter a number to rotate: ");
			System.out.println("Rotated number is: "+Utility.rotate(userInput()));
			break;
			}
		case 7: 
			{
			System.out.println("Enter a number to reverse: ");
			System.out.println("Reversed number is: "+Utility.reverse(userInput()));
			break;
			}
		case 8: 
			{
			System.out.println("Enter a number to check if it is prime or not: ");
			System.out.println("==>"+Utility.isPrime(userInput()));
			break;
			}
		case 9: 
			{
			System.out.println("Enter a number to check if it is tech number or not: ");
			System.out.println("==>"+Utility.isTechNumber(userInput()));
			break;
			}
		case 10: 
			{
			System.out.println("Enter a number to calculate the hcf of 2 numbers: ");
			System.out.println("Enter the first number: ");
			int x=userInput();
			System.out.println("Enter the second number: ");
			int y=userInput();
			if (x==0 && y==0)
			{
				System.out.println(0);
			}
			else if (x==0 && y>0)
			{
				System.out.println(y);
			}
			else if (x>0 && y==0)
			{
				System.out.println(x);
			}
			else
				{
			System.out.println("The HCF of "+x+" and "+y+" is: "+Utility.hcf(x,y));
				}
			break;
			}
		case 11: 
			{
			System.out.println("Enter a number to calculate the LCM of 2 numbers: ");
			System.out.println("Enter the first number: ");
			int x=userInput();
			System.out.println("Enter the second number: ");
			int y=userInput();
			if (x==0 || y==0)
			{
				System.out.println("The LCM of zero does not exist.");
			}
			else
				{
			System.out.println("The LCM of "+x+" and "+y+" is "+Utility.lcm(x,y));
				}
				break;
			}
		case 12: 
			{
			System.out.println("Enter a number to check if it is Palindrome or not: ");
			System.out.println("==>"+Utility.isPalindrome(userInput()));
			break;
			}
		case 13: 
			{
			System.out.println("Enter a number to check if it is magic number or not: ");
			System.out.println("==>"+Utility.isMagicNum(userInput()));
			break;
			}
		case 14: 
			{
			System.out.println("Enter a number to check if it is perfect number or not: ");
			System.out.println("==>"+Utility.isPerfect(userInput()));
			break;
			}
		case 15: 
			{
			System.out.println("Enter a number to check if it is buzz number or not: ");
			System.out.println("==>"+Utility.isBuzz(userInput()));
			break;
			}
		case 16: 
			{
			System.out.println("Enter a number to check if it is armstrong number or not: ");
			System.out.println("==>"+Utility.isArmstrong(userInput()));
			break;
			}
		case 17: 
			{
			System.out.println("Enter a number to check if it is automorphic number or not: ");
			System.out.println("==>"+Utility.isAutomorphic(userInput()));
			break;
			}
		case 18: 
			{
			System.out.println("Enter a number to calculate the factorial: ");
			System.out.println("==>"+Utility.factorialOf(userInput()));
			break;
			}
		case 19: 
			{
			System.out.println("Enter a number to check if it is strong number or not: ");
			System.out.println("==>"+Utility.isStrong(userInput()));
			break;
			}
		case 20: 
			{
			System.out.println("Enter a number to check if it is fibonacci or not: ");
			System.out.println("==>"+Utility.isFibonacci(userInput()));
			break;
			}
		case 21: 
			{
			System.out.println("Enter a number to check if it is circular prime or rotating prime or not: ");
			System.out.println("==>"+Utility.CircularPrime(userInput()));
			break;
			}
		case 22: 
			{
			System.out.println("Enter a number to check if it is fibonacci or not by using recursion: ");
			System.out.println("==>"+Utility.isFibonacciRec(0,1,userInput()));
			break;
			}
		case 23: 
			{
			System.out.println("Enter a number to extract: ");
			System.out.println("==>"+Utility.extract(userInput()));
			break;
			}
		case 24: 
			{
			System.out.println("Enter a number to extract single digit, enter digit and index from right: ");
			System.out.println("Enter the number: ");
			int x=userInput();
			System.out.println("Enter the position of digit from right: ");
			int y=userInput();
			System.out.println("==>"+Utility.extractSingleDigit(x,y));
			break;
			}
		case 25: 
			{
			System.out.println("Enter a number to extract multi digits from right: ");
			System.out.println("Enter the number: ");
			int x=userInput();
			System.out.println("Enter the position of digit from right: ");
			int y=userInput();
			System.out.println("==>"+Utility.extractMultiDigitsRight(x,y));
			break;
			}
		case 26: 
			{
			System.out.println("Enter a number to extract multi digits from left ");
			System.out.println("Enter the number: ");
			int x=userInput();
			System.out.println("Enter the position of digit from leftt: ");
			int y=userInput();
			System.out.println("==>"+Utility.extractMultiDigitsLeft(x,y));
			break;
			}
		case 27: 
			{
			System.out.println("Enter a numer to extract right half digits: ");
			System.out.println("==>"+Utility.extractRightHalf(userInput()));
			break;
			}
		case 28: 
			{
			System.out.println("Enter a numer to extract left half digits: ");
			System.out.println("==>"+Utility.extractLeftHalf(userInput()));
			break;
			}
		case 29: 
			{
			System.out.println("Enter a number to check if it is duck number or not: ");
			System.out.println("==>"+Utility.isDuckNum(userInput()));
			break;
			}
		case 30: 
			{
			System.out.println("Enter a number to check if it is happy number or not: ");
			System.out.println("==>"+Utility.isHappyNum(userInput()));
			break;
			}
		case 31: 
			{
			System.out.println("Enter a number to check if it is harshad number or not: ");
			System.out.println("==>"+Utility.isHarshadNum(userInput()));
			break;
			}
		case 32: 
			{
			System.out.println("Enter a number to check if it is neon number or not: ");
			System.out.println("==>"+Utility.isNeonNum(userInput()));
			break;
			}
		case 33: 
			{
			System.out.println("Enter a number to check if it is spy number or not: ");
			System.out.println("==>"+Utility.isSpyNum(userInput()));
			break;
			}
		case 34: 
			{
			System.out.println("Enter 2 number to check if it is twin number or not: ");
			System.out.println("Enter the 1st number: ");
			int x=userInput();
			System.out.println("Enter the 2nd number: ");
			int y=userInput();
			System.out.println("==>"+Utility.isTwinPrime(x,y));
			break;
			}
		case 35: 
			{
			System.out.println("Enter a number to check if it is twisted prime or not: ");
			System.out.println("==>"+Utility.isTwistedPrime(userInput()));
			break;
			}
		case 36: 
			{
			System.out.println("Enter a number to check if it is unique number or not: ");
			System.out.println("==>"+Utility.isUniqueNum(userInput()));
			break;
			}
		case 37: 
			{
			System.out.println("Enter a number to check if it is disarium number or not: ");
			System.out.println("==>"+Utility.isDisariumNum(userInput()));
			break;
			}
		case 38: 
			{
			System.out.println("Enter a number to check if it is pronic number or not: ");
			System.out.println("==>"+Utility.isPronicNum(userInput()));
			break;
			}
		case 39: 
			{
			System.out.println("Enter a number to check if it is ugly number or not: ");
			System.out.println("==>"+Utility.isUglyNum(userInput()));
			break;
			}
		case 40: 
			{
			System.out.println("Enter 2 number to check if it is coprime or not: ");
			System.out.println("==>"+Utility.isCoPrime(userInput(),userInput()));
			break;
			}
		case 41: 
			{
			System.out.println("Enter a year to check if it is leap year or not: ");
			System.out.println("==>"+Utility.isLeapYear(userInput()));
			break;
			}
		case 42: 
			{
			System.out.println("Enter a number to calculate the square root: ");
			System.out.println("==>"+Utility.squareRootOf(userInput()));
			break;
			}
		case 43: 
			{
			System.out.println("Enter a number to calculate the cube root: ");
			System.out.println("==>"+Utility.cubeRootOf(userInput()));
			break;
			}
		case 44: 
			{
			System.out.println("Enter a number to check if it is dudeney number or not: ");
			System.out.println("==>"+Utility.isDudeneyNum(userInput()));
			break;
			}
		case 45: 
			{
			System.out.println("Enter a number to check if it is Bouncy number or not: ");
			System.out.println("==>"+Utility.isBouncyNum(userInput()));
			break;
			}
			default:
			{
				System.out.println("Invalid input");
				System.exit(0);
			}
		}
	}
}
	public static void printIndex()
	{
		System.out.println("1. isEven"+"		"+"11. lcm"+"			"+"21. CircularPrime"+"			"+"31. isHarshadNum"+"	"+"41. isLeapYear");
		System.out.println("2. countDigits"+"		"+"12. isPalindrome"+"	"+"22. isFibonacciRec"+"			"+"32. isNeonNum"+"		"+"42. squareRootOf");
		System.out.println("3. sumDigits"+"		"+"13. isMagicNum"+"		"+"23. extract"+"				"+"33. isSpyNum"+"		"+"43. cubeRootOf");
		System.out.println("4. productDigits"+"	"+"14. isPerfect"+"		"+"24. extractSingleDigit"+"			"+"34. isTwinPrime"+"		"+"44. isDudeneyNum");
		System.out.println("5. power"+"		"+"15. isBuzz"+"		"+"25. extractMultiDigitsRight"+"		"+"35. isTwistedPrime"+"	"+"45. isBouncyNum");
		System.out.println("6. rotate"+"		"+"16. isArmstrong"+"		"+"26. extractMultiDigitsLeft"+"		"+"36. isUniqueNum");
		System.out.println("7. reverse"+"		"+"17. isAutomorphic"+"	"+"27. extractRightHalf"+"			"+"37. isDisariumNum");
		System.out.println("8. isPrime"+"		"+"18. factorialOf"+"		"+"28. extractLeftHalf"+"			"+"38. isPronicNumum");
		System.out.println("9. isTechNumber"+"		"+"19. isStrong"+"		"+"29. isDuckNum"+"				"+"39. isUglyNum");
		System.out.println("10.hcf"+"			"+"20. isFibonacci"+"		"+"30. isHappyNum"+"				"+"40. isCoPrime");
		System.out.println("======================================================================================================================================");
		System.out.println("Enter serial number to do the respective operations: ");
	}


	public static int 
		userInput()
		{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		return n;
		}
}
