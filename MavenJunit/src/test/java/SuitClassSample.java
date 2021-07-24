import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class SuitClassSample {
	@Test
	public void test() {
		Result rs = JUnitCore.runClasses(MavenJunit.class, MavenJunit2.class);
		System.out.println("Run Count" + rs.getRunCount());
		System.out.println("Failure Count" + rs.getFailureCount());
		System.out.println("Ignore Count" + rs.getIgnoreCount());
		System.out.println("Run Time" + rs.getRunTime());
		// List<Failure> failures = rs.getFailures();
		// for (Failure x : failures) {
		// System.out.println(x.getMessage());
		//
		// }
	}

}
