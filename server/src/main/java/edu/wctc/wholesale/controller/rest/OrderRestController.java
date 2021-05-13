package edu.wctc.wholesale.controller.rest;

import edu.wctc.wholesale.dto.OrderDTO;
import edu.wctc.wholesale.entity.WholesaleOrder;
import edu.wctc.wholesale.repos.WholesaleOrderRepository;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderRestController {
    @Autowired
    private WholesaleOrderRepository wholesaleOrderRepository ;

    private OrderDTO convert(WholesaleOrder order){
        OrderDTO dto = new OrderDTO();
        dto.setCustomerName(order.getCustomer().getName());
        dto.setDate(order.getPurchaseDate());
        dto.setPoNumber(order.getPurchaseOrderNum());
        dto.setProductName(order.getProduct().getName());
        dto.setShipped(order.getShippedDate());
        dto.setTerms(order.getProduct().getName());
        dto.setTotal(order.getProduct().getCost());
        return dto;
    }

    @GetMapping("/api/orders")
    @CrossOrigin(origins = "http://Localhost:63342")
    public List <OrderDTO> getOrders(){
        Iterable<WholesaleOrder> orderList = wholesaleOrderRepository.findAll();
        List<OrderDTO> dtoList = new ArrayList<>();
        for (WholesaleOrder order : orderList){
            dtoList.add(convert(order));
        }

        return dtoList;
    }
}
