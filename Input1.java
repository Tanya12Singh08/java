//code for entering characters till -1 is entered
import java.io.*;
class Input1{
public static void main(String args[])
throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int ch=br.read();
while(!(ch==-1))
{
System.out.println(ch);
ch=br.read();
}

}
}