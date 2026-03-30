# AI Resume Tailoring Agent

## 📌 Option Chosen

**Option 2 — AI Resume Tailoring Agent**

---

## 🤔 Why I Chose This Option

I chose this option because it demonstrates my ability to work with real-world data processing, integrate AI models, and solve a practical problem — improving resumes for job applications. It also allowed me to explore local LLM integration using Ollama.

---

## 📌 Overview

This project is an AI-powered Resume Tailoring Agent that customizes a candidate's resume based on a specific job role. It analyzes the input resume and rewrites it to better match job requirements, making it more effective and ATS-friendly.

---

## 🚀 Features

* Reads resume input from a file
* Cleans and processes resume data
* Uses AI (Ollama) to tailor resume content
* Optimizes resume for specific job roles
* Generates structured and improved resume output

---

## 🛠️ Tech Stack

* Java
* Ollama (Local LLM)
* HTTP API Integration
* File Handling (Java I/O)

---

## ⚙️ Setup Instructions

### 1. Clone the repository

```
git clone https://github.com/Koushik-1713/AI-Resume-Tailoring-Agent.git
```

### 2. Install Ollama

Download and install from: https://ollama.com

---

### 3. Pull required model

```
ollama pull llama3
```

---

### 4. Run Ollama (background)

Ollama runs automatically in background after installation.
(Optional test):

```
curl http://localhost:11434
```

---

### 5. Open project in IntelliJ / any IDE

---

### 6. Add input file

Place your resume inside:

```
data/Candidate_resume.txt
```

---

### 7. Run the project

Run:

```
Main.java
```

---

## 🧠 Approach & Key Decisions

* Used **Ollama (local LLM)** instead of cloud APIs to avoid API costs and ensure privacy
* Implemented **prompt engineering** to generate targeted resume output
* Reduced input size for faster execution
* Designed modular structure (`AIService`, `ResumeTailor`, `JsonReader`)

---

## ⚠️ Assumptions

* Resume file is properly formatted
* Ollama is installed and running locally
* Model (`llama3`) is available
* User provides correct file path

---

## 🔧 Improvements (Future Work)

* Add GUI interface for better usability
* Support multiple job descriptions automatically
* Improve resume formatting (PDF generation)
* Use advanced LLMs for higher accuracy
* Add keyword matching for ATS optimization

---

## 📂 Input Files

* Resume file (`Candidate_resume.txt`)

---

## 📈 Output

* AI-generated tailored resume based on job role

---

## 🎥 Demo Video

(Add your video link here)

---

## 🔐 Environment Variables

Create a `.env.example` file:

```
OLLAMA_URL=http://localhost:11434
OLLAMA_MODEL=llama3
```

---

## 👨‍💻 Author

Koushik

