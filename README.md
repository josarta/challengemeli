
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]



<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/othneildrew/Best-README-Template">
    <img src="images/QuasarFireCarrier-SWR.png" alt="Quasar" width="80" height="80">
  </a>

  <h3 align="center">Operación Fuego de Quasar 🚀</h3>

  <p align="center">
    Empezando con la API RES!
    <br />
    <a href="https://github.com/josarta/challengemeli" target="_blank"><strong>Ver los documentos »</strong></a>
    <br />
    <br />
    <a href="https://mellich.azurewebsites.net/swagger-ui.html" target="_blank">Swagger</a>
    ·
    <a href="https://github.com/josarta/challengemeli" target="_blank">Test Api</a>
    ·
    <a href="https://github.com/josarta/challengemeli" target="_blank">Report Bug</a>
  </p>
</p>



<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table de contenidos</summary>
  <ol>
    <li>
      <a href="#Vision General">Vision General </a>
      <ul>
        <li><a href="#Desafío">Desafío 🧑‍💻</a></li>
      </ul>
    </li>
    <li>
      <a href="#Empezando">Empezando</a>
      <ul>
        <li><a href="#Tecnología y otras bibliotecas de código abierto">Tecnología y otras bibliotecas de código abierto ‍🔧</a></li>
        <li><a href="Herramientas y servicios externos">Herramientas y servicios externos 📌 </a></li>  
        <li><a href="#Instalación">Instalación 💿</a></li>
      </ul>
    </li>
    <li><a href="#Ejecutando las pruebas">Ejecutando las pruebas📑</a></li>
    <li><a href="#Versionado">Versionado 🔥</a></li>
    <li><a href="#Despliegue">Despliegue ✔️</a></li>    
    <li><a href="#CI/CU">CI/CD ⚙️</a></li>
    <li><a href="#The End">The End 🖇️💪</a></li>
    <li><a href="#Autor">Autor 😎</a></li>
    <li><a href="#Licencia">Licencia 📄</a></li>
    <li><a href="#Expresiones de Gratitud ">Expresiones de Gratitud  🙏 </a></li>
    <li><a href="#Extras">Extras ⭐ ⭐ ⭐ ⭐ ⭐ </a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## Vision General

![Product Name Screen Shot][product-screenshot]

Esta Api es mi solución plantea  al prueba Operación Fuego de Quasar, del cual relaciono su enunciado. 


* Han Solo ha sido recientemente nombrado General de la Alianza Rebelde y busca dar un gran golpe contra el Imperio Galáctico para reavivar la llama de la resistencia.
* El servicio de inteligencia rebelde ha detectado un llamado de auxilio de una nave porta carga imperial a la deriva en un campo de asteroides. El manifiesto de la nave es ultra clasificado, pero se rumorea que transporta raciones y armamento para una legión entera.


### Desafío 😵‍💫

Como jefe de comunicaciones rebelde, tu misión es crear un programa en Golang que retorne
la fuente y contenido del mensaje de auxilio. Para esto, cuentas con tres satélites que te
permitirán triangular la posición, ¡pero cuidado! el mensaje puede no llegar completo a cada
satélite debido al campo de asteroides frente a la nave.

Una vez analizado el enunciado 👀,se generon varias hipótesis para solución. 🧙‍♀ 🎰 🎱 🎲 🔮 ✨

