package com.micro.springboot.app.commons.usuarios;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class SpringbootServicioCommonsUsuariosApplication {

	//metodo main eliminado debido a que el proyecto es una libreria

}
