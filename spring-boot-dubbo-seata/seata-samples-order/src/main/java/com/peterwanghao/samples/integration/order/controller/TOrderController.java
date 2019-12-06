package com.peterwanghao.samples.integration.order.controller;

import com.peterwanghao.samples.integration.common.dto.OrderDTO;
import com.peterwanghao.samples.integration.common.response.ObjectResponse;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peterwanghao.samples.integration.order.service.ITOrderService;

/**
 * <p>
 *  订单服务
 * </p>
 *
 * @author heshouyou
 * @since 2019-01-13
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class TOrderController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TOrderController.class);


    @Autowired
    private ITOrderService orderService;

    @PostMapping("/create_order")
    ObjectResponse<OrderDTO> createOrder(@RequestBody OrderDTO orderDTO){
        LOGGER.info("请求订单微服务：{}",orderDTO.toString());
        return orderService.createOrder(orderDTO);
    }
}
