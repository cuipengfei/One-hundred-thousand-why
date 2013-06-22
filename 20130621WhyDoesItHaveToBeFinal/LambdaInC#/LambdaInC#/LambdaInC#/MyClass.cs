using System;

namespace LambdaInC
{
	public class MyClass
	{
		public void tryUsingLambda ()
		{
			int number = 123;
			Console.WriteLine (number);

			Action action = () => {
				number = 456;
				Console.WriteLine (number);
			};

			action ();
			Console.WriteLine (number);
		}
	}
}

