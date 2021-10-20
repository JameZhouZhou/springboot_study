package com.cuit.springboot.controller;

import com.cuit.springboot.entities.Bill;
import com.cuit.springboot.mapper.BillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 *
 *       使用Mybatis配置文件版
 */

@RestController
public class BillController {

    @Autowired
    BillMapper billMapper;

    @GetMapping("/bill/{bid}")
    public Bill getBill(@PathVariable("bid")Integer bid){
        Bill bill= billMapper.getBillByBid(bid);
        return bill;
    }

    @GetMapping("/bill")
    public Bill addBill(Bill bill){
        int i = billMapper.addBill(bill);
        return bill;
    }


}
