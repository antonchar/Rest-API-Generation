# Rest-API-Generation

The aim of this little project is to generate a swagger (Open API) specification from the
written code.

To get Open API (Swagger 2.0) specification in JSON format start the server and launch this
command:

`curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/v2/api-docs`

The swagger file describes the RESTful service and can be opened in [Swagger Online Editor](http://editor.swagger.io/#!/): `File > Paste JSON`

![alt tag](https://github.com/antonchar/Rest-API-Generation/blob/master/swagger_editor.png)

### Other possibilities:

It is also possible to generate and save a swagger file during the `test` task.
Additionally, [Swagger2Markup](https://github.com/Swagger2Markup/swagger2markup) library
can be used as a **Swagger** to **AsciiDoc** or **Markdown** converter

### Useful links:

**Springfox:** 
1. [Springfox Reference](https://springfox.github.io/springfox/docs/current/)
2. [Quickly Generate API Docs for Your Spring Boot Application Using Springfox](http://fizzylogic.nl/2015/07/29/quickly-generate-api-docs-for-your-spring-boot-application-using-springfox/)

**Swagger2Markup:**
1. [Swagger2Markup Reference](http://swagger2markup.github.io/swagger2markup/1.3.1/)
2. [Swagger2Markup](https://github.com/Swagger2Markup/swagger2markup)
3. [Swagger2Markup Demo](https://github.com/Swagger2Markup/spring-swagger2markup-demo)
