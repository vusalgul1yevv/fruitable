package com.example.fruitables.dtos.coupon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CouponUpdateDto {
    private String code;
    private Double discount;
    private Integer usageLimit;
    private int usageCount;
    private boolean active;
    private LocalDateTime expiryDate;
}
