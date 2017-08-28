/*
 * Application having a Generic HashMap with Empcode as key and EmpName as value.
 * Displaying only EmpNames as output.
 */
package hashMapUsage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// Generic HashMap with Empcode as key and EmpName as value.
		HashMap<Integer, String> employee = new HashMap<Integer, String>();
		// Adding enmpcode and empname  to map
		employee.put(262760, "Sridhar");
		employee.put(345678, "Rakesh");
		employee.put(264593, "Jeevan");
		employee.put(456879, "Ravi");
		employee.put(345671, "Ashish");

		// Traversing Map
		Set set = employee.entrySet(); // Converting to Set so that we can traverse
										
		Iterator iterator = set.iterator();
		System.out.println("Employee Names:");
		while (iterator.hasNext()) {
			// Converting to Map.Entry so that we can get value separately
			Map.Entry m = (Map.Entry) iterator.next();
			System.out.println(m.getValue());
		}

	}

}
