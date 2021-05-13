package edu.wctc.wholesale.service;

import edu.wctc.wholesale.ResourceNotFoundException;
import edu.wctc.wholesale.entity.WholesaleOrder;

import java.util.List;

public interface WholesaleOrderService {
    List<WholesaleOrder> getAllWholesaleOrder();
}
