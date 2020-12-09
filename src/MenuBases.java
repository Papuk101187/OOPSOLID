public class MenuBases {



    MenuBase[] menuBases = new MenuBase[4];

    public MenuBases(MenuBase encryptcesar,
                     MenuBase encrypthor,
                     MenuBase uncryptcesar,
                     MenuBase uncrypthor) {
        menuBases[0] = encryptcesar;
        menuBases[1] = encrypthor;
        menuBases[2] = uncryptcesar;
        menuBases[3] = uncrypthor;

    }

    public MenuBase getObjects(int index){
        return menuBases[index];
    }


    public void run() {
        int index = 1;

        for (MenuBase menuBase : menuBases) {
            System.out.println(index + ". " + menuBase.name());
            index++;
        }

    }}




