package org.verwandlung.voj.web.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.verwandlung.voj.web.util.MyLocaleResolver;

import java.util.Locale;

@Configuration
public class I18nConfig {
    private static Logger logger = LoggerFactory.getLogger(I18nConfig.class);

    @Bean(name = "localeResolver")
    public LocaleResolver localeResolver(){
        logger.info("#####cookieLocaleResolver---create");

        MyLocaleResolver myLocaleResolver = new MyLocaleResolver();
        myLocaleResolver.setDefaultLocale(Locale.US);
        logger.info("#####cookieLocaleResolver: xxx :"+myLocaleResolver.getDefaultLocale());
        return myLocaleResolver;
    }
}
