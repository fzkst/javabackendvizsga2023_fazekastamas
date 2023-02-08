package varnavizsga.jjbvizsga.feladat4;

import varnavizsga.jjbvizsga.feladat2.Book;
import varnavizsga.jjbvizsga.feladat3.BookManager;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BookReader {
    BookManager konyvek = new BookManager();
    public void readBooksFromFile(String fileName) {
        try{
            FileReader fr = new FileReader(fileName);
            Scanner sc = new Scanner(fr);
            sc.nextLine();
            while (sc.hasNext()){
                String[] data = sc.nextLine().split(";");
                konyvek.addBook(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]), (Integer.parseInt(data[4]) == 1) ? true : false);
            }
        } catch (Exception e){
            System.out.println("A fájl nem található!");
        }
    }

    public int countOnSale() {
        return konyvek.countOnSale();
    }

    public String getCheapest() {
        return konyvek.getCheapest();
    }
}
