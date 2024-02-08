import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer anna;

    @BeforeEach
    public void setUp(){
        anna = new Customer("Anna", 300);
    }

    @Test
    public void canGetName(){
        String actual = anna.getName();
        assertThat(actual).isEqualTo("Anna");
    }

    @Test
    public void canSetName(){
        anna.setName("Colin");
        assertThat(anna.getName()).isEqualTo("Colin");
    }

    @Test
    public void canGetWallet(){
        assertThat(anna.getWallet()).isEqualTo(300);
    }

    @Test
    public void canSetWallet(){
        anna.setWallet(30);
        assertThat(anna.getWallet()).isEqualTo(30);
    }
}
