package com.frexdel.billing.dao;

import com.frexdel.billing.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice,String> {
}
