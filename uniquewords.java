public class uniquewords{
static void print uniquewords(Strings str)
{
int Count;
String [] words = str.split("\\s");
for(int i=0; i<words.length;i++)
{
  Count = 1;
for(int j=i+1; j<words.length;j++)
{
    if (words[i].equalsIgnorecase(words[j]))
   {
    Count ++;
    words[j]=" "; 
   }
   if (Count==1 && Words[i]!=" " )
   System.out.println(words[i]);
}
}
public static void main(String[] args)
 {
  String str ="Hi Hello Hi";
  print Uniquewords(str);
 }
}
