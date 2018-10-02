SRC: Contiene el código fuente de los servlets y estructura de la webapp sobre la cual se trabajó durante la práctica.

SRC--

    --Practica2: Carpeta del proyecto de la practica

      -----SRC:  Archivos fuente para la página web
	                Main: Carpeta principal de la página
                        --resources: Contiene los recursos usados para ejecutar los servlets en este caso vacía.
		                            --webapp:Contiene nuestra aplicación web raíz.
                                            ---WEB-INF: Carpeta de información de nuestra app.
                                                --web.xml --Contenedor de la estructura de nuestra página web
		-                                       --index.jsp--Página principal tipo Java Server Page

	--Puntos: Empaquetado(carpeta) con los 4 servlets desarrollados durante la practica
            --Punto 1 :Servlet que despliega Hola Mundo.		    
            --Punto 2 :Servlet que trae los parámetros del encabezado de petición.
		    --Punto 3 :Servlet para verificar el ámbito de una variable en doGet
		    --Punto 4 :Servlet para verificar el ámbito de una variable doGet vs Servlet.

Compilamos mediante nuestra herramienta Eclipse  ya configurada con  Jetty para dar soporte interno a Tomcat.

