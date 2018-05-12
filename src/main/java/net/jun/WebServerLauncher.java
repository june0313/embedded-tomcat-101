package net.jun;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;
import java.io.File;

public class WebServerLauncher {
    public static void main(String[] args) throws ServletException, LifecycleException {
        String webappDirLocation = "webapp/";
        final Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.getConnector().setURIEncoding("UTF-8");
        tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
        tomcat.start();
        tomcat.getServer().await();
    }
}
