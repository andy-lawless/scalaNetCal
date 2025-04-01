# scalaNetCal SubnetCalculator

A Scala-based tool to calculate usable IP addresses from a CIDR subnet mask. Built as demo project for learning scala operations and syntax

## Features
- Calculates usable IPs from a CIDR value (e.g., /24 → 254 IPs).
- Interactive: Enter CIDR values repeatedly until you type `exit`.
- Tracks the total number of subnets checked.
- Simple and lightweight, runs via `sbt`.

## Prerequisites
You’ll need these installed:
- **Git**: For cloning the repo.
- **sbt (Scala Build Tool)**: To compile and run the app.
- **JDK (Java Development Kit)**: Required by `sbt` (version 8 or higher).

### Installation Links
- [Git](https://git-scm.com/downloads)
- [sbt](https://www.scala-sbt.org/download.html)
- [JDK](https://www.oracle.com/java/technologies/javase-downloads.html) or [OpenJDK](https://adoptium.net/)

## Setup and Run Instructions

These steps work for **Mac**, **Windows**, and **Linux**.

### 1. Clone the Repository
In a terminal (or command prompt on Windows):
```bash
git clone https://github.com/yourusername/scalaNetCal.git
cd scalaNetCal
```

### 2. Install Git (desktop or CLI), sbt and JDK on your machine
Eensure Git, sbt, and a JDK are installed (skip if already set up). 

#### Git
For Git, on Mac:

```bash 
use brew install git
```
(Homebrew) or download from Git website; 

On Windows download the installer (includes Git Bash); 
On Linux use sudo apt-get install git (Ubuntu/Debian) or your package manager—verify with git --version. 

#### sbt
- For sbt, on Mac:
```bash
run brew install sbt 
```
or download from sbt website; 
- On Windows use the MSI installer from the site or Scoop (scoop install sbt); 

-0n Linux use sudo apt-get install sbt or download manually—verify with sbt --version (e.g., sbt 1.9.x). 

#### JDK
For the JDK, on Mac run:
```bash
brew install openjdk@11 
```
or download from Adoptium; on Windows download from Oracle or Adoptium; 

-on Linux use sudo apt-get install openjdk-11-jdk or your package manager—verify with java -version (e.g., 11.0.x).

