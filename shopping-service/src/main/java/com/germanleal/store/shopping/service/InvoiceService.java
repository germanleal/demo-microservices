package com.germanleal.store.shopping.service;

import java.util.List;

import com.germanleal.store.shopping.entity.Invoice;

public interface InvoiceService {
    public List<Invoice> findInvoiceAll();
    public Invoice createInvoice(Invoice invoice);
    public Invoice updateInvoice(Invoice invoice);
    public Invoice deleteInvoice(Invoice invoice);
    public Invoice getInvoice(Long id);
}