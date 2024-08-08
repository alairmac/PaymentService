package dev.alair.paymentservice.controllers;

import com.razorpay.RazorpayException;
import dev.alair.paymentservice.dtos.GeneratePaymentLinkRequestDto;
import dev.alair.paymentservice.services.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private PaymentService paymentService;
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @PostMapping()
    public String generatePaymentLink(@RequestBody GeneratePaymentLinkRequestDto requestDto) throws RazorpayException {
        return  paymentService.generatePaymentLink(requestDto.getOrderId());
    }
    @PostMapping("/webhook")
    public void handleWebHookEvent(@RequestBody Object event){
        System.out.println("Webhook event: ");

    }
}
