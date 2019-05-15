import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * This is the controller part of the MVC model. THis handles all of the logic. we take data out of the module and manipulate it
 */

public class PersonController {
  private Scanner in = new Scanner(System.in);
  private LinkedList<Person> persons = new LinkedList<>();

  public PersonController() {

  }

  public void addNewPerson(){
    PersonView pv = new PersonView();
    pv.addNewPersonView();
    System.out.println("First Name:");
    String firstName = in.next();
    System.out.println("Last Name:");
    String lastName = in.next();
    Person person = new Person();
    person.setFirstName(firstName);
    person.setLastName(lastName);
    persons.add(person);




  }

  public void deletePerson() {
    persons.remove();
    PersonView pv = new PersonView();
    pv.deletePersonView(persons);

  }

  public void listPersons() {
    PersonView pv =  new PersonView();
    for (Person person:
         persons) {
      pv.listPersonsView(person);



    }

  }

  public void menu() {
    PersonView pv = new PersonView();
    pv.personMenu();

    boolean quit = false;


    int menuItem;

    do {

      System.out.print("Choose an option: ");

      menuItem = in.nextInt();

      switch (menuItem) {

        case 1:

          addNewPerson();
          break;

        case 2:

          deletePerson();
          break;

        case 3:

          listPersons();
          break;

        case 0:

          quit = true;
          pv.exitMessage();

          break;

        default:
          pv.invalidMessage();

      }

    } while (!quit);
  }
}
