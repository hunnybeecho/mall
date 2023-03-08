package com.neon.mall.service;

import com.github.pagehelper.PageInfo;
import com.neon.mall.model.request.CreateOrderReq;
import com.neon.mall.model.vo.CartVO;
import com.neon.mall.model.vo.OrderStatisticsVO;
import com.neon.mall.model.vo.OrderVO;
import java.util.Date;
import java.util.List;

/**
 * 描述：     订单Service
 */
public interface OrderService {


    String create(CreateOrderReq createOrderReq);

    OrderVO detail(String orderNo);

    PageInfo listForCustomer(Integer pageNum, Integer pageSize);

    void cancel(String orderNo);

    String qrcode(String orderNo);

    void pay(String orderNo);

    PageInfo listForAdmin(Integer pageNum, Integer pageSize);

    void deliver(String orderNo);

    void finish(String orderNo);

    List<OrderStatisticsVO> statistics(Date startDate, Date endDate);
}
