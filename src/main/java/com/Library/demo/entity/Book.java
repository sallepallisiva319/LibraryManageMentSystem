package com.Library.demo.entity;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// Book Entity Classs
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	@Column
    private String title;
	@Column
    private String tag;
	@Column
    private String authors;
	@Column
    private String publisher;
	@Column
    private String status;
	@Column
    private Date createdate;
	public Book() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public Book(int id, String title, String tag, String authors, String publisher, String status, Date createdate) {
		super();
		this.id = id;
		this.title = title;
		this.tag = tag;
		this.authors = authors;
		this.publisher = publisher;
		this.status = status;
		this.createdate = createdate;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", tag=" + tag + ", authors=" + authors + ", publisher="
				+ publisher + ", status=" + status + ", createdate=" + createdate + "]";
	}
}
