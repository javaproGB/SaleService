package ru.javapro.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@Getter
@Setter
@Table(name = "adverts")
public class Advert {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "title")
    private String title;

    @Column(name = "photo")
    private String photo;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "sale")
    private BigDecimal sale;

    @Column(name = "final_price")
    private BigDecimal final_price;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @CreationTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User usersAdverts;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "adverts_fk_1", referencedColumnName = "id")
////    @MapsId
//    private Category categories;
}
