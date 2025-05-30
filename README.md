## CIS18B-S25-33479-Assignment7

### Overview
This repository contains a small Java FX desktop application that lets a user create and manage a simple list of events. It highlights several modern Java techniques and Java FX features, including:

- **FXML-driven UI & Scene Builder-friendly markup (clean separation of view from logic)
- **MVC / Controller pattern (EventsApp bootstraps the stage, EventsController owns all event-handling)
- **Observable UI updates via Java FX property bindings (labels update instantly when state changes)
- **Maven + OpenJFX plugin for one-command builds and cross-platform packaging

At runtime the user:
- Enters a title, date, and optional notes.
- Clicks Submit.
- A styled “event card” is injected into the list pane, and the form resets for the next entry. If any required field is blank the status label prompts the user to finish the form.
  
### Cloning the Repository
To copy this project, use the following command:

```bash
git clone https://github.com/Drake-Programming/CIS18B-S25-33479-Assignment7.git
cd CIS18B-S25-33479-Assignment7
```

To compile and run the code from the terminal, use the following commands:

```bash
# Runs the app in one step
mvn javafx:run
```

### Project Structure
```
src/
└── main/
    ├── java/
    │   └── com/example/cis18bs2533479assignment7/
    │       ├── EventsApp.java          # ★ Entry point (launches JavaFX stage)
    │       ├── EventsController.java   # Handles form logic & UI updates
    │       └── module-info.java        # Java module declarations
    └── resources/
        └── com/example/cis18bs2533479assignment7/
            └── events-view.fxml        # Declarative UI loaded by FXMLLoader

```

### Main Execution
The application boots from EventsApp, which loads events-view.fxml, attaches the EventsController, and displays the primary stage.

### Expected Behavior
- **Form Validation: Blank title or date → inline warning in the info label.
- **Event Card Creation: Valid submissions spawn an HBox containing title, ISO-date, and wrapped notes text, styled with rounded corners & padding, then added to the scrollable list.
- **Form Reset: After a successful add, all fields clear and focus returns to the title box for rapid data entry.
 
---

*Author:* Drake Programming
