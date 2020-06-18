fun main()
{
	
	var ar=arrayOf<Int>(23,34,1,0,65,6,7,11)
	for (i in (0..(ar.size)-1))
		for (j in (0..i))
			{
				if(ar[i] < ar[j])
					{
						var t=ar[i]
						ar[i]=ar[j]
						ar[j]=t
					}
			}
	for(a in 0..ar.size-1)
		{
			println(ar[a])
		}
	println("enter the value to search")
	var x=Integer.valueOf(readLine())
	var p=ar.size-1
	var f=0
	var l=p
	for(k in 0..p)
		{
	        var m1=f+(l-f)/3
	        var m2=l-(l-f)/3
			if(ar[m1] == x)
				{
					println("the value is at "+m1)
					break
				}
			else if(ar[m2] == x)
				{
					println("the value is at "+m2)
					break
				}
			else if(x<ar[m1])
				{
					l=m1-1
				}
			else if(x>ar[m1] && x<ar[m2] )
				{
					f=m1+1
					l=m2-1
				}
			else if(x>m2)
				{
					f=m2+1
				}
			else
				{
					println("no such value")
					break
				}
		}
	
}