package naturalis.erp.Repository;

import naturalis.erp.Model.Music;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MusicRepository extends MongoRepository<Music, String> {
}
