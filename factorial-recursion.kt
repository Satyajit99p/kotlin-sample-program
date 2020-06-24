fun main()
{
	println("enter a number")
	var x=Integer.valueOf(readLine())
	val fact=factorial (x)
	print(fact)
}
fun factorial(y:Int):Int
{
	if(y == 1)
		return y
	else
		return y*factorial(y-1)
}
