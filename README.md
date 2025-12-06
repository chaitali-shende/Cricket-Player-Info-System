# 🏏 Cricket Player Info System — Spring Core Project

This project demonstrates how to load external configuration using
@Value, @PropertySource, and Spring Dependency Injection.

---

# 📌 Features

Loads player details from player.properties

Uses Spring Core

Model + Config + Service Architecture

Includes manual validation

Clean, modular package structure

---

# 📁 Technologies Used

Java 8+

Spring Core

Maven

Git & GitHub

---

# 📂 Project Structure

src/main/java
 └── com.cricket
      
      ├── config
      
      │     ├── AppConfig.java
      
      │     └── PlayerConfig.java
      │
      ├── model
      
      │     └── Player.java
      │
      ├── service
      
      │     └── PlayerService.java
      │
      └── main
      
            └── PlayerApp.java

src/main/resources

 └── player.properties

 ---

 # ⚙️ player.properties

player.id=1

player.name=Rohit

player.yearsNumber=45

team.name=MI

---

# 📦 Output

Player Information:

Player ID      : 45

Player Name    : Rohit

Years Number   : 45

Team Name      : MI

