package naturalis.erp.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "musics")
public class Music {

    @Id
    private String id;
    private String name;
    private String artist;
    private List<PlayList> playList;

    public Music(String id, String name, String artist, List<PlayList> playList) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.playList = playList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<PlayList> getPlayList() {
        return playList;
    }

    public void setPlayList(List<PlayList> playList) {
        this.playList = playList;
    }
}
