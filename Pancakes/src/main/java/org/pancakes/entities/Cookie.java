package org.pancakes.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "cookie", schema = "pancakes")
public class Cookie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cookieID", nullable = false)
    private Integer cookieID;

    @Column(name = "name")
    private String name;
}
