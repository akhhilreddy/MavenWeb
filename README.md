# Maven Web Lab

A small Java web application for practising Jenkins Maven Web Automation.

## Build and test

```bash
mvn clean
mvn install
mvn test
```

Maven packages the application as `target/maven-web-lab.war`.

The application uses the Servlet 4.0 API and is intended for a Tomcat 9.x container.
After deployment with context path `webpath`, open `/webpath/` and `/webpath/hello`.
