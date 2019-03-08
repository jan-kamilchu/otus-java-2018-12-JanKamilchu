import static com.google.common.base.Objects.equal;

public class UseGuava {
    public static void main(String... args){
      String s1 = "str1";
      String s2 = "str1";
      if (equal(s1, s2)){
          System.out.println("Same string");
      }
    }
}
