package designPattern.creationalDesignPattern.PrototypeDesignPattern.assignment.PrototypeEffectiveInvoiceGeneration;

import designPattern.creationalDesignPattern.PrototypeDesignPattern.assignment.PrototypeCloningTesting.ClonableObject;

public class Invoice implements ClonableObject {
    private Long invoiceId;
    private String customerName;
    private Double amount;
    private String paymentMethod;
    private InvoiceType type;

    public Invoice(Long invoiceId, String customerName, Double amount, String paymentMethod, InvoiceType type) {
        this.invoiceId = invoiceId;
        this.customerName = customerName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.type = type;
    }

    public Invoice(Invoice invoice) {
        this.invoiceId = invoice.getInvoiceId();
        this.customerName = invoice.getCustomerName();
        this.amount = invoice.getAmount();
        this.paymentMethod = invoice.getPaymentMethod();
        this.type = invoice.getType();
    }

    public Invoice cloneObject() {
        return new Invoice(this);
    }

    public Long getInvoiceId() {
        return invoiceId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public InvoiceType getType() {
        return type;
    }
}
