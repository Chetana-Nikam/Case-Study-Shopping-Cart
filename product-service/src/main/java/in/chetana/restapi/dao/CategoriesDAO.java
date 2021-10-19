package in.chetana.restapi.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import in.chetana.restapi.model.CategoriesModel;

@Repository
public interface CategoriesDAO extends MongoRepository<CategoriesModel, Long> {

}
