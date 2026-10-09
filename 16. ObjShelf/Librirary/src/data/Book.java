/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author LENOVO
 */
public class Book {
    private String id;
    private String author;
    private String name;
    private double price;

    public Book(String id, String author, String name, double price) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void display(){
        System.out.printf("%-8s||%-25s||%-25s||%-8f", id, author, name, price);
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", author=" + author + ", name=" + name + ", price=" + price + '}';
    }
    
}
