package naturalis.erp.Repository;

import naturalis.erp.Model.PlayList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PlayListRepository extends MongoRepository<PlayList, String> {

    @Query("{'userId': ObjectId(?0)}")
    List<PlayList> findByUserId(String id);

    @Query("{'_id':{'$in': ?0}}")
    List<PlayList> findByMusic(List<String> playlistsIds);
}
