import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({
        TestJUnit.class,
        TestAssertions.class,
        JUnitAnnotations.class
})

public class JUnitTestSuite {
}
