# Spring_Boot_Security
# SPRING SECURITY

## RESOURCE
baeldung.com/security-spring

https://codenerve.com/spring-security-user-role-redirect/index.html

## Authentication with Spring Security

Spring Security Form Login
Spring Security – Basic Authentication (popular)
Form Login – Error Handling and Localization
Logout
Redirect to Different Pages after Login
Remember Me
Spring Security Authentication Provider
How to Manually Authenticate User with Spring Security
Extra Login Fields with Spring Security
Spring Security Custom AuthenticationFailureHandler
Prevent Brute Force Authentication Attempts with Spring Security
Spring Security Login Page with React

## Configuration for Form Login
```python
loginPage() – the custom login page
loginProcessingUrl() – the URL to submit the username and password to
defaultSuccessUrl() – the landing page after a successful login
failureUrl() – the landing page after an unsuccessful login
logoutUrl() – the custom logout
```python
## On Authentication Success Hander Implementation

```python
@Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {

        Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
        System.out.println(roles);
        if (roles.contains("ROLE_ADMIN")) {
            httpServletResponse.sendRedirect("/admin");
        } else {
            httpServletResponse.sendRedirect("/index");
        }
    }

