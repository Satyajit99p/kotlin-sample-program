fun main()
{
	println("enter the number")
	val x=Integer.valueOf(readLine())
	var y=x*x
	var d=0
	var sum=0
	while(y > 0)
		{
			d=y%10
			sum=sum+d
			y=y/10
		}
		if(sum == x)
		println("neon number")
	else
		println("not neon number")
		
}