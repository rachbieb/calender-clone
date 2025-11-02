🗓️ Google Calendar Clone
📖 Overview

This project is a high-fidelity full-stack clone of Google Calendar, built to demonstrate responsive UI design, interactive event handling, and backend integration for event storage.
The system allows users to:

Create, edit, and delete events

View events in a clean calendar layout

Persist event data using a backend database

Interact with the app seamlessly with smooth UI transitions

🚀 Features

✅ Monthly, weekly, and daily calendar views

✅ Add, edit, and delete events directly from the UI

✅ Real-time backend sync with Spring Boot APIs

✅ Persistent storage using H2 (can switch to SQLite/MySQL)

✅ RESTful API architecture

✅ Smooth transitions and interactive modals

🏗️ Architecture
🧩 Frontend

Technology: HTML, CSS, JavaScript (vanilla)

The UI closely mimics Google Calendar’s layout and interactions.

Events are fetched and saved via REST API calls using fetch().

Smooth transitions and animations are implemented with CSS transitions and JS DOM updates.

⚙️ Backend

Framework: Spring Boot 3.3.4 (Java 17)

Database: H2 (file-based)

ORM: JPA/Hibernate

API Routes:

GET /api/events → Fetch all events

POST /api/events → Create or update event

DELETE /api/events/{id} → Delete event

💾 Data Model
Field	Type	Description
id	Long	Auto-generated unique ID
title	String	Title of the event
description	String	Optional description
start	String	ISO datetime of event start
end	String	ISO datetime of event end
⚙️ Setup and Run Instructions
🧱 Prerequisites

Java JDK 17+

IntelliJ IDEA

Maven
 (comes with IntelliJ)

Browser (Chrome/Edge recommended)

🪜 Steps to Run

Clone the repository

git clone https://github.com/your-username/calender-clone.git
cd calender-clone


Open in IntelliJ IDEA

Build & Run

Open CalenderCloneApplication.java

Click ▶️ “Run”

Access the App
Open your browser at:
👉 http://localhost:8080


🧠 Business Logic & Edge Cases
💡 Event Management

Events are stored in a persistent database via JPA repository.

Each event has start and end times validated in frontend JS before saving.

⚔️ Edge Cases
Case	Handling
Overlapping events	Events are allowed to overlap (like Google Calendar). A future enhancement may show visual overlap warnings.
Recurring events	Not implemented (to keep MVP simple), but can be added by adding a recurrence field in DB.
Empty title or invalid time	JS prevents saving empty or invalid entries.
🎨 Animations & Interactions
Interaction	Implementation
Event hover effects	CSS transitions
Modal open/close	JavaScript DOM manipulation
Event add/delete	Smooth re-render using JS and fetch() calls

Animations mimic Google Calendar’s UX with fade-in/out and modal transitions.

🔮 Future Enhancements

⏰ Add recurring events (daily/weekly/monthly)

📅 Implement drag-and-drop for event rescheduling

🌈 Add color coding for different event types

👥 Add user authentication and multi-user support

💬 Integrate Google OAuth for login

📲 Make mobile-friendly (responsive layout)

🧑‍💻 Author

Panyam Karthikeya
📧 e22cseu1771@bennett.edu.in
💻 Developed using Java (Spring Boot) and Vanilla JS