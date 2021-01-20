package org.verwandlung.voj.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.verwandlung.voj.web.aspect.InterceptorAspect;
import org.verwandlung.voj.web.aspect.RedisAspect;
import org.verwandlung.voj.web.aspect.ViewAspect;

@EnableAspectJAutoProxy
@Configuration
public class AspectConfig {

    @Bean
    public InterceptorAspect interceptorAspect(){
        return new InterceptorAspect();
    }

    @Bean
    public RedisAspect redisAspect(){
        return new RedisAspect();
    }

    @Bean
    public ViewAspect viewAspect(){
        return new ViewAspect();
    }
}
