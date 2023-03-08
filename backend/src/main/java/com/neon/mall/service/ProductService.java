package com.neon.mall.service;

import com.github.pagehelper.PageInfo;
import com.neon.mall.model.pojo.Category;
import com.neon.mall.model.pojo.Product;
import com.neon.mall.model.request.AddCategoryReq;
import com.neon.mall.model.request.AddProductReq;
import com.neon.mall.model.request.ProductListReq;
import com.neon.mall.model.vo.CategoryVO;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * 描述：     商品Service
 */
public interface ProductService {

    void add(AddProductReq addProductReq);

    void update(Product updateProduct);

    void delete(Integer id);

    void batchUpdateSellStatus(Integer[] ids, Integer sellStatus);

    PageInfo listForAdmin(Integer pageNum, Integer pageSize);

    Product detail(Integer id);

    PageInfo list(ProductListReq productListReq);

    void addProductByExcel(File destFile) throws IOException;
}
