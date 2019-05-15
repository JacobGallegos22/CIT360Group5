import java.util.LinkedList;
import java.util.Scanner;

/**
 * This is the view part of the MVC model. Notice how there is no logic going on in this class just views
 */

public class PersonView {



  public PersonView(){



  }



  public void personMenu() {
    // print menu

    System.out.println("Please Select an option\n");
    System.out.println("1 - Add a new person");
    System.out.println("2 - Delete a person");
    System.out.println("3 -  See a list of persons");
    System.out.println("0 -  Quit");



  }

  public void addNewPersonView(){
    System.out.println("**********************");
    System.out.println("Add a new person");
  }

  public void deletePersonView(LinkedList<Person> persons) {
    System.out.println("**********************");
    System.out.println("Deletes the last person you added: ");
    System.out.println(persons);

  }

  public void listPersonsView(Person person) {
    System.out.println("First Name: " + person.getFirstName() + " Last Name: " + person.getLastName());



  }
  public void exitMessage() {
    System.out.println("See you later!");
  }
  public void invalidMessage() {
    System.out.println("Invalid choice.");

  }

}
