package naturalis.erp.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "musics")
public class Music {

    @Id
    private String id;
    private String name;
    private String artist;

    private List<String> playlistIds;

    public Music(String id, String name, String artist, List<String> playlistIds) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.playlistIds = playlistIds;
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

    public List<String> getPlaylistIds() {
        return playlistIds;
    }

    public void setPlaylistIds(List<String> playlistIds) {
        this.playlistIds = playlistIds;
    }
}
