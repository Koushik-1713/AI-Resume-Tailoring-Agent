# 🤖 AI Resume Tailoring Agent



---

## 💡 Why I Chose This Option

I chose this project to demonstrate my ability to integrate **Artificial Intelligence with backend development**.
This solution showcases how AI can automate resume customization for different job roles, improving efficiency and relevance.

---

## 🚀 Project Overview

This application reads a candidate’s resume and tailors it dynamically for a specific job role using an AI model.

The system uses:

* **Java** for backend processing
* **Ollama (Llama3)** as a local Large Language Model (LLM)
* **HTTP API integration** for communication between Java and AI

---

## 🧠 How It Works

```text
Resume Input → Java Application → Ollama (Llama3) → AI Processing → Tailored Resume Output
```

### Workflow:

1. Read resume from input file
2. Accept job role (e.g., Backend Software Engineer)
3. Send prompt to Ollama API
4. AI rewrites resume with relevant skills
5. Output is displayed in clean professional format

---

## 🛠️ Tech Stack

* **Language:** Java
* **AI Model:** Llama3 (via Ollama)
* **API:** Local HTTP API (`http://localhost:11434`)
* **Tools:** IntelliJ IDEA / VS Code

---

## ⚙️ Setup Instructions

### 1️⃣ Install Ollama

Download and install from:
👉 https://ollama.com/download

---

### 2️⃣ Run the AI Model

Open terminal and run:

```bash
ollama run llama3
```

Wait for the model to download (first time only).

---

### 3️⃣ Run Ollama Server (if needed)

```bash
ollama serve
```

---

### 4️⃣ Compile and Run Java Program

```bash
javac *.java
java Main
```

---

## 📁 Project Structure

```text
ResumeAgent/
│
├── src/
│   ├── AIService.java
│   ├── ResumeTailor.java
│
├── data/
│   └── candidate_resume.txt
│
├── .env.example
├── README.md
├── .gitignore
```

---

## 🔐 Environment Variables

This project uses a local AI model (Ollama), so no API key is required.

Example configuration:

```env
OLLAMA_BASE_URL=http://localhost:11434
MODEL=llama3
```

---

## 🧠 Key Design Decisions

* Used **local AI (Ollama)** to avoid API costs and ensure offline capability
* Implemented **prompt engineering** to generate structured resume output
* Used **Java HTTP connections** to integrate AI services
* Applied **text preprocessing** to handle encoding and formatting issues

---

## ⚠️ Assumptions

* Resume is provided in plain text format
* Ollama is installed and running locally
* User provides a valid job role
* Internet is required only for initial model download

---

## 🔧 Challenges Faced

* Handling JSON formatting issues
* Fixing encoding problems (special characters)
* Managing HTTP request/response correctly
* Ensuring AI output is clean and structured

---

## 🚀 Future Improvements

* Add **Frontend UI (Angular/React)**
* Export resume as **PDF**
* Support multiple job roles at once
* Improve formatting with templates
* Add resume upload feature

---

## 🎥 Demo Video

👉 (Add your video link here)

---

## 📦 Output Example

```text
Konduri Koushik

SUMMARY
Backend-focused software developer...

SKILLS
• Java, SQL, APIs

PROJECTS
• ML Stroke Prediction System...

EDUCATION
B.Tech – Computer Science

ACHIEVEMENTS
• Smart India Hackathon 2024
```

---

## 🏆 Conclusion

This project demonstrates a real-world application of AI in automating resume customization.
It highlights backend development skills, API integration, and practical use of LLMs.

---

## 🙌 Author

**Konduri Koushik**
