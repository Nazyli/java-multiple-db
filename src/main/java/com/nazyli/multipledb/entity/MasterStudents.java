package com.nazyli.multipledb.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "students")
public class MasterStudents {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "nim")
    private String nim;

    @Column(name = "prodi")
    private String prodi;

    @Column(name = "address")
    private String address;

}
