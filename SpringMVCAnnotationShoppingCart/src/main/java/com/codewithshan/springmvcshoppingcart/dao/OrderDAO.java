package com.codewithshan.springmvcshoppingcart.dao;

import java.util.List;

import com.codewithshan.springmvcshoppingcart.model.CartInfo;
import com.codewithshan.springmvcshoppingcart.model.OrderDetailInfo;
import com.codewithshan.springmvcshoppingcart.model.OrderInfo;
import com.codewithshan.springmvcshoppingcart.model.PaginationResult;
 
public interface OrderDAO {
 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}