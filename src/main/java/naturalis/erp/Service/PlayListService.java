package naturalis.erp.Service;

import naturalis.erp.Model.Music;
import naturalis.erp.Model.PlayList;
import naturalis.erp.Repository.MusicRepository;
import naturalis.erp.Repository.PlayListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayListService {

    @Autowired
    private PlayListRepository playListRepository;

    @Autowired
    private MusicRepository musicRepository;

    public List<PlayList> getPlayListByUserId(String id){
        List<PlayList> play = new ArrayList<>();
        playListRepository.findByUserId(id).forEach(m -> play.add(m));
        return play;
    }

    public List<PlayList> getPlayListsByMusic(String id){
        List<PlayList> play = new ArrayList<>();
        var music = musicRepository.findById(id);
        System.out.println(playListRepository.findByMusic(music.get().getPlaylistIds()).size());
        playListRepository.findByMusic(music.get().getPlaylistIds()).forEach(musics -> play.add(musics));
        return play;
    }

    public List<PlayList> getAllPlayList(){
        List<PlayList> play = new ArrayList<>();
        playListRepository.findAll().forEach(m -> play.add(m));
        return play;
    }
}
