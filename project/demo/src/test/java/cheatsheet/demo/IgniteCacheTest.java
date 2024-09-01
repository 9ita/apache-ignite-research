package cheatsheet.demo;

import org.apache.ignite.client.ClientCache;
import org.apache.ignite.client.IgniteClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class IgniteCacheTest {

    @Autowired
    private IgniteClient ignite;

    @Test
    public void testCachePutAndGet() {
        // Get or create cache
        ClientCache<Long, String> cache = ignite.cache("myCache");

        // Put a value into the cache
        cache.put(1L, "Hello, Docker Ignite!");

        // Retrieve the value from the cache
        String value = cache.get(1L);

        // Validate the value
        assertEquals("Hello, Docker Ignite!", value, "Cached value should be 'Hello, Docker Ignite!'");
    }
}
