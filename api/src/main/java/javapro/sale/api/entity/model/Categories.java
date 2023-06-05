package javapro.sale.api.entity.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "categories")
public class Categories {

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

    @OneToOne(mappedBy = "adverts")
    private Adverts adverts;
}
