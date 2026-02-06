# Android Temperature Conversion App

**Author:** Sherika Fayson  
**Course:** Mobile App Development  
**Platform:** Android (Kotlin)

---

## 📱 Overview

This Android application provides temperature conversion functionality between **Fahrenheit (°F)** and **Celsius (°C)**.  
The app uses a single activity with a custom layout and allows users to input a temperature, choose a conversion type, and view the converted result.

---

## ✨ Features

- Convert **Fahrenheit → Celsius**
- Convert **Celsius → Fahrenheit**
- Single-screen (one activity) design
- Input validation with enforced temperature bounds
- Toast messages for invalid/out-of-range input
- Clean and intuitive user interface
- Custom app icon
- Image included in layout

---

## 🔢 Conversion Formulas Used

- **Fahrenheit to Celsius**  
(°F − 32) × 5 / 9


- **Celsius to Fahrenheit**  
(°C × 9 / 5) + 32


---

## 🚦 Temperature Bounds

| Unit | Minimum | Maximum |
|-----|--------|--------|
| Fahrenheit (°F) | -100 | 250 |
| Celsius (°C) | -75 | 125 |

If a value outside these ranges is entered, the app displays a **toast message** notifying the user.

---

## 🧩 Technical Details

- **Language:** Kotlin  
- **IDE:** Android Studio  
- **Minimum SDK:** API 24 (Android 7.0)  
- **Architecture:** Single Activity  
- **UI:** XML layout (ConstraintLayout)

---

## 📂 Project Structure
```
app/
 ├─ src/main/java/
 │   └─ MainActivity.kt
 ├─ src/main/res/
 │   ├─ layout/activity_main.xml
 │   ├─ drawable/
 │   ├─ mipmap/
 │   └─ values/
 └─ AndroidManifest.xml
```

---

## 🧪 Example Test Values

- `212 °F` → `100 °C`
- `0 °C` → `32 °F`
- `300 °F` → ❌ Out of range (toast shown)
- `-100 °C` → ❌ Out of range (toast shown)

---

## 📸 Screenshots

*(Add screenshots of the running app here if required by the assignment)*

---

## ✅ Status

✔ Complete  
✔ Meets all assignment requirements  
✔ Ready for submission
