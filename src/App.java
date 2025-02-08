
import FigureAbstract.logic.Circle;
import FigureAbstract.logic.Figure;
import FigureAbstract.logic.Triangle;
import FigureAbstract.logic.presentation.OuputFigureOptions;
import inheritance_account.presentation.MovementsAccount;
import inheritance_reader.presentation.ActionReaderOption;
import invert_string.InvertString;
import manage_conatct_list.presentation.ContactsOption;
import manage_conatct_list_catalog.presentation.ContactsOptionCatalog;
import manage_store.presentation.StoreOption;
import random_numbers.RandomNumber;
import school_grades.presentation.GradesOption;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // RandomNumber randomNumber = new RandomNumber();
        // randomNumber.random_number();

        // InvertString invertString = new InvertString();
        // invertString.invert_string();

        // GradesOption gradesOption = new GradesOption();
        // gradesOption.optionGrades();

        // ContactsOption contactsOption = new ContactsOption();
        // contactsOption.conctactsOption();

        // StoreOption storeOption = new StoreOption();
        // storeOption.storeOptions();

        // ContactsOptionCatalog contactsOptionCatalog = new ContactsOptionCatalog();
        // contactsOptionCatalog.conctactsOption();

        // ActionReaderOption actionReaderOption = new ActionReaderOption();
        // actionReaderOption.readerOption();

        // MovementsAccount movementsAccount = new MovementsAccount();
        // movementsAccount.movementsAccount();

        OuputFigureOptions ouputFigureOptions = new OuputFigureOptions();
        ouputFigureOptions.showFigure(new Triangle("Morado", 4, 8));
        ouputFigureOptions.showFigure(new Circle("Azul", 3));

    }

}
