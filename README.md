# AI Resume Tailoring Agent (Java)



## 🚀 Project Overview
This project reads job postings from Excel and JSON files and generates tailored resumes for each job role.

## ⚙️ How It Works
1. Reads job IDs from Excel file
2. Matches job details from JSON file
3. Extracts job information
4. Reads candidate resume
5. Generates tailored resume output

## 🛠️ Technologies Used
- Java
- Apache POI (Excel)
- org.json (JSON)

## ▶️ Setup Instructions
1. Open project in IntelliJ IDEA
2. Add required libraries:
    - Apache POI
    - org.json
3. Place input files inside `/data`
4. Run `Main.java`

## 📁 Input Files
- option2_job_links.xlsx
- option2_jobs.json
- candidate_resume.txt

## 🧠 Approach
- Used modular classes for each task
- Implemented pipeline for data processing
- Focused on clean and simple logic

## ⚠️ Assumptions
- Input files are correctly formatted
- Resume is stored as text file

## 🔮 Future Improvements
- Add OpenAI API for real AI tailoring
- Generate PDF resumes
- Send emails automatically

## 🎥 Demo Video
(Add your video link here)