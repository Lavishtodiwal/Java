@echo off
set JAVA_HOME=C:\Program Files\Eclipse Adoptium\jdk-8.0.472.8-hotspot
set PATH=%JAVA_HOME%\bin;%PATH%

echo Java version now:
java -version

echo.
echo Running Maven Build...
mvn clean install

pause