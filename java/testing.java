public class testing{
    public static void main(String[] args) {
	int fizz=1;
	int buzz=1;
	for(int i=1;i<=60;i++)
	{
		if(fizz==3&&buzz==5){System.out.println("Fizzbuzz!");
			fizz=1;
			buzz=1;
			}
		else if(fizz==3)
		{System.out.println("fizz");
			fizz=1;
			buzz++;
		}
		else if(buzz==5)
		{System.out.println("buzz");
			buzz=1;
			fizz++;
		}
        else
		{System.out.println(i);
		buzz++;
		fizz++;
		}
	}
}
}