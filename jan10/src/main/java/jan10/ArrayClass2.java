/**
 * 
 */
package jan10;

/**
 * @author Anirudh
 *
 */
public class ArrayClass2 {

	public static Boolean isPass(int marks)
	{
		return (marks>=60);
	}
	
	public static char grade(int marks)
	{
		if(marks>90)
			return 'A';
		else if(marks>=80)
			return 'B';
		else
			return 'F';
		
	}
	
}
