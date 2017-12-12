package com.codewithshan.springmvcshoppingcart.dao;

import com.codewithshan.springmvcshoppingcart.entity.Product;
import com.codewithshan.springmvcshoppingcart.model.PaginationResult;
import com.codewithshan.springmvcshoppingcart.model.ProductInfo;
 
public interface ProductDAO {
 
    
    
    public Product findProduct(String code);
    
    public ProductInfo findProductInfo(String code) ;
  
    
    public PaginationResult<ProductInfo> queryProducts(int page,
                       int maxResult, int maxNavigationPage  );
    
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                       int maxNavigationPage, String likeName);
 
    public void save(ProductInfo productInfo);
    
}