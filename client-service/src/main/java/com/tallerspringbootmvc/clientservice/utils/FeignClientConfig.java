package com.tallerspringbootmvc.clientservice.utils;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(value = "com.tallerspringbootmvc.clientservice.utils")
public class FeignClientConfig {
}
