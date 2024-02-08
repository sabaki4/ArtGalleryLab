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
}
