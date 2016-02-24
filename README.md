# shiro-spring-boot


## Properties/Yaml file configuration

```
shiro:
  realm: #realm class
  loginUrl:  #login url
  successUrl: #success url
  unauthorizedUrl: #403 url
  filterChainDefinitions:	#filter chian
    "/login": authc
    "/logout": logout
    "/static/**": anon
    "/**": authc    
```

## Issue Tracking

[GitHub Issues](https://github.com/boyazuo/shiro-spring-boot/issues)

## Maven dependency

```xml
<dependency>
	<groupId>com.github.boyazuo</groupId>
	<artifactId>shiro-spring-boot-starter</artifactId>
	<version>1.0.2</version>
</dependency>
```