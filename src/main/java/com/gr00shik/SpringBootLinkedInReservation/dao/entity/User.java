package com.gr00shik.SpringBootLinkedInReservation.dao.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "fname")
    private String fname;
    @Column(name = "sname")
    private String sname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getF_name() {
        return fname;
    }

    public void setF_name(String f_name) {
        this.fname = f_name;
    }

    public String getS_name() {
        return sname;
    }

    public void setS_name(String s_name) {
        this.sname = s_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return new EqualsBuilder()
                .append(id, user.id)
                .append(fname, user.fname)
                .append(sname, user.sname)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(fname)
                .append(sname)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("fname", fname)
                .append("sname", sname)
                .toString();
    }
}
