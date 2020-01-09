import java.util.*;
import java.io.*;
import java.io.IOException;
import java.util.LinkedList;
import java.sql.*;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

class Algom {
  public static void main(String[] args) throws IOException, InterruptedException{

//LinkedList oluşturma ve verileri linkedlist e kaydetme - Başlangıç
    List<String> al =new LinkedList<>();
    Scanner scanner = null;

    try {
        scanner = new Scanner(new File("/home/ilayda/Algo/names.txt"));
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

    while (scanner.hasNextLine()) {
        String satir = scanner.nextLine();
        al.add(satir);
    }
//LinkedList oluşturma ve verileri linkedlist e kaydetme - Bitiş

//zaman başlangıç
    long lStartTime = System.nanoTime();

//Ali yi aradığımız kısım
   int index = al.indexOf(args[0]);

//zaman bitiş
    long lEndTime = System.nanoTime();
//zaman sonuç
    float nanoSec = (lEndTime - lStartTime);

    System.out.println("Elapsed time in second: " + nanoSec);
    System.out.println("index: " + index);


//////////////////////////////////////////////////////////




//SetData oluşturma ve verileri SetDataya kaydetme - Başlangıç
     Set<String> hash_Set = new HashSet<String>();

    try {
        scanner = new Scanner(new File("/home/ilayda/Algo/isimler.txt"));
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

    while (scanner.hasNextLine()) {
        String satir = scanner.nextLine();
        hash_Set.add(satir);
    }
//SetData oluşturma ve verileri SetDataya kaydetme - Bitiş

//zaman başlangıç
    long StartTime = System.nanoTime();

//Ali yi aradığımız kısım
     hash_Set.contains(args[0]);

//zaman bitiş
    long EndTime = System.nanoTime();
//zaman sonuç
    float miliSec = (EndTime - StartTime);
    System.out.println("Elapsed2 time in second: " + miliSec);


  }
}
