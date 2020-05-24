
//法一：递归（耗时长）
public class solution
{
	public int Fibonacci(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		if(n == 1)
		{
			return 1;
		}
		return Fibonacci(n-1)+Fibonacci(n-2);
	}
}

//法二：借助数组,时间复杂度比递归低，
//因为将数进行了保存，求第n项只需要知道前两项
public class solution
{
	public int Fibonacci(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		if(n == 1)
		{
			return 1;
		}
		int[] arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i = 2;i <= n;i++)
		{
			arr[i] = arr[i-1]+arr[i-2]
		}
		return arr[n];
	}
}

//法三：运用第三个变量，将数字不再保存在数组中，可以降低空间复杂度
public class solution
{
	if(n == 0)
	{
		return 0;
	}
	if(n == 1)
	{
		return 1;
	}
	int f0 = 0;
	int f1 = 1;
	for(int i = 2;i <= n;i++)
	{
		int temp = f1;
		f1 = f0+f1;
		f0 = temp;
	}
	return f1;
}
