package com.example.Ecommerce.feign;

import com.example.Ecommerce.dto.Transacao;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("fastdeldelivery")
public interface DeliveryClient {

    @PostMapping("/entregas/transacao")
    void saveTransaction(Transacao transacao);

}
