# ConnectChat

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

> A real-time chat application for Android, built to showcase modern Android development skills. Seamlessly connect with friends and colleagues through a clean and intuitive interface.

This project is a fully functional, real-time messaging application powered by Firebase. It demonstrates the implementation of a client-server architecture, modern UI with Jetpack Compose, and adherence to best practices like MVVM.

---

## 📸 Screenshots

| Login / Sign Up | Conversations List | Chat Screen |
| :---------------: | :------------------: | :-----------: |
| <!-- I added headers to make your table look more professional! -->
| Login Screen | Home Screen | Chat Screen |
|:------------:|:-----------:|:-----------:|
| <img src="screenshoots/IMG-20251112-WA0024.png" width="250"> | <img src="screenshoots/IMG-20251112-WA0025.png" width="250"> | <img src="screenshoots/IMG-20251112-WA0026.png" width="250"> |
| User Profile | Settings | Search |
|:------------:|:--------:|:------:|
| <img src="screenshoots/IMG-20251112-WA0027.png" width="250"> | <img src="screenshoots/IMG-20251112-WA0028.png" width="250"> | <img src="screenshoots/IMG-20251112-WA0029.png" width="250"> |

---

## ✨ Core Features

- **User Authentication:** Secure user registration and login using Firebase Authentication (Email & Password).
- **Real-time Messaging:** Send and receive messages instantly with other users, powered by Firebase Firestore's real-time listeners.
- **Conversations List:** View a list of all your ongoing chats, sorted by the most recent message.
- **Image Sharing:** Send and receive images in chats, uploaded to and served from Firebase Storage.
- **Push Notifications:** Receive background notifications for new messages using Firebase Cloud Messaging (FCM).
- **Offline Support:** View past messages even when offline, thanks to Firestore's built-in caching and a local Room database.
- **User Profiles:** Simple user profiles with display names and profile pictures.

---

## 💻 Technology & Architecture

This project is built with a 100% Kotlin, modern tech stack and follows the MVVM architecture pattern.

- **UI:** [Jetpack Compose / XML with Material Design 3] - For building a declarative and responsive UI.
- **Language:** [Kotlin]
- **Architecture:** MVVM (Model-View-ViewModel) - To separate business logic from the UI.
- **Backend & Real-time:**
    - **Firebase Firestore:** For the real-time message database.
    - **Firebase Authentication:** For handling user accounts.
    - **Firebase Storage:** For storing user-uploaded images.
    - **Firebase Cloud Messaging (FCM):** For push notifications.
- **Asynchronous:** Kotlin Coroutines & Flow - For managing background tasks and handling data streams.
- **Dependency Injection:** Hilt - To manage dependencies and facilitate testing.
- **Image Loading:** [Coil (for Compose) / Glide (for XML)] - For efficient loading and caching of images.
- **Jetpack Libraries:**
  - **ViewModel:** To store and manage UI-related data.
  - **Navigation Component:** For handling in-app navigation between screens.
  - **Room:** For local data persistence and offline caching.

---

## 🚀 Getting Started

To get a local copy up and running, follow these steps.

### Prerequisites

- Android Studio Iguana | 2023.2.1 or later
- Android SDK 34
- A Firebase account (it's free!)

### Firebase Setup (Required)

This project relies on Firebase. You'll need to create your own Firebase project to run it.

1.  Go to the [Firebase Console](https://console.firebase.google.com/) and create a new project.
2.  Add an Android app to your Firebase project:
    - Use `[com.yourpackage.chatapp]` as the package name (make sure it matches your app's `applicationId` in `build.gradle.kts`).
    - Follow the on-screen steps to download the `google-services.json` file.
3.  **Place the `google-services.json` file** in your project's `app/` directory.
4.  In the Firebase Console, enable the following services:
    - **Authentication:** Go to the `Authentication` tab, click `Sign-in method`, and enable `Email/Password`.
    - **Firestore Database:** Go to the `Firestore` tab and create a database. Start in `test mode` for easy setup (you can add security rules later).
    - **Storage:** Go to the `Storage` tab and create a storage bucket.

### Installation

1.  Clone the repository:
    ```bash
    git clone https://github.com/[Your-Username]/[Your-Repo-Name].git
    ```
2.  Open the project in Android Studio.
3.  Let Gradle sync and download all dependencies.
4.  Build and run the app on an emulator or a physical device. You should now be able to sign up and start chatting!

---

## 📄 License

Distributed under the MIT License. See `LICENSE.txt` for more information.

---
