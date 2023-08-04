import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class stringToDate {
    public static void main(String[] a){

                String str = "The first version was released on 23-01-1996";

                String strPattern = "\\d{2}-\\d{2}-\\d{4}";

                Pattern pattern = Pattern.compile(strPattern);
                Matcher matcher = pattern.matcher(str);

                while( matcher.find() ) {
                    System.out.println( matcher.group() );
                }
            }
        }


