package com.sql.mysql.connection;

import javax.persistence.*;

@Entity
@Table(name = "LibraryCard")
public class LibraryCard {
    @OneToOne
    @JoinColumn
    User user;
    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;
    @Id
    private int cardNo;
    private int fine;
    private int booksIssued;

    public LibraryCard() {
    }

    public LibraryCard(int cardNo, int fine, int booksIssued) {
        this.cardNo = cardNo;
        this.fine = fine;
        this.booksIssued = booksIssued;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getBooksIssued() {
        return booksIssued;
    }

    public void setBooksIssued(int booksIssued) {
        this.booksIssued = booksIssued;
    }
}
