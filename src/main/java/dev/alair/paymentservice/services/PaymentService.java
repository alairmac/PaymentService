package dev.alair.paymentservice.services;

import com.razorpay.RazorpayException;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    public  String generatePaymentLink(Long orderId) throws RazorpayException;
}
