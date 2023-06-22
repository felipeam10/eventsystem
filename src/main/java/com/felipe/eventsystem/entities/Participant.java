//package com.felipe.eventsystem.entities;
//
//import jakarta.persistence.*;
//
//import java.util.Objects;
//
//@Entity
//@Table(name = "tb_paticipant")
//public class Participant {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private String name;
//    @Column(unique = true)
//    private String email;
//
//    @ManyToMany
//    @JoinColumn(name = "activities_id")
//    private Activity activities;
//
//    public Activity getActivities() {
//        return activities;
//    }
//
//    public void setActivities(Activity activities) {
//        this.activities = activities;
//    }
//
//    public Participant(){}
//
//    public Participant(Integer id, String name, String email) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Participant that = (Participant) o;
//
//        return Objects.equals(id, that.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return id != null ? id.hashCode() : 0;
//    }
//}