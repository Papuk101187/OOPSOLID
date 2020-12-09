public class CesarSymbolCrypter implements SybbolCrypter {

    String string;

    @Override
    public Character crypt(char c) {
        return (char) (c + 1);

    }

    @Override
    public Character uncrypt(char c) {
        return (char) (c - 1);
    }

    @Override
    public String name() {
        return "цезаря";
    }

}

