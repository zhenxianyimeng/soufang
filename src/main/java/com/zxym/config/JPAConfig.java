package com.zxym.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author zjb
 * @date 2018/1/28.
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.zxym.repository")
public class JPAConfig {
}
