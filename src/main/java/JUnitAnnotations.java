import org.junit.jupiter.api.*;
public class JUnitAnnotations {
    //execute before class
    @BeforeAll
    public static void beforeClass() {
        System.out.println("in before class");
    }

    //execute after class
    @AfterAll
    public static void  afterClass() {
        System.out.println("in after class");
    }

    //execute before test
    @BeforeEach
    public void before() {
        System.out.println("in before");
    }

    //execute after test
    @AfterEach
    public void after() {
        System.out.println("in after");
    }

    //test case
    @Test
    public void test() {
        System.out.println("in test");
    }

    //test case ignore and will not execute
    @Disabled
    public void ignoreTest() {
        System.out.println("in ignore test");
    }
}
