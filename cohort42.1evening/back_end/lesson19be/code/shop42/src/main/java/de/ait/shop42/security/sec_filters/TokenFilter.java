package de.ait.shop42.security.sec_filters;


import de.ait.shop42.security.AuthInfo;
import de.ait.shop42.security.sec_services.TokenService;
import io.jsonwebtoken.Claims;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import java.io.IOException;


@Component
@RequiredArgsConstructor

public class TokenFilter extends GenericFilterBean {
    private final TokenService tokenService;

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain)
            throws IOException, ServletException {

       HttpServletRequest request = (HttpServletRequest) servletRequest;

        String authorizationHeader = request.getHeader("Authorization");
        // Bearer aerervegveargaerg
        String token = ( authorizationHeader != null && authorizationHeader.startsWith("Bearer ") ) ? authorizationHeader.substring(7) : null;

        if (token != null && tokenService.validateAccessToken(token)) {

            Claims claims = tokenService.getAccessClaims(token);
            AuthInfo authInfo = tokenService.mapClaimsToAuthInfo(claims);
            authInfo.setAuthenticated(true);
            SecurityContextHolder.getContext().setAuthentication(authInfo);
        }

        filterChain.doFilter(request, servletResponse);
    }
}
