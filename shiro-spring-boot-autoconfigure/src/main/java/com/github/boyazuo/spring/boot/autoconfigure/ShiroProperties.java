/*
 *    Copyright 2010-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.github.boyazuo.spring.boot.autoconfigure;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties for Shiro.
 *
 * @author Boya
 */
@ConfigurationProperties(prefix = "shiro")
public class ShiroProperties {
	/**
	 * Config file path.
	 */
	private String config;
	private Class<?> realm;
	private String loginUrl;
	private String successUrl;
	private String unauthorizedUrl;
	private Map<String, String> filterChainDefinitions;

	public String getConfig() {
		return config;
	}
	public void setConfig(String config) {
		this.config = config;
	}

	public Class<?> getRealm() {
		return realm;
	}
	public void setRealm(Class<?> realm) {
		this.realm = realm;
	}
	public String getLoginUrl() {
		return loginUrl;
	}
	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}
	public String getSuccessUrl() {
		return successUrl;
	}
	public void setSuccessUrl(String successUrl) {
		this.successUrl = successUrl;
	}
	public String getUnauthorizedUrl() {
		return unauthorizedUrl;
	}
	public void setUnauthorizedUrl(String unauthorizedUrl) {
		this.unauthorizedUrl = unauthorizedUrl;
	}
	public Map<String, String> getFilterChainDefinitions() {
		return filterChainDefinitions;
	}
	public void setFilterChainDefinitions(Map<String, String> filterChainDefinitions) {
		this.filterChainDefinitions = filterChainDefinitions;
	}
	
	
}
