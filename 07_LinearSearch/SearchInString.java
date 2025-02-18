
public class SearchInString {

  public static void main(String[] args) {

    // String[] arr = {"Hello", "World", "Java", "Programming", "Language"};
    String name = "Hello World";
    char target = 'r';

    System.out.println(search(name, target));
  }

  static boolean search(String str, char target) {
    if (str.length() == 0) {
      return false;
    }

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        return true;
      }
    }
    return false;
  }
  
}