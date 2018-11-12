package com.gb.recipes.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.microsoft.azure.spring.data.cosmosdb.config.AbstractDocumentDbConfiguration;
import com.microsoft.azure.spring.data.cosmosdb.config.DocumentDBConfig;
import com.microsoft.azure.spring.data.cosmosdb.repository.config.EnableDocumentDbRepositories;

@Configuration
@EnableDocumentDbRepositories(basePackages="com.gb.recipes.repository")
@EnableConfigurationProperties(DocumentDbProperties.class)
@PropertySource("classpath:application.properties")
public class RecipeRepositoryConfiguration extends AbstractDocumentDbConfiguration {

    @Autowired
    private DocumentDbProperties properties;

    @Override
    public DocumentDBConfig getConfig() {
        return DocumentDBConfig.builder(properties.getUri(), properties.getKey(), properties.getDatabase()).build();
    }

}
