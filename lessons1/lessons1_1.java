/* В консоли запросить имя пользователя.
В зависимости от текущего времени, вывести приветствие вида 
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59 */

package lessons1;

import java.time.*;
import java.util.Scanner;
import java.util.Random;

public class lessons1_1 {
    public static void main(String[] args) {
    /*  System.out.println("hello world"); */
     /*  // дата
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        // позволяет писать и читать на русском
        String encoding = System.getProperty("console.encoding", "cp866");
        //запрос пользователя ввести
        Scanner iScanner = new Scanner(System.in, encoding);
        System.out.print( "Введите имя ");
        String name = iScanner.nextLine();
        System.out.println("привет " + name);
        iScanner.close();
        //Time(name); */
        maxCount(4);
    }
/*     public static void Time(String name) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        if (time.isAfter(LocalTime.of(5,0)) && time.isBefore(LocalTime.of(11,59)))
         System.out.println("доброе утро " + name);
      
        else if (time.isAfter(LocalTime.of(12,0)) && time.isBefore(LocalTime.of(17,59)))
         System.out.println("Добрый день " + name);
        
        else if (time.isAfter(LocalTime.of(18,0)) && time.isBefore(LocalTime.of(22,59)))
         System.out.println("Добрый вечер " + name);
        else 
         System.out.println("Доброй ночи " + name);
        }    */
/*         Дан массив двоичных чисел, например [1,1,0,1,1,1,1],
         вывести максимальное количество подряд идущих 1.
        Найти максимальное количество подряд идущих одинаковых элементов массива. 
        (постараться сделать с одним циклом) */
    public static int[] fillMath() {
        int [] math = new int[10];
        Random rand = new Random();
        for(int i = 0; i < 10; i++)
           { math [i] = rand.nextInt(5);}
        return math;
    }       
    public static void maxCount(int value) {
        int count = 0;
        int maxCount = 0;
        int[] math1 = fillMath();
        for (int i = 0; i <math1.length; i++) {
            if (math1 [i] == value) count++;
            if (math1 [i] != value) count = 0;
            if (count > maxCount) maxCount = count;
        }
        System.out.println(maxCount);
        printMath(math1);
        
    }
    public static void printMath(int[] math) {
        for(int i:math){
            System.out.print(i + " , ");
        }
        
        
    }
    
 


}


