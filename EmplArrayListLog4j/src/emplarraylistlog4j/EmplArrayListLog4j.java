package emplarraylistlog4j;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class EmplArrayListLog4j {
    
    private static final Logger log = Logger.getLogger(EmplArrayListLog4j.class);

    public static void main(String[] args) {
        Employee emp1 = new Employee(1990, "John");
        Employee emp2 = new Employee(1995, "Mary");
        ArrayList <Employee> eList = new ArrayList<Employee>();
        eList.add(emp1);
//        log.info(emp1.toString());
        eList.add(emp2);
//        log.info(emp2.toString());
        eList.add(new Employee(2000, "Nancy"));
        for (int i = 0; i < eList.size(); i++) {
            System.out.println(eList.get(i).toString());
            log.info(eList.get(i).toString()+" added");
        }
//        log.error("Это сообщение ошибки");
    }
}
