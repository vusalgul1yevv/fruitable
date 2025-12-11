package com.example.fruitables.services.impl;

import com.example.fruitables.dtos.coupon.CouponCreateDto;
import com.example.fruitables.dtos.coupon.CouponDto;
import com.example.fruitables.dtos.coupon.CouponUpdateDto;
import com.example.fruitables.dtos.coupon.CouponCreateDto;
import com.example.fruitables.dtos.coupon.CouponDto;
import com.example.fruitables.dtos.coupon.CouponUpdateDto;
import com.example.fruitables.entities.Coupon;
import com.example.fruitables.repositories.CouponRepository;
import com.example.fruitables.repositories.CouponRepository;
import com.example.fruitables.services.CouponService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CouponServiceImpl implements CouponService {
    private final CouponRepository couponRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<CouponDto> getDashboardCoupons() {
        List<Coupon> coupons = couponRepository.findAll();
        if(!coupons.isEmpty()){
            coupons
                    .stream()
                    .map(coupon ->
                            modelMapper.map(coupon, CouponDto.class));
        }
        return List.of();
    }

    @Override
    public boolean createCoupon(CouponCreateDto couponCreateDto) {
        try {
            Coupon coupon = modelMapper.map(couponCreateDto,Coupon.class);
            couponRepository.save(coupon);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public CouponUpdateDto getUpdatedCoupon(Long id) {
        Coupon coupon =  couponRepository.findById(id).orElse(null);
        if(coupon != null){
            return modelMapper.map(coupon,CouponUpdateDto.class);
        }
        return new CouponUpdateDto();
    }

    @Override
    public boolean updateCoupon(Long id, CouponUpdateDto couponUpdateDto) {
        try {
            Coupon coupon = modelMapper.map(couponUpdateDto,Coupon.class);
            coupon.setId(id);
            couponRepository.save(coupon);
            return true;
        }catch (Exception e){
            return false;
        }

    }
}
