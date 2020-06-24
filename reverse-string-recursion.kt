import java.util.Scanner;
fun main(args: Array<String>)
{
	val sc=Scanner(System.`in`)
	print("enter string")
	var x=sc.next()
	println(x.length)
	println(reverse(x))
}
fun reverse(str:String):String
{
	if(str.isEmpty())
		return str
	else
		return reverse(str.substring(1))+str[0]
}
