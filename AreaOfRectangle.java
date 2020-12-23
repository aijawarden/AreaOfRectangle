import java.util.Scanner;

public class AreaOfRectangle
{
  public static void main( String[] args )
  {
    Scanner kb = new Scanner( System.in );
    float length;
    float width;
    float area;
    
    System.out.print( "Enter length: " );
    length = kb.nextFloat();
    
    System.out.print( "Enter width: " );
    width = kb.nextFloat();
    
    area = length * width;
    System.out.println( "area = " + area );
  }// main
}//AreaOfRectangle