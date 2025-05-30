package com.adyen.giftcard;

import com.adyen.util.HMACValidator;
import org.springframework.context.annotation.Bean;

import nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
    }

    @Bean
    public HMACValidator getHmacValidator() {
        return new HMACValidator();
    }
}
