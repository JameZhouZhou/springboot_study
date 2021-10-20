package com.cuit.springboot.mapper;

import com.cuit.springboot.entities.Bill;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 *
 *   使用Mybatis配置文件版
 */

public interface BillMapper {
    Bill getBillByBid(Integer bid);

    int addBill(Bill bill);
}
