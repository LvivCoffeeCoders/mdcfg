import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        BuilderTest.class,
        ProviderTest.class,
        ConversionTest.class
        HookTest.class
})
public class TestSuite {
}
