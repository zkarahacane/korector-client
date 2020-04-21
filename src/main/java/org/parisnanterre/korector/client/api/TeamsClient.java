package org.parisnanterre.korector.client.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="teams")
public interface TeamsClient {
    @GetMapping("/v1/test")
    String test();
}
