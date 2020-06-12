//to sort a array of numbers in ascending order using bubble sort algorith.

fun main()
{
	var ar=arrayOf<Int>(11,22,13,43,25,6)
	for (i in (0..(ar.size)-1))
		for (j in (0..i-1))
			{
				if(ar[i] < ar[j])
					{
						var t=ar[i]
						ar[i]=ar[j]
						ar[j]=t
					}
			}
	println("sorted array is ")	
	for (k in 0..ar.size)
			println(ar[k])
}
