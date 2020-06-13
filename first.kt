fun main()
{
	println("enter the number")
	val x=Integer.valueOf(readLine())
	var y=x
	while( y > 9)
		{
			var d=0
			var sum=0
			while(y>0)
				{
					d=y%10
					sum=sum+d
					y=y/10
				}
			y=sum
		}
	if(y==1)
		println("magic number")
	else
		println("not magic number")
		
}