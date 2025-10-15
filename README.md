# MAD204-LAB02-YourName

## Lab Title
Android Login + Greeting App

## Author
Your Full Name - Student ID: 123456789

## Description
This Android app demonstrates a basic login and greeting workflow using Kotlin in Android Studio. It connects user input with dynamic UI updates and activity navigation to practice foundational Android development skills.

The app opens with a Login screen where users enter their email and password (any input is accepted). Upon clicking the Login button, it navigates to a Greeting screen that displays a personalized welcome message using the entered email. The Greeting screen also includes a Logout button to return to the Login screen.

## Features
- Uses ConstraintLayout for responsive UI design
- Custom styles applied to buttons via styles.xml
- UI widgets: TextView, EditText, Button, ImageView
- Event handling through setOnClickListener
- Data passing between activities with Intent extras
- Accessibility best practices with dp and sp sizing
- Supports both portrait and landscape orientations

## Project Structure
- `MainActivity.java`: Handles login screen UI and event
- `SecondActivity.java`: Displays greeting and manages logout
- `res/layout/activity_main.xml`: Login screen layout
- `res/layout/activity_second.xml`: Greeting screen layout
- `res/values/styles.xml`: Button and app styles
- `res/values/colors.xml`: Color resources

## How to Run
1. Clone or download the repository.
2. Open in Android Studio.
3. Build and run on an emulator or device with minimum API 30.
4. Enter any email and password, click Login.
5. View personalized greeting, then Logout to return.

## GitHub Workflow
- Minimum 5 meaningful commits documenting progress
- At least 3 pull requests covering key features:
  - Initial project setup with layouts
  - Implement login functionality and event handling
  - Implement greeting screen and logout functionality

## Learning Outcomes
- Understanding Android project structure and resource files
- Using ConstraintLayout for flexible layouts
- Handling user input and button events in Kotlin
- Passing data between activities with intents
- Styling widgets with themes and reusable styles
- Testing app responsiveness and orientation support
- Applying software documentation and version control best practices
