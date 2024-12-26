# Aadhaar Application Form GUI in Java

## Project Description
This project simulates an Aadhaar application form system. It is a standalone desktop application built using Java Swing. The application allows users to fill in personal details, upload a passport-sized photo, and view a generated preview of an Aadhaar card.

---

## Features

1. **Graphical User Interface (GUI):**
   - User-friendly form for inputting personal details.
   - Interactive components like text fields, radio buttons, and buttons.

2. **Input Validation:**
   - Ensures valid Aadhaar numbers, names, and other details.
   - Restricts invalid or inappropriate data entries.

3. **Photo Upload:**
   - Upload and display a passport-sized photo.
   - Supports image formats like JPG, JPEG, and PNG with size validation.

4. **Aadhaar Card Preview:**
   - Displays entered information and photo in a mock Aadhaar card layout.

5. **Error Handling:**
   - Alerts for incorrect inputs via popup dialogs.

---

## Technologies Used

- **Programming Language:** Java
- **Framework:** Java Swing (GUI development)
- **Tools:**
  - JFileChooser for file selection.
  - ImageIcon for image handling.
  - Event Listeners for input validation and button actions.

---

## Prerequisites

- Java Development Kit (JDK) 8 or later.
- Any IDE supporting Java (e.g., IntelliJ IDEA, Eclipse, NetBeans).

---

## Installation

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/aadhaar-application-form.git
   ```

2. **Navigate to the Project Directory:**
   ```bash
   cd aadhaar-application-form
   ```

3. **Open the Project in Your IDE:**
   - Import the project into your preferred IDE.

4. **Compile and Run the Application:**
   - Locate the main class file (e.g., `AadhaarApplicationForm.java`).
   - Run the file to launch the application.

---

## How to Use

1. Launch the application.
2. Fill out the form fields with your details:
   - Full Name
   - Father's/Mother's Name
   - Date of Birth
   - Gender
   - Marital Status
   - Aadhaar Number
   - Address
3. Click on the "Upload Photo" button to select and upload a passport-sized image.
4. Click on the "Generate Aadhaar Card" button to preview your Aadhaar card.

---

## Project Structure

```
|-- src/
    |-- AadhaarApplicationForm.java   # Main GUI class
    |-- utils/                        # Utility functions (optional)
        |-- ImageValidator.java       # Handles image validation
```

---

## Screenshots

---

## Screenshots

### Form Interface
![Form Screenshot](Screenshot%202024-12-27%20001400.png)

### Aadhaar Card Preview
![Card Preview Screenshot](Screenshot%202024-12-27%20002444.png)

---

## Contributing

1. Fork the repository.
2. Create a new branch for your feature or bug fix:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add feature-name"
   ```
4. Push to the branch:
   ```bash
   git push origin feature-name
   ```
5. Create a pull request.

---

## License
This project is licensed under the [MIT License](LICENSE).

---

## Contact
For any inquiries or issues, feel free to contact:

- **Name:** Narasing Sahu
- **Email:** [narasingsahu002@gmail.com](mailto:narasingsahu002@gmail.com)

---

## Acknowledgments
- Inspiration for building this project comes from learning Java Swing.
- Thanks to all contributors for their valuable inputs and suggestions.
