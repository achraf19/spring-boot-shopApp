package HF.Project.ShopApp.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import HF.Project.ShopApp.Model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long>{

}
