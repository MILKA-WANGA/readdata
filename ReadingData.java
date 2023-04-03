import java.io.*;
public class ReadingData
{
    public static void main(String[]args) throws IOException
    {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter roll number:" );
    int rollno=Integer.parseInt(br.readLine());
    System.out.println( "Your roll number is:" + rollno);
    
   }
}