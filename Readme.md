
# Jobfit - Modern Job Portal

Jobfit is a modern job portal designed to connect job seekers with employers effectively. The platform features job search functionality, registration forms for both job seekers and employers, and interactive components with a clean and responsive UI.

## Features

- Home Page: Clean and modern UI with easy navigation
- Job Seeker Registration: A simple form for job seekers to input their details and skills
- Employer Registration: Similar form for employers to register and post job opportunities
- Job Search Page: Dynamic filtering of job listings using JavaScript
- Interactive UI: Real-time job search filtering powered by JavaScript


## Structure

```
├── .idea  
│   ├── .gitignore  
│   ├── compiler.xml  
│   ├── jarRepositories.xml  
│   ├── misc.xml  
│   ├── modules.xml  
│   ├── vcs.xml  
│   └── workspace.xml  
├── apache-tomcat-9.0.98  
│   ├── bin  
│   ├── conf  
│   ├── lib  
│   ├── logs  
│   ├── temp
│   ├── webapps
│   ├── work
│   ├── BUILDING.txt
│   ├── CONTRIBUTING.md
│   ├── LICENSE
│   ├── NOTICE
│   ├── README.md
│   ├── RELEASE-NOTES
│   └── RUNNING.txt
├── src
│   ├── main
│   │   ├── java
│   │   ├── resources
│   │   └── webapp
│   │       ├── WEN-INF
│   │       ├── index.html
│   │       ├── script.js
│   │       ├── searchResults.jsp
│   │       ├── style.css
│   │       └── subscribe.jsp
│   ├── Java project report.pdf
│   └── Java ppt.pdf
├── target
│   ├── classes
│   ├── maven-archiver
│   ├── maven-status
│   ├── test-classes
│   └── web-project-1.0-SNAPSHOT.war
│
├── Final Review.md
├── Readme.md
├── pom.xml
└── web-project.iml

```
## Technology Used

![Logo](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcReLb6hLk5P0qkPAv4gruk0sshrS_V45qHxIQ&s) ![Logo](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6935wo8bLZh5FeafJEffqWKDOpNpx6UE5bg&s)
![Logo](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFfShxyzGCEk3mGJnhLuh1CiYyZqTu2sO6zg&s) ![Logo](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRykqUCa32TIYKkYsVpULbUcDFOeyswAFw_Rg&s)
![Logo](https://static-00.iconduck.com/assets.00/javascript-js-icon-256x256-2o2kq55k.png)

## Run Locally

Clone the project

```bash
  git clone https://github.com/agrawalvanshika/Job-portal-with-skill-assessment/
```

Go to the project directory

```bash
  cd web-project
```

Build the Project

```bash
  mvn clean install
```

Deploy on Tomcat

Copy the web-project-1.0-SNAPSHOT.war file from the target directory to the webapps directory of your local Tomcat server:
```
apache-tomcat-9.0.98
└── webapps
```
Start the Tomcat server by navigating to the apache-tomcat-9.0.98/bin directory and running:

```bash
  ./startup.sh
```
For Windows, use:

```bash
  startup.bat
```

## Documentation

Report file of the project: [Documentation](https://github.com/agrawalvanshika/Job-portal-with-skill-assessment/blob/main/src/main/Java%20project%20report.pdf)

