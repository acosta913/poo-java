
import java.util.ArrayList;
import java.util.Vector;

import figure_abstract.logic.Circle;
import figure_abstract.logic.Figure;
import figure_abstract.logic.Triangle;
import figure_abstract.presentation.OuputFigureOptions;
import figure_interface.logic.Table;
import figure_interface.presentation.OuputInterfaceOptions;
import inheritance_account.presentation.MovementsAccount;
import inheritance_reader.presentation.ActionReaderOption;
import invert_string.InvertString;
import manage_conatct_list.presentation.ContactsOption;
import manage_conatct_list_catalog.presentation.ContactsOptionCatalog;
import manage_store.presentation.StoreOption;
import polymorphism_initerfaces.principal.Operations;
import random_numbers.RandomNumber;
import school_grades.presentation.GradesOption;
import school_grades_lamda.presentation.GradesOptionLamda;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // RandomNumber randomNumber = new RandomNumber();
        // randomNumber.random_number();

        // InvertString invertString = new InvertString();
        // invertString.invert_string();

        // GradesOption gradesOption = new GradesOption();
        // gradesOption.optionGrades();

        ContactsOption contactsOption = new ContactsOption();
        contactsOption.conctactsOption();

        // StoreOption storeOption = new StoreOption();
        // storeOption.storeOptions();

        // ContactsOptionCatalog contactsOptionCatalog = new ContactsOptionCatalog();
        // contactsOptionCatalog.conctactsOption();

        // ActionReaderOption actionReaderOption = new ActionReaderOption();
        // actionReaderOption.readerOption();

        // MovementsAccount movementsAccount = new MovementsAccount();
        // movementsAccount.movementsAccount();

        // OuputFigureOptions ouputFigureOptions = new OuputFigureOptions();
        // ouputFigureOptions.showFigure(new Triangle("Morado", 4, 8));
        // ouputFigureOptions.showFigure(new Circle("Azul", 3));

        // OuputInterfaceOptions ouputInterfaceOptions = new OuputInterfaceOptions();
        // ouputInterfaceOptions.showOject(new figure_interface.logic.Circle("Rojo",
        // 8));
        // ouputInterfaceOptions.showOject(new Table(8, 6));

        // Operations operations = new Operations();
        // ArrayList<Integer> list1 = new ArrayList<Integer>();
        // list1.add(1);
        // list1.add(2);
        // list1.add(3);
        // list1.add(4);
        // list1.add(5);
        // list1.add(6);
        // Vector<Integer> list2 = new Vector<Integer>();
        // list2.add(10);
        // list2.add(11);
        // list2.add(12);
        // list2.add(13);
        // System.out.println(operations.filterPairs(list1));
        // System.out.println(operations.filterPairs(list2));

        // GradesOptionLamda gradesOptionLamda = new GradesOptionLamda();
        // gradesOptionLamda.optionGrades();
    }

}
