package com.felipe.eventsystem.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_bloc")
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant start;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant finish;


    @ManyToOne
    @MapsId
    private Activity activity;

    public Bloc(){}

    public Bloc(Integer id, Instant start, Instant finish) {
        this.id = id;
        this.start = start;
        this.finish = finish;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getStart() {
        return start;
    }

    public void setStart(Instant start) {
        this.start = start;
    }

    public Instant getFinish() {
        return finish;
    }

    public void setFinish(Instant finish) {
        this.finish = finish;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bloc bloc = (Bloc) o;

        return Objects.equals(id, bloc.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
