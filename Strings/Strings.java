
// import java.util.ArrayList;
import java.lang.String;
import java.util.ArrayList;

// string is basically an object that represents sequence of char values. 
// An array of characters works same as Java string. 
// Java String class provides a lot of methods to perform operations on strings such as compare(), concat(),
// equals(), split(), length(), replace(), compareTo(), intern(), substring() etc
// The java.lang.String class is used to create a string object
// There are two ways to create String object:
// By string literal  , String s="welcome";
// By new keyword,  String s=new String("Welcome");//creates two objects and one reference variable 

class Student {

   String rno;
   int age;

   Student(String r, int i) {
      rno = r;
      age = i;
   }

   void display() {
      System.out.println("age = " + age);
      System.out.println("roll no " + rno);
   }
}

public class Strings {

   public static void main(String[] args) {

      String name = "king";
      String s = new String(name);
      // String num = "123";
      // String nalo = "kohli";

      // working with string methods

      System.out.println(name.compareTo(s));
      System.out.println(name.endsWith("g"));
      System.out.println(name.replace('i', 'I'));
      System.out.println(name.charAt(2));
      System.out.println(name.equals(s));
      System.out.println(name.concat(" king"));
      System.out.println(name.substring(2, 4));

      // initializing objects.
      Student s1 = new Student("028", 20);
      Student s2 = new Student("02", 10);
      Student s3 = new Student("048", 30);

      // creaintg arraylist and adding objects in the list.
      ArrayList<Student> s1list = new ArrayList<Student>();
      s1list.add(s1);
      s1list.add(s2);
      s1list.add(s3);

      for (Student student : s1list) {
         student.display();
      }
   }
}

// string builder, buffer and joiner
