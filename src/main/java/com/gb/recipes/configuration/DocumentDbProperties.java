package com.gb.recipes.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
@ConfigurationProperties(prefix = "azure.cosmosdb")
public class DocumentDbProperties {

    public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	private String uri;

    private String key;

    private String database;
}

