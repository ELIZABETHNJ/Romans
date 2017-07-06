# Romans
import java.io.*;
import java.util.*;
public class Romans
{
  public static void main(String args[])throws IOException
  {  
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
    int result=0;
    System.out.println("Enter the digit");
    String digits=br.readLine( );
    String x=digits.toUpperCase();
  for(int i=digits.length()-1;i>=0;i--)
    {
     
      char a = x.charAt(i);
      
      switch(a)
      {
        case 'I':
        {
          result=result+1;
          break;
        }
        case 'V':
        {
          result=result+5;
          break;
          
        }
        case'X':
        {
          
          result=result+10;
          break;
        }
        case 'L':
        {
          result=result+50;
          break;
        }
        case 'C':
        {
          
          result=result+100;
          break;
        }
        case 'D':
        {
          
          result=result+500;
          break;
        }
        case 'M':
        {
          
          result=result+1000;
          break;
        }
        default:
        {
          result=0;
          break;
        }
      } 
      
      if (x.contains ("IV"))
      {
        result=2-result;
      }
      if (x.contains("IX"))
      {
        result=result-2;
        
      }
      if (x.contains("XL"))
      {
        result=result-2;
        
      }
      if (x.contains("XC"))
      {
        result=result-2;
      }
      if (x.contains("CD"))
      {
        result=result-2;
      }
      if (x.contains("CM"))
      {
        result=result-2;
        
      }
    }  
    System.out.println(result); 
  }
}

