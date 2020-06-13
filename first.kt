fun main()
{
	println("enter the number")
	val x=Integer.valueOf(readLine())
	var y=x
	var c=0
	var d:Int
	while(y > 0)
		{
			c=c+1
			y=y/10
		}
	println(c)
	var z=x % Math.pow(10.0,c.toDouble()-1)
	println(z)
	var a=(z*z)
	println(a)
	if(x == a.toInt())
		println("automophic number")
	else
		println("not automorphic number")
	
	
}