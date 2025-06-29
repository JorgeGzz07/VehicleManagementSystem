# # Vehicle Management System

This Java project demonstrates object-oriented principles including inheritance, method overriding, and encapsulation using a Vehicle base class and two subclasses: Car and Bicycle.

## 🚗 Classes

- **Vehicle**: Base class with protected `speed` and private `fuel` attributes. Includes methods to start, stop, and display fuel (final).
- **Car**: Extends Vehicle; adds private `numberOfDoors` attribute, overrides start(), and adds a honk() method.
- **Bicycle**: Extends Vehicle; adds private `hasBell` attribute, overrides start(), and adds ringBell() method that checks bell presence.

## 🛠️ Features

- Proper use of access modifiers: protected, private, public
- Method overriding (`start()` method in Car and Bicycle)
- Use of final method (`displayFuel()` in Vehicle)
- Custom methods in subclasses (`honk()`, `ringBell()`)
- Getters and setters for all attributes
- Testing all methods in the `Main` class

## 📁 File Structure

VehicleManagementSystem/
├── Vehicle.java # Base class
├── Car.java # Car subclass
├── Bicycle.java # Bicycle subclass
└── Main.java # Testing driver class


## ▶️ How to Compile and Run

1. Open terminal or command prompt.
2. Navigate to the project directory:
   ```bash
   cd path/to/VehicleManagementSystem
Compile all Java files:
javac *.java
Run the program:
java Main
✅ Sample Output

Car started.
Fuel level: 50.5
Beep Beep!
Car doors: 4

Bicycle started. Pedal away!
Fuel level: 5.0
Ring Ring!

Bicycle started. Pedal away!
Fuel level: 4.5
This bicycle has no bell.
👨‍💻 Author

GitHub: JorgeGzz07

