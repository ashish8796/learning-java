package designPattern.creationalDesignPattern.PrototypeDesignPattern.assignment.PrototypeEffectiveInvoiceGeneration;

import java.util.HashMap;

public class InvoiceRegistry implements InvoicePrototypeRegistry{
    private HashMap<InvoiceType, Invoice> hashMap;
    public InvoiceRegistry() {
        this.hashMap = new HashMap<>();
    }

    public void addPrototype(Invoice invoice) {
        hashMap.put(invoice.getType(), invoice);
    }

    public Invoice getPrototype(InvoiceType type) {
        return hashMap.get(type);
    }

    public Invoice clone(InvoiceType type) {
        return hashMap.get(type).cloneObject();
    }
}
