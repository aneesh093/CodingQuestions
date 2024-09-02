package Java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
/**
 * 
 * @author Aneesh.Mathai
 */
public class FlatteringListUsingComparator {

	public static void main(String[] args) {

		List<DemoObject> list = Arrays.asList(
				new DemoObject(3, "John", new BigDecimal(10000)),
				new DemoObject(1, "David", new BigDecimal(1000)), 
				new DemoObject(2, "Aneesh", new BigDecimal(50000)));

		List<DemoObject> list2 = Arrays.asList(
				new DemoObject(9, "Aneesh", new BigDecimal(15000)),
				new DemoObject(6, "Amit", new BigDecimal(110000)), 
				new DemoObject(8, "Buvan", new BigDecimal(210000)));

		System.out.println("Sort Using Salary");
		Stream.concat(list.stream(), list2.stream()).sorted(Comparator.comparing(DemoObject::getSalary)).forEach(t -> {
			System.out.println(t.getId() + " " + t.getName() + " " + t.getSalary());
		});

		System.out.println("\nSort Using Salary in reverse Order");
		Stream.concat(list.stream(), list2.stream())
				.sorted(Comparator.comparing(DemoObject::getSalary, Comparator.reverseOrder())).forEach(t -> {
					System.out.println(t.getId() + " " + t.getName() + " " + t.getSalary());
				});

		System.out.println("\nSort Using name and salary");
		Stream.concat(list.stream(), list2.stream())
				.sorted(Comparator.comparing(DemoObject::getName)
				.thenComparing(DemoObject::getSalary)).forEach(t -> {
					System.out.println(t.getId() + " " + t.getName() + " " + t.getSalary());
				});
	}

}
