package com.bahaida.userfront.persistence.domain;

import java.math.BigDecimal;
import java.util.List;

public class PrimaryAccount {

    private Long id;
    private int accountNumber;
    private BigDecimal accountBalance;

    private List<PrimaryTransaction> primaryTransactions;

    public PrimaryAccount() {
    }

    public PrimaryAccount(int accountNumber, BigDecimal accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<PrimaryTransaction> getPrimaryTransactions() {
        return primaryTransactions;
    }

    public void setPrimaryTransactions(List<PrimaryTransaction> primaryTransactions) {
        this.primaryTransactions = primaryTransactions;
    }

    @Override
    public String toString() {
        return "PrimaryAccount{" +
                "id=" + id +
                ", accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
