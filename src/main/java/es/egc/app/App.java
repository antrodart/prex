package es.egc.app;


/**
 * Hello world!
 *
 */
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.*; 
public class App 
{

    static Logger log=Logger.getLogger(App.class); 
    

    

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
	List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

	myList
    		.stream()
   		 .filter(s -> s.startsWith("c"))
   		 .map(String::toUpperCase)
    		.sorted()
    		.forEach(System.out::println);

    }

    static int getVal(){
	log.info("Returning 1");
	return 1;
    }
    
}
