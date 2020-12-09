import java.util.Scanner;

public class StringCrypter {

    private final SybbolCrypter sybbolCrypter;


    public StringCrypter(SybbolCrypter sybbolCrypter) {
        this.sybbolCrypter = sybbolCrypter;
    }


    public String crypt(String s) {

        char[] chars = new char[s.length()];
        for (int i = 0, n = s.length(); i < n; i++) {
            char ch = s.charAt(i);
            chars[i] = sybbolCrypter.crypt(ch);
        }
        String string = new String(chars);
        return string;
    }

    public String uncrypt(String s) {
        char[] chars = new char[s.length()];
        for (int i = 0, n = s.length(); i < n; i++) {
            char ch = s.charAt(i);
            chars[i] = sybbolCrypter.uncrypt(ch);
        }
        String string = new String(chars);
        return string;
    }


    public String getname() {
        return sybbolCrypter.name();
    }


}
