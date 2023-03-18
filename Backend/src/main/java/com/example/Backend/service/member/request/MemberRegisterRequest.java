package com.example.Backend.service.member.request;

import com.example.Backend.entity.member.Member;
import com.example.Backend.entity.member.MemberProfile;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class MemberRegisterRequest {

    final private String email;
    final private String password;
    final private String city;
    final private String street;
    final private String addressDetail;
    final private String zipcode;

    public Member toMember () {
        return new Member(
                email,
                MemberProfile.of(city, street, addressDetail, zipcode)
        );
    }
}