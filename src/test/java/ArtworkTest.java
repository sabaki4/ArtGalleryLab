import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork painting;
    Artist artist;


    @BeforeEach
    public void setUp(){
        artist = new Artist("Eugene");
        painting = new Artwork("Beaulieu", artist, 1000);
    }

    @Test
    public void canGetTitle(){
        assertThat(painting.getTitle()).isEqualTo("Beaulieu");
    }

    @Test
    public void canGetArtist(){
        assertThat(painting.getArtist()).isEqualTo(artist);
    }

    @Test
    public void canGetPrice(){
        assertThat(painting.getPrice()).isEqualTo(1000);
    }

    @Test
    public void canSetTitle(){
        painting.setTitle("Jalais Hill");
        assertThat(painting.getTitle()).isEqualTo("Jalais Hill");
    }

    @Test
    public void canSetArtist(){
        Artist artist1 = new Artist("Freida");
        painting.setArtist(artist1);
        assertThat(painting.getArtist()).isEqualTo(artist1);
    }

    @Test
    public void canSetPrice(){
        painting.setPrice(1500);
        assertThat(painting.getPrice()).isEqualTo(1500);
    }
}
