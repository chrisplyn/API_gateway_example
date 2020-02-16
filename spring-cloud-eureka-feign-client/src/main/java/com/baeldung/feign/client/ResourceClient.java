package com.baeldung.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@FeignClient("resource1")
public interface ResourceClient {
    @RequestMapping(method = RequestMethod.POST, value = "/foos")
    @ResponseBody
    public Foo create(@RequestBody final Foo foo);
}
