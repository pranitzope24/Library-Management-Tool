package io.library.librarymanager.transactions;

import io.library.librarymanager.books.Book;
import io.library.librarymanager.members.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class Transaction {
    @Id
    private String t_id;
    private LocalDateTime issue;
    private LocalDateTime ret;
    @ManyToOne
    private Book book;
    @ManyToOne
    private Member member;

    public Transaction(){}

    public Transaction(String t_id, LocalDateTime issue, LocalDateTime ret, Book book, Member member) {
        this.t_id = t_id;
        this.issue = issue;
        this.ret = ret;
        this.book = book;
        this.member = member;
    }

    public String getT_id() {
        return t_id;
    }

    public void setT_id(String t_id) {
        this.t_id = t_id;
    }

    public LocalDateTime getIssue() {
        return issue;
    }

    public void setIssue(LocalDateTime issue) {
        this.issue = issue;
    }

    public LocalDateTime getRet() {
        return ret;
    }

    public void setRet(LocalDateTime ret) {
        this.ret = ret;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
