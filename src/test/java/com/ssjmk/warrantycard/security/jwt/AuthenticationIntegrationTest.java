package com.ssjmk.warrantycard.security.jwt;

import com.ssjmk.warrantycard.config.SecurityConfiguration;
import com.ssjmk.warrantycard.config.SecurityJwtConfiguration;
import com.ssjmk.warrantycard.config.WebConfigurer;
import com.ssjmk.warrantycard.management.SecurityMetersService;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import tech.jhipster.config.JHipsterProperties;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = {
        JHipsterProperties.class,
        WebConfigurer.class,
        SecurityConfiguration.class,
        SecurityJwtConfiguration.class,
        SecurityMetersService.class,
        JwtAuthenticationTestUtils.class,
    }
)
public @interface AuthenticationIntegrationTest {
}
