package com.stefanini.examen.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Permitir todas las rutas con CORS desde http://localhost:4200
        registry.addMapping("/api/**")  // Aplica a todas las rutas que empiecen con /api/
                .allowedOrigins("http://localhost:4200")  // Permitir solicitudes solo desde el frontend en localhost:4200
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Métodos permitidos
                .allowedHeaders("*")  // Permitir todos los encabezados
                .allowCredentials(true);  // Permitir credenciales (si es necesario)
    }
}
