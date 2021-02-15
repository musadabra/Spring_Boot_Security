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


# On Authentication Success Hander Implementation

```
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
```


## Configure Data Source Properties
```
server.port=8088

spring.jpa.hibernate.ddl-auto=none
spring.datasource.url=jdbc:mysql://localhost:3306/earning_spring_security?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC

spring.datasource.username=root
spring.datasource.password=
```
