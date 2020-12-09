import java.awt.*;
import java.awt.Menu;
import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        StringCrypter cesar = new StringCrypter(new CesarSymbolCrypter());
        StringCrypter hor = new StringCrypter(new XorSymbolCrypter());


        while (true) {
            System.out.println("Введите строку для работы с шифрованием ");
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            MenuBases menuBases = new MenuBases(
                    new EncryptMenuAction(cesar, string),
                    new UncryptMenuAction(cesar, string),
                    new EncryptMenuAction(hor, string),
                    new UncryptMenuAction(hor, string));
            menuBases.run();
            Scanner scanner1 = new Scanner(System.in);
            int indexs = scanner1.nextInt() - 1;
            menuBases.getObjects(indexs).active();
            System.out.println("Main.main");
        }











    }


}









