# RecepiApp

## Overview
RecepiApp is a simple Android application that allows users to browse recipes fetched from a public REST API.  
The project demonstrates **modern Android UI**, **network integration**, and **clean UI state handling**.

---

## Tech Stack
- Kotlin
- Jetpack Compose
- MVVM
- Retrofit
- Kotlin Coroutines

---

## Architecture
The app uses **MVVM architecture** to decouple UI from data logic:

- ViewModel manages UI state
- Repository handles API communication
- UI observes state changes using Compose

---

## Features
- Recipe list with navigation between screens
- Remote data fetching with loading and error handling
- Clean and simple Compose UI
- Browse **recipe categories** from API
- Asynchronous API fetching with **Coroutines**  

---

## 📱 Screenshots

| Categories | Category Details 1 | Category Details 2 |
|------------|------------------|------------------|
| ![Categories](https://github.com/user-attachments/assets/e8237572-addd-4601-867d-2a79b0f97ac8) | ![Categorie Details 1](https://github.com/user-attachments/assets/e96c0d00-c7fc-40a5-8ea1-51d11a14dbac) | ![Categories Details 2](https://github.com/user-attachments/assets/2a0e3efc-ea55-4c9c-8e02-029b74798e18) |

---

## 🚀 How to Run
1. Clone the repository:

```bash
git clone https://github.com/PMPedro/RecepiApp.git
