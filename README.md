EMI Calculator

A Spring Boot based EMI Calculator application that calculates the Equated Monthly Installment (EMI) based on loan amount, annual interest rate, and loan tenure.

---

Live Demo

https://emi-calculator-0vgs.onrender.com

---

GitHub Repository

https://github.com/Harshhh-123/emi-calculator

---

Technologies Used

- Java
- Spring Boot
- Thymeleaf
- HTML
- CSS
- Maven
- Docker
- Render

---

Features

- Calculate Monthly EMI
- User-Friendly Interface
- Responsive Design
- Fast EMI Calculation
- Docker Support
- Cloud Deployment on Render

---

How EMI is Calculated

EMI is calculated using the standard formula:

EMI = P × R × (1 + R)^N / ((1 + R)^N - 1)

Where:

- P = Principal Loan Amount
- R = Monthly Interest Rate
- N = Loan Tenure in Months

---

Project Flow

1. User enters Loan Amount.
2. User enters Interest Rate.
3. User enters Loan Tenure.
4. Application calculates EMI.
5. Result is displayed instantly.

---

Project Structure

emi-calculator

├── src

├── Dockerfile

├── pom.xml

├── README.md

└── screenshots

---

Running the Project Locally

Clone Repository

git clone https://github.com/Harshhh-123/emi-calculator.git

Navigate to Project Directory

cd emi-calculator

Run Application

mvn spring-boot:run

Application will start on:

http://localhost:8080

---

Docker Support

Build Docker Image

docker build -t emi-calculator .

Run Docker Container

docker run -p 8080:8080 emi-calculator

---

Screenshots

Home Page

(Add Screenshot Here)

EMI Result Page

(Add Screenshot Here)

Render Deployment

(Add Screenshot Here)

---

Deployment

The application is successfully deployed on Render and can be accessed through:

https://emi-calculator-0vgs.onrender.com

---

Learning Outcomes

Through this project, I learned:

- Spring Boot Development
- REST API Concepts
- Project Structuring
- Docker Containerization
- Cloud Deployment using Render
- Git and GitHub Workflow

---

Author

Harsh Chavda

Software Developer

GitHub:
https://github.com/Harshhh-123

---

License

This project is developed for educational and internship assignment purposes.
