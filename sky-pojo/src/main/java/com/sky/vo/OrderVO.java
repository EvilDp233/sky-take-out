package com.sky.vo;

import com.sky.entity.OrderDetail;
import com.sky.entity.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper=false)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderVO extends Orders {

    //璁㈠崟鑿滃搧淇℃伅
    private String orderDishes;

    //璁㈠崟璇︽儏
    private List<OrderDetail> orderDetailList;

}
