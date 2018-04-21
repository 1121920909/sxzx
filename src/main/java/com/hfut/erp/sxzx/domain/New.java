package com.hfut.erp.sxzx.domain;

import org.springframework.context.annotation.Bean;

import java.sql.Date;

/**
 * @author ZYP
 */
public class New {
  private int id;
  private String title;
  private String author;
  private Date time;
  private String content;

  @Override
  public String toString() {
    return "New{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", time=" + time +
            ", content='" + content + '\'' +
            '}';
  }

  public New() {
  }

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

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
