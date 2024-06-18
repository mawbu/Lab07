package com.hutech.webbanhang.service;

import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@Service
public class CustomOAuth2UserService implements OAuth2UserService<OAuth2UserRequest, OAuth2User> {

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        // Tại đây bạn có thể thực hiện logic để lấy thông tin từ OAuth2 provider
        // Ví dụ: Google, Facebook, etc.
        OAuth2UserService delegate = new DefaultOAuth2UserService();
        return delegate.loadUser(userRequest);
    }
}
