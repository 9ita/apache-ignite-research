package cheatsheet.demo;

import org.apache.ignite.Ignite;
import org.apache.ignite.client.IgniteClient;
import org.apache.ignite.client.ClientConfiguration;
import org.apache.ignite.client.Ignition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IgniteConfig {

    private static final Logger logger = LoggerFactory.getLogger(IgniteConfig.class);

    @Bean
    public IgniteClient igniteInstance() {
        try {
            ClientConfiguration cfg = new ClientConfiguration().setAddresses("127.0.0.1:10800");
            return Ignition.startClient(cfg);
        } catch (Exception e) {
            logger.error("Failed to create IgniteClient", e);
            throw new RuntimeException("Could not create IgniteClient", e);
        }
    }
}