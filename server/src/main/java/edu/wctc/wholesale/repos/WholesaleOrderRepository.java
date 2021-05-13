package edu.wctc.wholesale.repos;

import edu.wctc.wholesale.entity.Product;
import edu.wctc.wholesale.entity.WholesaleOrder;
import org.springframework.data.repository.CrudRepository;

public interface WholesaleOrderRepository extends CrudRepository<WholesaleOrder, Integer> {
}