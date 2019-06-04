import java.util.HashMap;

public class ApplicationController {
  //This will map a command with all of the controllers implementing the handler interface
  private HashMap<String,Handler> handlerMap = new HashMap();

  public void handleRequest(String command, Person person){
    //Map a command to the controller
    handlerMap.put("list", new ListPerson());

    //Get the controller that we need
    Handler handler = handlerMap.get(command);
    //Execute the controller through the interface
    handler.handleIt(person);
  }

}
