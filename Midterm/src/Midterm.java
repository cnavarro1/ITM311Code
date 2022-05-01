
public class Midterm {
  
  static int[] numArray = new int[10];
  static char[] characterArray = new char[10];

  public static void main(String[] args) 
  {
	int num = 11;
	String names = "ITM311KPCN";
	
	for ( int i = 0 ; i <= 9 ; i++ )
	{
	  numArray[i] = num;
	  num++;
	  characterArray[i] = names.charAt(i);
	}
	displayArrays();
  }
	
  static void displayArrays()
  {
	System.out.print("Number Array: ");
	for ( int i = 0 ; i <= 9 ; i++) 
	{
	  System.out.print(numArray[i]+ " ");
	}
	System.out.println("");
	System.out.print("Character Array: ");
	for ( int j = 0 ; j <= 9 ; j++ )
	{  
	  System.out.print(characterArray[j] + " ");
	}
  }
}