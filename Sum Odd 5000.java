function sumOddFiveThousand() 
{
	var sum = 0;
	for (var i = 1; i < 4999; i=i+2)
	{
		sum = sum + i;
	}
	return sum;
}
