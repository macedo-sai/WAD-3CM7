SRC: Contiene el código fuente de los servlets y estructura de la webapp sobre la cual se trabajó durante la práctica.

SRC--
    --Practica3: Carpeta del proyecto de la practica
            --Src:Contiene los archivos fuente de la aplicación web.
                  --main: Contiene los recursos para la página web.
                        --java: Contiene nuestros archivos *.java
                            --puntos:Paquete con los puntos desarrollados en la práctica.
                                --FiltroIP: Filtro de la práctica.
                                
                   --resources: Contiene los archivos multimedia o recursos de la app. (vacía)
                   --webapp:Contiene nuestra aplicación web raíz.
                                            ---WEB-INF: Carpeta de información de nuestra app.
                                                --web.xml --Contenedor de la estructura de nuestra página web
		-                                       --index.jsp--Página princilal tipo Java Server Page

            --target: Contiene todos los archivos generados por nuestro IDE para correr la aplicación.

            --pom.xml: Archivo de configuración que contiene las dependencias Maven del proyecto.
Compilamos mediante nuestra herramienta Eclipse  ya configurada con  Jetty para dar soporte interno a Tomcat.
