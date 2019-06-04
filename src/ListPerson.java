public class ListPerson implements Handler {
  @Override
  public void handleIt(Person person) {
    System.out.println("First Name: " + person.getFirstName() + " Last Name: " + person.getLastName());



    }
  }

