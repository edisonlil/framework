package com.xiaoaifreamwork.log4j.autoconfigure;
import com.xiaoaifreamwork.logger.LogInterceptor;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

@Configuration
@AutoConfigureOrder(Ordered.LOWEST_PRECEDENCE -10)
public class LoggingAutoConfiguration {
    /**
     * 配置loginterceptor
     * @return
     */
    @Bean
    public LogInterceptor logInterceptor() {
        return new LogInterceptor();
    }
}
