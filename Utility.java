import java.util.Scanner;
class Utility 
{
	public static void main(String[] args) 
	{
	
	}
/////////////////////////////////////////////////////////////////////////////////
	public static boolean isEven(int n)
	{
		if (n%2==0)
		{
			return true;
		}
		return false;
	}
/////////////////////////////////////////////////////////////////////////////////
	public static int countDigits(int n) 
	{
		int count=0;
		while(n!=0)
		{
		count++;
		n/=10;
		}				
		return count;
	}
/////////////////////////////////////////////////////////////////////////////////
	public static int sumDigits(int n)
	{
		int sum=0;
		while(n!=0)
		{
		int digit=n%10;
		sum+=digit;

		n/=10;
		}				
		return sum;
	}
/////////////////////////////////////////////////////////////////////////////////
	public static int productDigits(int n)
	{
		int prod=1;
		while(n!=0)
		{
		int digit=n%10;
		prod*=digit;
		n/=10;
		}				
		return prod;
	}
/////////////////////////////////////////////////////////////////////////////////
	public static int power(int base,int raise)
	{
		int pow=1;
		for (int i=1;i<=raise ;i++ )
		{
			pow*=base;
		}		
		return pow;
	}
/////////////////////////////////////////////////////////////////////////////////
	public static int rotate(int n)
		{
			int div=n;
			int rem=div%10;
			int ct=countDigits(n);
			for (int i=1;i<ct ;i++ )
			{
				rem*=10;
			}
			return rem+n/10;			
		}
/////////////////////////////////////////////////////////////////////////////////
		public static int reverse(int n)
		{
			int rev=0;
			int div=n;
			while(div!=0)
				{
				int rem=div%10;
				rev=rev*10+rem;
				div=div/10;
				}
				return rev;
		}
/////////////////////////////////////////////////////////////////////////////////
	public static boolean isPrime(int n)
		{
			if (n<2)
			{
				return false;
			}
			else
			{
				for (int i=2;i<n ;i++ )
				{
					if (n%i==0)
					{
						return false;
					}
				}
				return true;
			}
		}
/////////////////////////////////////////////////////////////////////////////////
	public static boolean isTechNumber(int n)
	{
		if (isEven(countDigits(n)))
		{
			int num=extractLeftHalf(n)+extractRightHalf(n);
			int sq=num*num;
			if (sq==n)
			{
				return true;
			}
		}
		return false;
	}

/////////////////////////////////////////////////////////////////////////////////
	public static int hcf(int n1, int n2)
	{

		int small=(n1>n2)?n2:n1;
		int i;
		for (i=small;i>0 ;i-- )
		{
			if (n1%i==0 && n2%i==0)
			{
				break;
			}
		}
		return i;
	}
/////////////////////////////////////////////////////////////////////////////////
	public static int lcm(int n1, int n2)
	{
		int large=(n1>n2)?n1:n2;
		while (true)
		{
			if (large%n1==0 && large%n2==0)
			{
				break;
			}
			else;
			{
				large++;
			}
		}
		return large;
	}
/////////////////////////////////////////////////////////////////////////////////
	public static boolean isPalindrome(int n)
	{
		if (reverse(n)==n)
		{
			return true;
		}
		return false;
	}

/////////////////////////////////////////////////////////////////////////////////
	public static boolean isMagicNum(int n)
	{								
		if (sumDigits(n)==1)
		{
			return true;
		}
		else
		{
		while (n>9)
		{
			if (sumDigits(n)==1)
			{
				return true;
			}
			n=sumDigits(n);
		}
		}
		return false;
	}
/////////////////////////////////////////////////////////////////////////////////
	public static boolean isPerfect(int n)
	{
		int sum=0;
		if (n==0)
		{
			return false;
		}
		else
		{
			for (int i=1;i<n;i++)
			{
				if (n%i==0)
				{
					sum+=i;
				}
			}
		}
		if (sum==n)
		{
			return true;
		}
		return false;
	}
/////////////////////////////////////////////////////////////////////////////////
	public static boolean isBuzz(int n)
	{
		if ( (n%7==0) || extract(n)==7 )
		{
			return true;
		}
		return false;
	}
/////////////////////////////////////////////////////////////////////////////////
	public static boolean isArmstrong(int n)
	{
		int pow=1;
		int copy=n;
		int sum=0;
		int count=countDigits(n);
		if (n==0)
		{
			return false;
		}
		while (n!=0)
		{
			int digit=extract(n);
			sum+=power(digit,count);
			n/=10;
		}
		if (sum==copy)
		{
			return true;
		}
			return false;
	}
/////////////////////////////////////////////////////////////////////////////////
	public static boolean isAutomorphic(int n)
	{
		int sq=n*n;
		while (n!=0)
		{
			if (extract(sq)==extract(n))
			{
				sq=sq/10;
				n=n/10;	
			}
			else
			{
				return false;
			}
		}
		return true;
	}
/////////////////////////////////////////////////////////////////////////////////
	public static int factorialOf(int n)
	{
		int fact=1;
		for (int i=1;i<=n ;i++ )
		{
			fact=fact*i;
		}
		return fact;
	}
/////////////////////////////////////////////////////////////////////////////////
	public static boolean isStrong(int n)
	{//special number
		int copy=n;
		int sum=0;
		int factorial=1;
		while (n!=0)
		{
			int extract=extract(n);
			factorial=factorialOf(extract);
			sum=sum+factorial;
			n=n/10;
		}
		if (sum==copy)
		{
			return true;
		}
		return false;
	}
/////////////////////////////////////////////////////////////////////////////////
public static boolean isFibonacci(int n)
	{
	int n1=0;
	int n2=1;
		int sum=0;
		if (n==0)
		{
			return true;
		}
		else
		{
			while (n>sum)
			{
				sum=n1+n2;
				n1=n2;
				n2=sum;
			}
			if (sum==n)
			{
				return true;
			}
		}
		return false;
	}
/////////////////////////////////////////////////////////////////////////////////
	public static boolean CircularPrime(int n)
	{
		int count=countDigits(n);
		while (count!=0)
		{
			if (isPrime(n))
			{
				count--;
				n=rotate(n);
			}
			return false;
		}
		if (count==0)
		{
			return true;
		}
		return false;
	}
/////////////////////////////////////////////////////////////////////////////////
	public static boolean isFibonacciRec(int a,int b,int n)
	{
	//pass values in the format of isFibonacci(0,1, n)
		int c=a+b;
		if (n==c || n==0)
		{ 
		return true;
		}
		else if (c>n)
		{
	   	return false;
		}
			return isFibonacciRec(b,c,n);
	}
/////////////////////////////////////////////////////////////////////////////////
	public static int extract(int n)
	{
		return (n%10);
	}
/////////////////////////////////////////////////////////////////////////////////
public static int extractSingleDigit(int n,int r)
	{
		int noOfZero=1;
		for (int i=1;i<=r ;i++ )
		{
			noOfZero*=10;
		}
		int right=(n%noOfZero)/(noOfZero/10);
		return right;	
	}
/////////////////////////////////////////////////////////////////////////////////	
public static int extractMultiDigitsRight(int n,int r)
	{
	int noOfZero=1;
		for (int i=1;i<=r ;i++ )
		{
			noOfZero*=10;
		}
		int right=n%noOfZero;
		return right;
	}
/////////////////////////////////////////////////////////////////////////////////
public static int extractMultiDigitsLeft(int n,int l)
	{
	int noOfZero=1;
	l=countDigits(n)-l;
	for (int i=1;i<=l ;i++ )
	{
		noOfZero*=10;
	}
	int left=n/noOfZero;
	return left;
	}
/////////////////////////////////////////////////////////////////////////////////
	public static int extractRightHalf(int n)
	{
		int right =0;
		int noOfZero=1;
		if (isEven(countDigits(n)))
		{
			int countBy2=(countDigits(n))/2;
			for (int i=1;i<=countBy2 ;i++ )
			{
				noOfZero*=10;
			}
			right=n%noOfZero;
		}
		return right;
	}
/////////////////////////////////////////////////////////////////////////////////
	public static int extractLeftHalf(int n)
	{
		int left =0;
		int noOfZero=1;
		if (isEven(countDigits(n)))
		{
			int countBy2=(countDigits(n))/2;
			for (int i=1;i<=countBy2 ;i++ )
			{
				noOfZero*=10;
			}
			left=n/noOfZero;
		}
		return left;
	}
/////////////////////////////////////////////////////////////////////////////////
public static boolean isDuckNum(int n)
	{
	int count=countDigits(n);
		while (count!=0)
		{
			if (extract(n)==0)
			{
				return true;
			}
			else
			{
				n/=10;
				count--;
			}
		}
		return false;
	}
/////////////////////////////////////////////////////////////////////////////////
public static boolean isHappyNum(int n)
	{
	int num=n;
	int sum=0;
	while (num>9)
	{
		while (num!=0)
		{
			int d=extract(num);
			sum=sum+d*d;
			num=num/10;
		}
		num=sum;
		sum=0;
	}
	
	if (num==1 )
	{
		return true;
	}
	return false;
	}
/////////////////////////////////////////////////////////////////////////////////
public static boolean isHarshadNum(int n)
	{
		if (n%sumDigits(n)==0)
		{
			return true;
		}
		return false;
	}
/////////////////////////////////////////////////////////////////////////////////
public static boolean isNeonNum(int n)
	{
		if (sumDigits(n*n)==n)
		{
			return true;
		}
		return false;
	}
/////////////////////////////////////////////////////////////////////////////////
public static boolean isSpyNum(int n)
	{
		if ((sumDigits(n)==productDigits(n))&&(n>0))
		{
			return true;
		}
		return false;
	}
/////////////////////////////////////////////////////////////////////////////////
public static boolean isTwinPrime(int x,int y)
	{
		int big=(x>y)?x:y;
		int small=(x>y)?y:x;
		if (isPrime(x) && isPrime(y) &&(big-small<=2) )
		{
			return true;
		}
		return false;
	}
/////////////////////////////////////////////////////////////////////////////////
public static boolean isTwistedPrime(int n)
	{
		if (isPrime(n) && isPrime(reverse(n)))
		{
			return true;
		}
		return false;
	}
/////////////////////////////////////////////////////////////////////////////////
public static boolean isUniqueNum(int n)
	{
	int count=0;
	for (int i=1;i<=countDigits(n) ;i++ )
		{
			for (int j=1;j<=countDigits(n) ;j++ )
			{
				if (extractSingleDigit(n,i)==extractSingleDigit(n,j))
				{
					count++;
					if (count>1)
					{
						return false;
					}
				}
			}
			count=0;
		}
		return true;
	}
/////////////////////////////////////////////////////////////////////////////////
public static boolean isDisariumNum(int n)
	{
		int copy=n;
		int count=countDigits(n);
		int sum=0;
		while (n!=0)
		{
			sum=sum+power(extract(n),count);
			n/=10;
			count--;
		}
		if (sum==copy)
		{
			return true;
		}
		return false;
	}
/////////////////////////////////////////////////////////////////////////////////
public static boolean isPronicNum(int num)
	{
		for (int i=0;i<=num ;i++ )
		{
			if ((i*(i+1))==num)
			{
				return true;
			}
		}
	return false;
	}
/////////////////////////////////////////////////////////////////////////////////
public static boolean isUglyNum(int n)
	{
	while (n !=0)
	{
		if (n%2==0)
		{
			n/=2;
		}
		else if (n%3==0)
		{
			n/=3;
		}
		else if (n%5==0)
		{
			n/=5;
		}
		else break;
	}
	if (n==1)
	{
		return true;
	}
	return false;
	}
/////////////////////////////////////////////////////////////////////////////////
public static boolean isCoPrime(int x,int y)
	{
		if (isPrime(x) && isPrime(y))
		{
			return true;
		}
		return false;
	}
/////////////////////////////////////////////////////////////////////////////////
public static boolean isLeapYear(int n)
	{
		if (n%4==0 && n%100!=0 || n%400==0)
		{
			return true;
		}
		return false;
	}
/////////////////////////////////////////////////////////////////////////////////
public static int squareRootOf(int n)
	{
	int i=0;
	while (true)
	{
		if (i*i==n)
		{
			return i;
		}
		else if (i*i>n)
		{
			break;
		}
		i++;
	}
	return 0;
	}
/////////////////////////////////////////////////////////////////////////////////
public static int cubeRootOf(int n)
	{
	int i=0;
	while (true)
	{
		if (i*i*i==n)
		{
			return i;
		}
		else if (i*i*i>n)
		{
			break;
		}
		i++;
	}
	return 0;
	}
/////////////////////////////////////////////////////////////////////////////////
public static boolean isDudeneyNum(int n)
	{
		if ((n*n*n)==sumDigits(n))
		{
			return true;
		}
		return false;
	}
/////////////////////////////////////////////////////////////////////////////////
public static boolean isBouncyNum(int n)
	{
		boolean inc=false; 
		boolean dec=false;
		while (n!=0)
		{	
			if (extract(n)>extract(n/10))
			{
				inc=true;
			}
			else if  (extract(n)<extract(n/10))
			{
				dec=true;
			}
			n=n/10;
		}
		return ((inc) && (dec));
	}
}
