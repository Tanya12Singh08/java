//solution using inbuilt String functions
import java.io.*;
class Count_opt{

public static void main(String args[])
throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str=br.readLine();
String ans="";
int i,c,count;
for(i=0;i<str.length();i++)
{
c=str.lastIndexOf(str.charAt(i));
count=c-i+1;
ans+=str.charAt(i)+String.valueOf(count);
i=c;
}
System.out.println(ans);
}
}