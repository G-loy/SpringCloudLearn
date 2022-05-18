package cn.itcast.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author: create by Pengkun Gu on Mac
 * @version: v1.0
 * @description cn.itcast.order.config
 * @date 2022/5/18 9:06 AM
 */
public class DefaultFeignConfiguration {
    @Bean
    public Logger.Level logLevel(){
        return Logger.Level.BASIC;
    }
}
