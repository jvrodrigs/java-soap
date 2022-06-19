package naturalis.erp.Service;

import naturalis.erp.Model.Music;
import naturalis.erp.Repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusicService {

    @Autowired
    private MusicRepository musicRepository;

    public List<Music> getAllMusics(){
        List<Music> music = new ArrayList<>();
        musicRepository.findAll().forEach(m -> music.add(m));
        return music;
    }
}
