import java.util.Scanner;

public class Word1
{
   public static void main(String[] args)
   {
      String str, word;
      int wordsLen, i, count, j, k;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the String: ");
      str = s.nextLine();
      
      String words[] = str.split(" ");
      wordsLen = words.length;
      
      System.out.println("\n----Occurrences of Each Word----");
      for(i=0; i<wordsLen; i++)
      {
         word = words[i];
         count = 1;
         for(j=(i+1); j<(wordsLen-1); j++)
         {
            if(word.equals(words[j]))
            {
               count++;
               for(k=j; k<(wordsLen-1); k++)
               {
                  words[k] = words[k+1];
               }
               wordsLen--;
               j--;
            }
         }
         System.out.println(word+ " occurs " +count);
         count = 0;
      }
   }
}