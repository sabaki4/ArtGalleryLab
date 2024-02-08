public class Artwork {

    private String title;
    private Artist artist;
    private int price;

    public Artwork(String inputTitle, Artist inputArtist, int inputPrice){
        this.title = inputTitle;
        this.artist = inputArtist;
        this.price = inputPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
