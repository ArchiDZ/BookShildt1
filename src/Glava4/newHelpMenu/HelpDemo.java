package Glava4.newHelpMenu;

import java.io.IOException;

public class HelpDemo {
    public static void menu4() throws IOException{
        char choice,ignore;
        newHelp helpObject = new newHelp();

        for(;;){
            do{
                helpObject.showmenu();
                choice = (char) System.in.read();
                do{
                    ignore = (char) System.in.read();
                }while(ignore!='\n');
            }while( !helpObject.isValid(choice));
            if(choice=='q')break;
            System.out.println("\n");
            helpObject.helpon(choice);
        }
    }
}
