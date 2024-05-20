import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class AccountTest {

    private String name;
    private boolean result;

    public AccountTest(String name, boolean result) {
        this.name = name;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getNameData() {
        return new Object[][]{
                {"aa", false},
                {"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", false},
                {" aaaaaa", false},
                {"aaaaaa ", false},
                {"aa aa aa", false},
                {"aaa aaa", true}
        };
    }

    @Test
    public void accountTest() {
        Account account = new Account(name);
        assertThat(account.checkNameToEmboss(), CoreMatchers.equalTo(result));
    }


}
