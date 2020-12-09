public class UncryptMenuAction implements MenuBase {

    public StringCrypter stringCrypter;
    public String string;
    public String namess;


    public UncryptMenuAction(StringCrypter cesar,String s) {
        this.stringCrypter = cesar;
        this.namess=stringCrypter.getname();
        this.string=s;

    }

    @Override
    public String name() {
        return "Расшифрование методом "+namess;
    }

    @Override
    public void active() {
        {


        System.out.println(stringCrypter.uncrypt(string));

    }}}



