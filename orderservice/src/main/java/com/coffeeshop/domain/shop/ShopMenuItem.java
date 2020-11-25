package com.coffeeshop.domain.shop;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
@Table(name = "shop_menu_items")
public class ShopMenuItem {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private ShopMenu menu;

    @NotNull
    private String name;

    private String description;

    private Double price;

    @NotNull
    private ZonedDateTime createdAt;

    @NotNull
    private ZonedDateTime modifiedAt;
}
