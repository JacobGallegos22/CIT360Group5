import java.util.*;

public class JavaCollections {
  public void listExample(ArrayList<String> invoices, LinkedList<String> invoicesLinked) {
    //Array list more for a simple fast list
    System.out.println("Array List: " + invoices);
    System.out.println("Linked List: " + invoicesLinked);

    //Array List you can only add you can't choose to add in the first or beginning
    invoices.add("phone");
    //Linkedlist you can add in the begging or end
    invoicesLinked.addFirst("phone");


    System.out.println("New Array List: " + invoices);

    //LinkedList I can add more elements first or last, I can even get the first and last. Making it easier to order
    //Items but it is more memory extensive
    System.out.println("New Linked List: " + invoicesLinked);






  }

  private void setExample(LinkedHashSet<String> invoiceNumbers) {
    //Print out invoice numbers
    System.out.println(invoiceNumbers);

    //Check for invoice 10x03
    System.out.println("Do we have invoice 10x03? \n Answer: " + invoiceNumbers.contains("10x03"));


    //How many invoices do we have
    System.out.println("There are " + invoiceNumbers.size() + " invoices");

    //Lets remove the second invoice
    invoiceNumbers.remove("10x02");

    System.out.println("Updated Invoice: " + invoiceNumbers);



  }

  public void mapExample(Map invoices) {
    System.out.println("Invoices: " + invoices);

    //Find a item name based on the invoice
    System.out.println("The item with the invoice of 10x01" + invoices.get("10x01"));

  }

  public void queueExample(Queue<String> invoices) {
    //Queue lets you place objects in order letting you add a queue last in last out
    System.out.println("Invoices left in queue " + invoices.size());
    System.out.println("Invoices waiting to get printed" + invoices);
    String invoice = invoices.remove();
    System.out.println("printing " + invoice + "...");
    System.out.println("Up next: " + invoices.peek());
    System.out.println("Invoices left in queue " + invoices.size());
    System.out.println("Invoices waiting to get printed" + invoices);


  }

  public void treeExample(TreeMap<Integer, String> invoices) {
    //Trees only let you put things in order. I added the treemap in a different order but they came out in order

    System.out.println("Invoices in order: " + invoices);
    System.out.println("Invvoices in descending order" + invoices.descendingMap());



  }
  public void main() {
    //Initialize the class
    //Set my collection types
    LinkedHashSet<String> invoiceNumbers = new LinkedHashSet<>();
    ArrayList<String> itemArrayList = new ArrayList<>();
    LinkedList<String> itemLinkedList = new LinkedList<>();
    Queue<String> invoicesToPrint = new LinkedList<>();
    Map invoices = new HashMap();
    TreeMap<Integer, String> invoicesTree = new TreeMap<>();

    //For loop to make test data
    for (int i = 0; i < 5; i++) {
      invoiceNumbers.add("10x0" + i);
      invoicesToPrint.add("10x0" + i);
    }
    //Adding strings to an array list.
    itemArrayList.add("phone");
    itemArrayList.add("TV");
    itemArrayList.add("computer");
    itemLinkedList.add("phone");
    itemLinkedList.add("TV");
    itemLinkedList.add("computer");

    //add objects to the hash set

    //adding items into the hash map. The first item is the key

    invoices.put("10x01", "Item 1");
    invoices.put("10x02", "Item 2");
    invoices.put("10x03", "Item 3");
    invoices.put("10x04", "Item 4");
    invoices.put("10x05", "Item 5");

    //Adding items to the tree map. This is similar to the map but all items will be ordered automatically
    invoicesTree.put(2, "Item 2");
    invoicesTree.put(1, "Item 1");
    invoicesTree.put(4, "Item 4");
    invoicesTree.put(5, "Item 5");
    invoicesTree.put(3, "Item 3");

    //Print results and
    System.out.println("\n*********************************\n");
    System.out.println("Invoices in a set: \n");
    setExample(invoiceNumbers);
    System.out.println("\n*********************************\n");
    System.out.println("Invoices in a map: \n");
    mapExample(invoices);
    System.out.println("\n*********************************\n");
    System.out.println("Invoices in a list: \n");
    listExample(itemArrayList, itemLinkedList);
    System.out.println("\n*********************************\n");
    System.out.println("Invoices in a queue: \n");
    queueExample(invoicesToPrint);
    System.out.println("\n*********************************\n");
    System.out.println("Invoices in a tree: \n");
    treeExample(invoicesTree);


  }
}
