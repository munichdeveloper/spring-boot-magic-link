# spring-boot-magic-link
A Spring Boot boilerplate project which you can use with magic.link

## Setup

1. Create an auth app on [magic.link](https://magic.link) and put your secret key into the _application.properties_ under _magic.api.key_
2. Type in a JWT signing key into the _application.properties_ under _token.signing.key_
3. If you have own _repositories_ and _entities_, add the packages into the annotations _EnableJpaRepositories_ and _EntityScan_ in the class _SpringBootMagicLinkApp_
4. If you want to send / receive events with a kafka receiver, set event.on.userCreated or event.on.userLoggedIn or both to true in _application.properties_
