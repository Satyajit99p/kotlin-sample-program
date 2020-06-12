// program to demonstrate selection sort in ascending order for given array.

fun main()
{
	var ar=arrayOf<Int>(11,22,13,43,25,6)
	for (i in (0..(ar.size)-1))
		{
		var m=i	
		var j=i+1
		for (j in ((i+1)..ar.size-1))
			{
				if(ar[m] > ar[j])
					{
						var t=ar[j]
						ar[j]=ar[m]
						ar[m]=t
					}
			}
		}
	println("sorted array is ")	
	for (k in 0..ar.size)
			println(ar[k])
}
