# Kotlin MovieLens

## init

[Spring initializer](https://start.spring.io/#!type=gradle-project-kotlin&language=kotlin&platformVersion=3.2.4&packaging=jar&jvmVersion=17&groupId=com.example&artifactId=demo&name=demo&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.demo&dependencies=data-r2dbc,postgresql,webflux,testcontainers)

```shell
docker run --rm -ePOSTGRES_PASSWORD=postgres -p5432:5432 --name movielens-postgres postgres:15-alpine
```