//naive solution
import java.io.*;
class Count{

public static void main(String args[])
throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char ch;
int count[];
count=new int[150];
String str,ans="";
str=br.readLine();
int i;
for(i=0;i<str.length();i++)
{
count[str.charAt(i)]++;
}
int k=0;
for(k=0;k<str.length();k++)
{
ch=str.charAt(k);
if(count[ch]!=0)
{
ans+=ch+String.valueOf(count[ch]);
count[ch]=0;
}
}

System.out.println(ans);
}
}