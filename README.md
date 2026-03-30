# AI Resume Tailoring Agent

## 📌 Option Chosen

Option 2 — AI Resume Tailoring Agent

---

## 🤔 Why I Chose This Option

I chose this option to demonstrate my ability to integrate AI models with real-world applications. This project solves a practical problem of improving resumes based on job roles.

---

## 📌 Overview

This project reads a candidate’s resume and tailors it using an AI model (Ollama) to match a specific job role like Backend Software Engineer.

---
## 🧩 Architecture

Input → Resume File  
↓  
Text Cleaning & Processing  
↓  
Prompt Generation  
↓  
Ollama API Call (LLM)  
↓  
AI Response Processing  
↓  
Tailored Resume Output

---

## 🚀 Features

* Reads resume from file
* Cleans and processes text
* Uses AI (Ollama) for resume optimization
* Generates tailored resume output

---

## 🛠️ Tech Stack

* Java
* Ollama (Local LLM)
* HTTP API

---

## ⚙️ Setup Instructions

1. Install Java
2. Install Ollama from https://ollama.com
3. Run:

```
ollama run llama3
```

4. Run the project (Main.java)

---

## 🧠 Approach

* Read resume file
* Clean text
* Create prompt
* Send request to Ollama API
* Display AI response

---
## 💡 Key Highlight
This project uses a local LLM (Ollama), which ensures:
- No API cost
- Offline execution
- Data privacy

---


## ⚠️ Assumptions

* Resume file exists
* Ollama is running
* Model is installed

---

## 🔧 Improvements

* Add UI
* Add multiple job roles
* Improve formatting
* Generate PDF output

---

## 🎥 Demo Video

https://drive.google.com/file/d/1rhHhGQQpeuMW7EIJIzSYL4g656LZ2SO4/view?usp=drivesdk

---

## 🔐 Environment Variables (.env.example)

```
OLLAMA_URL=http://localhost:11434
OLLAMA_MODEL=llama3
```

---

## 👨‍💻 Author

Koushik
