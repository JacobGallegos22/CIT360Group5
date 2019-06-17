public class JUnitCalculations {
  String[] names = {"John", "Bob", "Sally", null};



  int multiplyNumbers(int value1, int value2) {
    int result = value1 * value2;

    return result;

  }

  String getNames(Integer index) {
    return this.names[index];
  }

  Boolean isGreaterThan(int value1, int value2) {

    return value1 > value2;
  }




}
