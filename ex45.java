import java.util.Scanner;
import java.io.File;
public class Exercise45 {

 public static void main(String[] args) {
  System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
  System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");
 }
}