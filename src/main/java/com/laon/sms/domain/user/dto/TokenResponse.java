package com.laon.sms.domain.user.dto;

import com.laon.sms.domain.user.entity.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TokenResponse {

    private String token;
    private UserResponse user;

    public TokenResponse(String token, final User user) {
        this.token = token;
        this.user = new UserResponse(user);
    }
}
