package org.example.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="cats")

public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(length = 152, nullable = false)
    private String name;

    @Column(length = 102, nullable = false)
    private String type;

    private int Age;
}
