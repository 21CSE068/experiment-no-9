import java.util.*;
class ReadFile{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);

       System.out.print("Enter the name of the file: ");
       String filename = obj.nextLine();
       File f = new File(filename);
       int i;
       boolean wrong=true;
       while(wrong)
   {
try{
FileReader finp = new FileReader(f);
LineNumberReader linereader = new LineNumberReader(finp);
while((i=linereader.read())!=-1)
{
   System.out.println("Line :"+(linereader.getLineNumber()+1));
   System.out.println((char)i+linereader.readLine());
}
wrong=false;
 }
catch(FileNotFoundException e){
System.out.println("File does not exist, ");
System.out.print("Enter another file name:");
filename = obj.nextLine();
f = new File(filename);
}
catch(IOException e){
System.out.println("Cannot Read file:");
    }
   } 
  }
}
