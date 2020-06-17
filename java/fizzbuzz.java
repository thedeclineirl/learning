import java.io.*;

public class fizzbuzz{
    public static void main(String[] args) {
	//setting the limit
	BufferedReader in = 
        new BufferedReader(new InputStreamReader(System.in));  
	String temp ="temp";
    System.out.print("Input the max limit for Fizzbuzz: "); 
    try {temp = in.readLine();}
        catch(Exception e) {
           System.out.println("Caught an exception!"); 
        }
	int limit = Integer.parseInt(temp);;	
	//limit set
	
	int fizz=1;
	int buzz=1;
	for(int i=1;i<=limit;i++)
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