package com.restjava.restjava.zippopotamus;

import com.restjava.restjava.request.CheckZipReq;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ZipCheck {

  @GetMapping("/zipcheck/{country}/{zip}")
  private CheckZipReq getZipData(@PathVariable("country") String country, @PathVariable("zip") String zip) {
    String uri = "https://api.zippopotam.us/"+country+"/"+zip;

    RestTemplate restTemplate = new RestTemplate();
    CheckZipReq result = restTemplate.getForObject(uri, CheckZipReq.class);
    return result;
  }
}
