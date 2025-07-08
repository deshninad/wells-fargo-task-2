package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;
    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
    @OneToMany
    private List<Securities> securities;
    @Column(nullable = false)
    private String createdTimestamp;

    protected Portfolio() {

    }

    public Portfolio(Client client, List<Securities> securities, String createdTimestamp) {
        this.client = client;
        this.securities = securities;
        this.createdTimestamp = createdTimestamp;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Securities> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Securities> securities) {
        this.securities = securities;
    }

    public String getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(String createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

}
