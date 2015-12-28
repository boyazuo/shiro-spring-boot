package com.github.boyazuo.spring.boot.autoconfigure;

import org.apache.shiro.mgt.RealmSecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableConfigurationProperties(ShiroProperties.class)
@Import(ShiroManager.class)
public class ShiroAutoConfiguration {
	@Autowired
	private ShiroProperties properties;
	@Autowired
	private RealmSecurityManager securityManager;

	@Bean(name = "shiroFilter")
	public ShiroFilterFactoryBean getShiroFilterFactoryBean() {
		Class<?> relmClass = properties.getRealm();
		securityManager.setRealm((Realm)BeanUtils.instantiate(relmClass));

		ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
		shiroFilter.setSecurityManager(securityManager);
		shiroFilter.setLoginUrl(properties.getLoginUrl());
		shiroFilter.setSuccessUrl(properties.getSuccessUrl());
		shiroFilter.setUnauthorizedUrl(properties.getUnauthorizedUrl());
		shiroFilter.setFilterChainDefinitionMap(properties.getFilterChainDefinitions());
		return shiroFilter;
	}
}
