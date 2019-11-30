package com.shunya.demoopenfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "reqres", url = "https://reqres.in")
public interface SampleClient {

    @RequestMapping(method = RequestMethod.GET, value = "/api/users/2")
    ServiceResponse getUser();
}
