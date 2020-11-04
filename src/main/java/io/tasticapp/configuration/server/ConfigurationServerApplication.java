package io.tasticapp.configuration.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableAutoConfiguration
@EnableConfigServer
public class ConfigurationServerApplication {
  public static void main(String[] args) {
    SpringApplication.run(ConfigurationServerApplication.class, args);
  }
}
