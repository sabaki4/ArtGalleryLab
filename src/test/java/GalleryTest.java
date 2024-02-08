import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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

    @Test
    public void canSetName(){
        gallery.setName("Tate");
        assertThat(gallery.getName()).isEqualTo("Tate");
    }

    @Test
    public void canGetTill(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }

    @Test
    public void canSetTill(){
        gallery.setTill(20);
        assertThat(gallery.getTill()).isEqualTo(20);
    }

    @Test
    public void canGetStock(){
        ArrayList<Artwork> expected = new ArrayList<>();
        assertThat(gallery.getStock()).isEqualTo(expected);
    }

    @Test
    public void canSetStock(){
        ArrayList<Artwork> stockList = new ArrayList<>();
        stockList.add(artwork1);
        stockList.add(artwork2);

        gallery.setStock(stockList);
        assertThat(gallery.getStock()).isEqualTo(stockList);
    }

    @Test
    public void canAddArtwork(){
        gallery.addArtwork(artwork1);
        assertThat(gallery.getStock().size()).isEqualTo(1);
    }

}
