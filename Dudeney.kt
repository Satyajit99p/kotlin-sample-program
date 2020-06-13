fun main()
{
	println("enter the number")
	val x=Integer.valueOf(readLine())
	var y=x
	var d=0
	var sum=0
	while(y>0)
		{
			d=y%10
			sum=sum+d
			y=y/10
		}
	println(sum)
	var z=Math.pow(sum.toDouble(),3.0)
	println(z)
	if(z.toInt() == x)
		println("dudeney number")
	else
		println("not dudeney number")
		
}
