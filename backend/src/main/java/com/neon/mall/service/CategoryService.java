package com.neon.mall.service;

import com.github.pagehelper.PageInfo;
import com.neon.mall.model.pojo.Category;
import com.neon.mall.model.request.AddCategoryReq;
import com.neon.mall.model.vo.CategoryVO;
import java.util.List;

/**
 * 描述：     分类目录Service
 */
public interface CategoryService {

    void add(AddCategoryReq addCategoryReq);

    void update(Category updateCategory);

    void delete(Integer id);

    PageInfo listForAdmin(Integer pageNum, Integer pageSize);

    List<CategoryVO> listCategoryForCustomer(Integer parentId);
}