* [Algoritmo](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html)  Implementación de el algoritmo Levenberg–Marquardt como solución. 🥇
* [Arquitecturas limpias](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html)  (😅)  Arquitectura Hexagonal Y Mucho de DDD.
* [Swagger](https://swagger.io/) Como parte de la documentacion se expone para prubas funcionales de la API.
* [unit testing](https://www.guru99.com/unit-testing-guide.html) Se realizan solo pruebas unitarias con una cobertura de código esperada del 85% o superior.



<!-- GETTING STARTED -->
## Empezando 📋

El desarrollo se realizó con el IDE intelliJIDEA el proyecto construido con Spring Initializr para spring boot.

### Tecnología y otras bibliotecas de código abierto ‍🔧
Server - Backend

* [JDK ](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)  - Java™ Platform, Standard Edition Development Kit
* [Spring Boot ](https://spring.io/projects/spring-boot)  -  Marco para facilitar el arranque y el desarrollo de nuevas aplicaciones Spring
* [Maven ](https://maven.apache.org/)  - Gestión de dependencias
* [unit testing](https://www.guru99.com/unit-testing-guide.html) Se realizan solo pruebas unitarias con una cobertura de código esperada del 85% o superior.

Libraries and Plugins

* [Swagger](https://swagger.io/) Marco de software de código abierto respaldado por un gran ecosistema de herramientas que ayuda a los desarrolladores a diseñar, construir, documentar y consumir servicios web RESTful.
    * Para agregar una dependencia "Swagger" usando Maven, use lo siguiente:
  ```sh
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger2</artifactId>
            <version>2.9.2</version>
        </dependency>

        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger-ui</artifactId>
            <version>2.9.2</version>
        </dependency>
  ```
* [Algoritmo Levenberg–Marquardt](https://github.com/lemmingapex/trilateration) Conocido como el método de mínimos cuadrados amortiguados ( DLS ), se utiliza para resolver problemas de mínimos cuadrados no lineales.
* Para agregar una dependencia "lemmingapex/trilateration" usando Maven, use lo siguiente:
  ```sh
        <dependency>
            <groupId>com.lemmingapex.trilateration</groupId>
            <artifactId>trilateration</artifactId>
            <version>1.0.2</version>
        </dependency>
  ```


### Herramientas y servicios externos 📌
* [Postman ](https://www.postman.com/)  - Entorno de desarrollo de API (documentación de prueba)

### Instalación
#### Ejecutando la aplicación con IDE
Aquí hay varias formas de ejecutar una aplicación Spring Boot en su máquina local. Una forma es ejecutar el método principal en la clase com.meli.challenge.ChallengeApplication desde su IDE.

1. Descarga el zip o clona el repositorio de Git.
2. Descomprime el archivo zip (si descargaste uno).
3. Abra el símbolo del sistema y cambie el directorio (cd) a la carpeta que contiene pom.xml.
4. Abra Eclipse. (IDE)
    1. File -> Import -> Existing Maven Project -> Navega a la carpeta donde descomprimiste el zip
    2. Seleccione el proyecto
5. Elija el archivo de la aplicación Spring Boot (Buscar for @SpringBootApplication)
6. Haga clic derecho en el archivo y ejecutar como aplicación Java.
#### Ejecutando la aplicación con Maven
Alternativamente, puede usar el [complemento Spring Boot Maven ](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins.html#build-tool-plugins-maven-plugin/) así:
```sh
$ git clone https://github.com/Spring-Boot-Framework/Spring-Boot-Application-Template.git
$ cd Challenge-Application
$ mvn spring-boot:run
  ```
#### Ejecutando la aplicación con el ejecutable JAR
El código también se puede construir en un jar y luego ejecutar / ejecutar. Una vez que el jar está construido, ejecútelo haciendo doble clic en él o usando el comando
 ```sh
  $ git clone https://github.com/josarta/challengemeli.git
  $ cd Challenge-Application
  $ mvn package -DskipTests
  $ java -jar target/Challenge-0.0.1-SNAPSHOT.jar --spring.profiles.active=test
   ```


<!-- USAGE EXAMPLES -->
## Ejecutando las pruebas

Ejemplos de cómo se puede utilizar un proyecto. Capturas de pantalla, Ejemplos de código y las demostraciones adicionales.

Ingrese a la API usando `Swagger`
   ```JS
    http://localhost:8080/swagger-ui.html
   ```

![Product Name Screen Shot][all-screenshot]

Vista general de la documentación

### Responde a :
 ```JS
   func GetMessage(messages ...[]string) (msg string)  
 ```


![Product Name Screen Shot][message-controller]

Objeto  getMessageRequest `*(body) getMessageRequest`
   ```JS
   {
    "messages":[
        ["este", "", "", "mensaje", ""],
        ["", "es", "", "", "secreto"],
        ["este", "", "un", "", ""]
    ]
}
   ```
Requerida en el Nivel 1 del Challenge

### Responde a :
 ```JS
    // input: distancia al emisor tal cual se recibe en cada satélite
    // output: las coordenadas ‘x’ e ‘y’ del emisor del mensaje
    func GetLocation(distances ...float32) (x, y float32)

```


![Product Name Screen Shot][ship-controller]

Objeto  getMessageRequest `*(body) getShipRequest`
   ```JS
  {
    "coordinates":[
        {
            "name":"sato",
            "distance" : 142.7
        }, {
            "name":"skywalker",
            "distance" : 115.5
        },{
            "name":"kenobi",
            "distance" : 100.0
        }
    ]
}
   ```
Requerida en el Nivel 1 del Challenge

### Responde a :
 ```JS
    Crear una API REST, hostear esa API en un cloud computing libre (Google App Engine,
    Amazon AWS, etc), crear el servicio /topsecret/ en donde se pueda obtener la ubicación de
    la nave y el mensaje que emite.
```


![Product Name Screen Shot][satellite-controller]

Objeto  getMessageRequest `*(body) getSharedRequest /topsecret`
   ```JS
  {
    "satellites": [
        {
            "name": "kenobi",
            "distance": 150.0,
            "message": ["este", "", "", "oki", ""]
        },{
            "name": "skywalker",
            "distance": 115.5,
            "message": ["", "es", "", "", "secreto"]
        },{
            "name": "sato",
            "distance": 142.7,
            "message": ["este", "", "un", "", ""]
        }
    ]
}

   ```
Requerida en el Nivel 2 del Challenge


### Responde a :
 ```JS
Crear un nuevo servicio /topsecret_split/ que acepte POST y GET. En el GET la
respuesta deberá indicar la posición y el mensaje en caso que sea posible determinarlo y tener
la misma estructura del ejemplo del Nivel 2. Caso contrario, deberá responder un mensaje de
error indicando que no hay suficiente información.

```

![Product Name Screen Shot][satellite-split-controller]

![Product Name Screen Shot][satellite-split-get]

Objeto  getSharedRequest `*(body) getSatelliteResponsee /topsecret_split/{name} `
   ```JS
   {
    "distance": 100.0,
        "message": ["este", "es", "un", "mensaje", "ok"]
}
   ```


![Product Name Screen Shot][satellite-split-post]

Objeto  getSharedRequest `*(body) getSatelliteResponsee /topsecret_split/{name} `
   ```JS
   {
    "distance": 100.0,
        "message": ["este", "es", "un", "mensaje", "ok"]
}
   ```
_Para obtener más ejemplos, consulte la [API Documentacion](http://localhost:8080/swagger-ui.html)_



<!-- ROADMAP -->



## Despliegue

1. Clone el repositorio
   ```sh
   git clone https://github.com/josarta/challengemeli.git
   ```
2. Test servidor local sobre la aplicación.
   ```sh
   java -jar challenge-0.0.1-SNAPSHOT.jar
   ```

![dpSb Name Screen Shot][spring-boot-deploy]

3. Acceder a él con cualquier navegador introduciendo la siguiente dirección:
   ```JS
     http://localhost:8080
   ```
### Azure 🤦‍♂️
## IntelliJ DEA + Docker
Utilize Docker para ejecutar una aplicación en un contenedor con un entorno de ejecución específico. por medio de  Dockerfile para ejecutar una aplicación Java simple en un contenedor con OpenJDK 8. 

```java
        #De la imagen que partimos
        FROM openjdk:8-jre-alpine 
       
        RUN apk add --no-cache tzdata
        ENV TZ='America/Lima'
        RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

        RUN apk --update add fontconfig ttf-dejavu

        #Directorio de trabajo
        WORKDIR /

        RUN mkdir app && chmod 777 app

        COPY target/challenge-0.0.1-SNAPSHOT.jar /app
        WORKDIR /app

        #Exponemos el puerto 8080
        EXPOSE 8080

        #Comando que se ejecutara, una vez ejecutemos el contendor
        CMD ["java","-jar","challenge-0.0.1-SNAPSHOT.jar"]
```

Publicación de mi contenedor en Azure.
![azure Name Screen Shot][azure-container]


## Versionado

En este desafío utilizo Githup por las siguientes razones versionar tu código, aprender y experimentar, contribuir, trabajo en equipo, compatibilidad.

![Git Name Screen Shot][git-photo]

###Ramificaciones en Git 🧨

![Ramas Name Screen Shot][ramas-photo]

En este proyecto integro un flujo de trabajo vasado en ramas de desarrollo y maestras, trabaje dos ramas con el fin de registrar el historial del desafío, la rama master almacena el historial de publicación oficial y la rama desarrollo sirve como rama de integración para fusiones.
Una nueva función es developcicu como rama única, que se envia al repositorio central “develop” para copia de seguridad/colaboración. Sin embargo, en vez de ramificarse de la maestra, estas ramas de función utilizan la de desarrollo como rama primaria.
Estas funciones no interactuan directamente con la maestra, ya cuando todo esta ok, realizo un pullrequest con la master.

![Gitci Name Screen Shot][gitci-photo]

Cada vez que se acepta un pull request realiza una acción de validación e integracion con Docker.

![Gitwf Name Screen Shot][gitwf-photo]


<!-- LICENSE -->
## CI/CD
 1 - Se realizan test y pruebas de forma local de igual forma se crea el contenedor Localmente.

![Dk Name Screen Shot][dk-photo]

 2 - Cada PullRequest se activa una compilación de la imagen de Docker de la API de challenge en Docker Hub

![gh Name Screen Shot][gd-photo]

![Tgh Name Screen Shot][tgd-photo]

 3 - Se publica en Docker hub.
   ```docker
      docker build -t mychallenge.azurecr.io/challenge:latest .
      docker images
      docker run –d –p 8080:3000 mychallenge.azurecr.io/challenge:latest
      docker login mychallenge.azurecr.io
      docker push mychallenge.azurecr.io/challenge:latest 
   ```
 4 - Azure Container Instances / despliegue continuo. `Flujo de trabajo`

![Ol Name Screen Shot][ol-photo]



<!-- CONTRIBUTING -->
## The End

Al final 🖇️💪, espero que haya disfrutado de la aplicación y la haya encontrado útil, como lo hice yo cuando la estaba desarrollando.

1. Fork the Project


<!-- CONTACT -->
## Autor

![Product Name Screen Shot][dv-photo]

Jose Luis Sarta Alvarez ++🍺☕ - [@josarta](https://twitter.com/josarta) - josarta@misena.edu.co

Swagger Api : [https://mellich.azurewebsites.net/swagger-ui.html](https://mellich.azurewebsites.net/swagger-ui.html)


<!-- LICENSE -->
## Licencia 

Este proyecto está bajo la Licencia (josarta) - mira el archivo [LICENSE.md](LICENSE.md) para detalles



## Expresiones de Gratitud 🎁

* Comenta a otros sobre este proyecto 📢
* Invita una cerveza 🍺 o un café ☕ a alguien de tu equipo.
* Da las gracias públicamente 🤓.
* etc.

## Empezando

### Documentación de referencia

Considere las siguientes secciones:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.3/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.3/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.4.3/reference/htmlsingle/#using-boot-devtools)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.4.3/reference/htmlsingle/#boot-features-spring-mvc-template-engines)

### Guías

Las siguientes guías ilustran cómo utilizar algunas funciones de forma concreta:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-url]: https://github.com/josarta/challengemeli/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge
[forks-url]: https://github.com/josarta/challengemeli/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge
[stars-url]: https://github.com/josarta/challengemeli/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-url]: https://github.com/josarta/challengemeli/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/josarta/challengemeli/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]:https://co.linkedin.com/in/josarta
[product-screenshot]: images/screenshot.png
[all-screenshot]: images/Captura.PNG
[message-controller]: images/Captura1.PNG
[satellite-controller]: images/Captura2.PNG
[satellite-split-controller]: images/Captura3.PNG
[satellite-split-get]: images/Captura3-1.PNG
[satellite-split-post]: images/Captura3-2.PNG
[ship-controller]: images/Captura4.PNG
[Models-controller]: images/Modelos.PNG
[dv-photo]: images/dv.jpg
[git-photo]: images/git.PNG
[ramas-photo]: images/git-ramas.PNG
[gitci-photo]: images/gitci.PNG
[gitwf-photo]: images/gitwf.PNG
[spring-boot-deploy]: images/spring-boot-EN-5.jpg
[azure-container]:images/azure-container-registry.png
[dk-photo]:images/dk.png
[ol-photo]:images/OldModel.png
[gd-photo]:images/gdocker.png
[tgd-photo]:images/triggerGh.png
