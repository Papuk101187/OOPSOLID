public class XorSymbolCrypter implements SybbolCrypter {

    final int KEY=5;
    private int token;
    private int count;


    @Override
    public Character crypt(char c) {
        int b = c^KEY;
        char element = (char)b;
        return element;
    }

    @Override
    public Character uncrypt(char c) {
        int b = c^KEY;
        char element2 = (char)b;
        return element2;
    }

    @Override
    public String name() {
        return "хор";
    }



}
