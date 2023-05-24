package io.library.librarymanager.members;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Member {
    @Id
    private String m_id;
    private String name;

    public Member(){}

    public Member(String m_id, String name) {
        this.m_id = m_id;
        this.name = name;
    }

    public String getM_id() {
        return m_id;
    }

    public void setM_id(String m_id) {
        this.m_id = m_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
