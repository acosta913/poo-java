package inheritance_reader.presentation;

import inheritance_reader.logic.ActionReader;

public class ActionReaderOption {
    public void readerOption() {
        ActionReader actionReader = new ActionReader();
        try {
            System.out.println("Name");
            String name = actionReader.readLine();
            System.out.println("Age");
            int age = actionReader.ReadInt();
            System.out.println("Your name " + name + "Age " + age);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
