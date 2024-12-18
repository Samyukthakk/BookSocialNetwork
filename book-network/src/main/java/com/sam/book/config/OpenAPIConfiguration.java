package com.sam.book.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
      info = @Info  (
              contact = @Contact(
                      name="sam",
                      email="sam@gmail.com",
                      url="http://"
              ),
              description = "open api doc",
              title = "openapi specification" ,
              version = "1.0",
              license = @License(
                      name = "name"
              ),
              termsOfService = "termsofserv"

      ),
      servers = {
              @Server(
                      description = "Local ENV",
                      url = "http:"
              )
      },
      security = {
              @SecurityRequirement(
                      name = "bearerAuth"
              )
      }

)
@SecurityScheme(
        name="bearerAuth",
        description = "JwtAuthDescription",
        scheme= "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat= "JWT",
        in = SecuritySchemeIn.HEADER


)
public class OpenAPIConfiguration {
}
