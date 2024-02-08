import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {
    Artist artist;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Hannah");
    }

    @Test
    public void canGetName(){
        String actual = artist.getName();
        assertThat(actual).isEqualTo("Hannah");
    }

    @Test
    public void canSetName(){
        artist.setName("Saba");
        String actual = artist.getName();
        assertThat(actual).isEqualTo("Saba");
    }
}
