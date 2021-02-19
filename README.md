# spring-cloud-config-demo

Basic demonstration of spring cloud config (+boot+docker)

* could be tested with a local git repo or a lot of different repository (filesystem, vault, JDBC...) and composite of
  all theses possibilities
* very simple to deploy
* config server could be embedded in the application
* compatible with AWS code commit and Google cloud source out of the box
* security using spring-security
* encryption/descryption to be able to store sensitive data with capabilities to work on encrypted data
  (server provide /encryp and /decrypt endpoints + a CLI)

# Documentation

* Spring blog: https://spring.io/guides/gs/centralized-configuration/
* Reference documentation: https://docs.spring.io/spring-cloud-config/docs/3.0.2/reference/html/

# more to explore

* spring cloud config monitor
* Spring Cloud Netflix and Eureka Service Discovery or Spring Cloud Consul
