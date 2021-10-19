package in.chetana.restapi.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import in.chetana.restapi.model.ProductModel;

@Repository
public interface ProductDAO extends MongoRepository<ProductModel, Long> {

}
