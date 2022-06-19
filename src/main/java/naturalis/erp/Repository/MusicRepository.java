package naturalis.erp.Repository;

import naturalis.erp.Model.Music;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MusicRepository extends MongoRepository<Music, String> {

    @Query("{ 'playlistIds': { '$in': [ObjectId(?0)] }}")
    List<Music> findMusicByPlay(String id);
}
