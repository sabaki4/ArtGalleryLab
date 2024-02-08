import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artist artist1;
    Artist artist2;
    Artwork artwork1;
    Artwork artwork2;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery("Serpentine");
        artist1 = new Artist("Bosch");
        artist2 = new Artist("Van Gogh");
        artwork1 = new Artwork("Heavenly Delights", artist1, 500);
        artwork2 = new Artwork("Flowers", artist2, 700);
    }

    @Test
    public void canGetName(){
        assertThat(gallery.getName()).isEqualTo("Serpentine");
    }
}
