package com.mingeso.msorders.clients;

import com.mingeso.msorders.configurations.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(value = "ms-request", path = "/api/v1/request", configuration = {FeignClientConfig.class})

public interface CreditRequestFeignClient {

    @PutMapping("/EditStatus/{id}/{state}")
    String editStatus(@PathVariable String state, @PathVariable Long id);
}
