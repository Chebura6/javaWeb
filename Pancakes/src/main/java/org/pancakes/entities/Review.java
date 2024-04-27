package org.pancakes.entities;


import javax.persistence.*;

@Entity
@Table(name = "review", schema = "pancakes")
public class Review {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reviewid")
    private Integer reviewid;

    @Column(name = "reviewholder")
    private String reviewHolder;
    @Column(name = "review")
    private String review;



    public void setId(Integer id) {
        this.reviewid = id;
    }

    public Integer getId() {
        return reviewid;
    }
}
