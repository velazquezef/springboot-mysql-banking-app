package com.asic.javaguide.banking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name= Account.NAME_DB_ACCOUNT)
@Entity
public class Account {

    public static final String NAME_DB_ACCOUNT = "accounts";
    public static final String COLUMN_ACCOUNT_HOLDER_NAME = "account_holder_name";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = COLUMN_ACCOUNT_HOLDER_NAME)
    private String accountHolderName;
    private double balance;
}
