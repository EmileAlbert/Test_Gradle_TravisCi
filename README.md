# Test_Gradle_TravisCi

How to configure travis test with Gradle 

 - Gradle project with intellij - JDK 1.8 - Create empty file (test and java)
 - Push on github
 - Add .travis.yml 
   
   language: java
   jdk:
       - oraclejdk8
       
 - Warning authorisation : 
   
   git update-index --chmod=+x gradlew
   
   check your permissions using:
   git ls-tree HEAD

   Fix it by setting the executable flag on your gradlew file changing it to 755:
   git update-index --chmod=+x gradlew
   
   git commit -m "permission access for travis"
   
   git ls-tree HEAD
   You can see:
   
   100755 blob xxxxxxxxxxxxx   gradlew --> OK
