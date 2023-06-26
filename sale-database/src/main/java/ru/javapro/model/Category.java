package ru.javapro.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@Getter
@Setter
@Table(name = "categories")
public class Category {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "description")
    private String description;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @CreationTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "adverts")
//    private Advert adverts;
}
