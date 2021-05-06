package com.germanleal.store.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.germanleal.store.shopping.entity.InvoiceItem;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {

}
