package sa.common.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import sa.common.model.TeamView;

@Repository
public interface TeamViewRepository extends ReactiveMongoRepository<TeamView, String> {

    //todo:
    //https://stackoverflow.com/questions/12730370/spring-data-mongodb-findby-method-for-nested-objects
    //need that here to find teamview by member id or username:

}
