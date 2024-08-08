package dev.alair.paymentservice.config;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorpayClientConfig {
    @Value("${razorpay.key.id}")
    private String razorpayApiKey;
    @Value("${razorpay.key.secret}")
    private String razorpayApiSecret;
    @Bean
    public RazorpayClient createRazorpayClient() throws RazorpayException {
        return  new RazorpayClient(razorpayApiKey, razorpayApiSecret);
    }
}
