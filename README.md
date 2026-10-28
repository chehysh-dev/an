# Android Practicals

A curated laboratory collection of **18 complete Android programming practicals** extracted, transcribed, modernized, and thoroughly documented from `Android practical.pdf`.

Each practical is housed in its own dedicated folder containing:
1. **Primary Code File** (`Practical-XX-Code.java` or `Practical-XX-Code.xml`)
2. **Comprehensive Word Documentation** (`Practical-XX-Documentation.docx`) containing all 10 standard academic sections (Aim, Requirements, Theory, Procedure, Program Source Code, Running Guide, Expected Output, Result, Troubleshooting)
3. **Essential Supporting Files** (Secondary Activities, Fragments, Resource XMLs, Menus, Database Helpers, Manifest configurations) for full execution in Android Studio.

---

## Table of Contents

| # | Practical Title / Topic | Primary Deliverables | Supporting Files | Folder Link |
|---|---|---|---|---|
| **01** | **Hello World Application**<br>Basic project setup, TextView manipulation, Activity and Manifest binding | • `Practical-01-Code.java`<br>• `Practical-01-Documentation.docx` | `activity_main.xml`<br>`AndroidManifest.xml` | [Practical-01-Hello-World](./Practical-01-Hello-World) |
| **02** | **Android Programming Resources**<br>Modular separation of colors, dimensions, strings, themes, and drawables | • `Practical-02-Code.xml`<br>• `Practical-02-Documentation.docx` | `MainActivity.java`<br>`colors.xml`<br>`dimens.xml`<br>`strings.xml`<br>`themes.xml` | [Practical-02-Android-Resources](./Practical-02-Android-Resources) |
| **03** | **Activity Lifecycle Callbacks**<br>Tracking lifecycle states (`onCreate`, `onStart`, `onResume`, `onPause`, `onStop`, `onDestroy`, `onRestart`) via Logcat | • `Practical-03-Code.java`<br>• `Practical-03-Documentation.docx` | `activity_main.xml` | [Practical-03-Activity-Lifecycle](./Practical-03-Activity-Lifecycle) |
| **04** | **Fragment Lifecycle Callbacks**<br>Dynamic fragment transactions and Logcat inspection of fragment lifecycle events | • `Practical-04-Code.java`<br>• `Practical-04-Documentation.docx` | `MainActivity.java`<br>`activity_main.xml`<br>`fragment_life.xml` | [Practical-04-Fragment-Lifecycle](./Practical-04-Fragment-Lifecycle) |
| **05** | **Fragment-Based UI Navigation**<br>Multi-fragment swapping with backstack integration (`addToBackStack`) | • `Practical-05-Code.java`<br>• `Practical-05-Documentation.docx` | `FirstFragment.java`<br>`SecondFragment.java`<br>`activity_main.xml`<br>`fragment_first.xml`<br>`fragment_second.xml` | [Practical-05-Fragment-Navigation](./Practical-05-Fragment-Navigation) |
| **06** | **Activity–Fragment Communication**<br>Bidirectional data transfer via Bundle arguments and interface listener callbacks | • `Practical-06-Code.java`<br>• `Practical-06-Documentation.docx` | `MainActivity.java`<br>`activity_main.xml`<br>`fragment_message.xml` | [Practical-06-Activity-Fragment-Communication](./Practical-06-Activity-Fragment-Communication) |
| **07** | **LinearLayout (Horizontal and Vertical)**<br>Structured student registration form using nested orientations with Submit & Clear | • `Practical-07-Code.xml`<br>• `Practical-07-Documentation.docx` | `MainActivity.java` | [Practical-07-LinearLayout](./Practical-07-LinearLayout) |
| **08** | **RelativeLayout Dynamic Alignment**<br>Relative positioning using `layout_toEndOf`, `layout_below`, and baseline alignment | • `Practical-08-Code.xml`<br>• `Practical-08-Documentation.docx` | `MainActivity.java` | [Practical-08-RelativeLayout](./Practical-08-RelativeLayout) |
| **09** | **TableLayout Structured Form**<br>Grid-based registration and login form with `TableRow` and `stretchColumns` | • `Practical-09-Code.xml`<br>• `Practical-09-Documentation.docx` | `MainActivity.java` | [Practical-09-TableLayout](./Practical-09-TableLayout) |
| **10** | **ScrollView Long Content**<br>Vertical scrolling container hosting lengthy architectural and system documentation | • `Practical-10-Code.xml`<br>• `Practical-10-Documentation.docx` | `MainActivity.java` | [Practical-10-ScrollView](./Practical-10-ScrollView) |
| **11** | **AbsoluteLayout Coordinate Positioning**<br>Fixed pixel/dp positioning demonstration using `layout_x` and `layout_y` | • `Practical-11-Code.xml`<br>• `Practical-11-Documentation.docx` | `MainActivity.java` | [Practical-11-AbsoluteLayout](./Practical-11-AbsoluteLayout) |
| **12** | **ListView with ArrayAdapter**<br>Array adapter binding, item click listener, and dynamic row background color updates | • `Practical-12-Code.java`<br>• `Practical-12-Documentation.docx` | `activity_main.xml` | [Practical-12-ListView-ArrayAdapter](./Practical-12-ListView-ArrayAdapter) |
| **13** | **AppBar (Toolbar) & Options Menu**<br>Action bar options menu inflating `mymenu.xml` to dynamically switch background colors | • `Practical-13-Code.java`<br>• `Practical-13-Documentation.docx` | `mymenu.xml`<br>`themes.xml`<br>`activity_main.xml` | [Practical-13-AppBar-Options-Menu](./Practical-13-AppBar-Options-Menu) |
| **14** | **Context Menu & Popup Menu**<br>Floating context menu on TextView long-press and anchored popup menu on Button click | • `Practical-14-Code.java`<br>• `Practical-14-Documentation.docx` | `context_menu.xml`<br>`popup_menu.xml`<br>`activity_main.xml` | [Practical-14-ContextMenu-PopupMenu](./Practical-14-ContextMenu-PopupMenu) |
| **15** | **Arithmetic Operations Calculator**<br>Four-function calculator (+, -, *, /) with inputs validation and division-by-zero guard | • `Practical-15-Code.java`<br>• `Practical-15-Documentation.docx` | `activity_main.xml` | [Practical-15-Arithmetic-Operations](./Practical-15-Arithmetic-Operations) |
| **16** | **Explicit and Implicit Intents**<br>Internal Activity switching via Explicit Intent and web URL launching via Implicit Intent | • `Practical-16-Code.java`<br>• `Practical-16-Documentation.docx` | `SecondActivity.java`<br>`activity_main.xml`<br>`activity_second.xml` | [Practical-16-Explicit-Implicit-Intents](./Practical-16-Explicit-Implicit-Intents) |
| **17** | **SQLite Database CRUD Operations**<br>Full SQLiteOpenHelper database implementation (Insert, View, Update, Delete) | • `Practical-17-Code.java`<br>• `Practical-17-Documentation.docx` | `MainActivity.java`<br>`activity_main.xml` | [Practical-17-SQLite-CRUD](./Practical-17-SQLite-CRUD) |
| **18** | **Activity-to-Activity Data Sharing**<br>Passing user text to a second Activity via `putExtra` and `getStringExtra` | • `Practical-18-Code.java`<br>• `Practical-18-Documentation.docx` | `SecondActivity.java`<br>`activity_main.xml`<br>`activity_second.xml` | [Practical-18-Activity-Data-Sharing](./Practical-18-Activity-Data-Sharing) |

---

## General Requirements and Setup

### Recommended Software Stack
* **IDE**: Android Studio (Electric Eel, Flamingo, Giraffe, Hedgehog, Iguana, Jellyfish, Koala, Ladybug, or newer)
* **JDK**: Java Development Kit 11, 17, or 21
* **Android SDK**: Build Tools 30+, Compile SDK 33 / 34, Min SDK 21+
* **Testing Hardware**: Android Virtual Device (AVD) running API 26+ or physical Android device with Developer Mode & USB Debugging enabled

### Opening and Running in Android Studio

1. **Create / Open Project**:
   * Open Android Studio and choose **New Project** &rarr; **Empty Views Activity** (or **Empty Activity**).
   * Ensure language is set to **Java** and build configuration is set to **Groovy DSL (`build.gradle`)** or **Kotlin DSL (`build.gradle.kts`)**.
2. **Placing Code and Layout Files**:
   * **Java Source Files**: Place into `app/src/main/java/<package_name>/`. Update the package statement at the top of the file to match your project's applicationId if needed.
   * **Layout XML Files**: Place into `app/src/main/res/layout/`.
   * **Menu XML Files**: Place into `app/src/main/res/menu/` (create this folder if it does not exist).
   * **Value XML Files**: Merge string, color, dimension, and theme elements into `app/src/main/res/values/`.
3. **Configuring AndroidManifest.xml**:
   * Practicals 05, 16, and 18 use secondary Activities. Verify that any secondary Activity is registered inside `<application>`:
     ```xml
     <activity android:name=".SecondActivity" android:exported="false" />
     ```
   * Practical 16 (Implicit Intent) and network-related tests benefit from `<uses-permission android:name="android.permission.INTERNET" />`.
4. **Build and Run**:
   * Click the **Sync Project with Gradle Files** button.
   * Select your target emulator or connected physical phone from the device dropdown.
   * Press **Run** (`Shift + F10`) to build and execute.

---

## Modernization and Compatibility Notes

* **AndroidX Migration**: The source PDF includes legacy Android Support Library imports (`android.support.v7.app.AppCompatActivity`, `android.support.constraint.ConstraintLayout`). In this repository, all practicals are modernized to **AndroidX** (`androidx.appcompat.app.AppCompatActivity`, `androidx.constraintlayout.widget.ConstraintLayout`) to ensure out-of-the-box compatibility with modern Android Studio versions without requiring Jetifier.
* **AbsoluteLayout (Practical 11)**: AbsoluteLayout is deprecated in API 3+ but remains functional within the Android SDK for demonstration purposes. Lint deprecation warnings may appear in Android Studio but do not impede compilation or execution.
* **Lambdas and Method References**: Modern Java 8+ lambda expressions (e.g., `v -> calculate('+')`) are used for clean, idiomatic event handling.
* **Word Documents**: All Word documents are generated as native Microsoft Word `.docx` documents formatted for college lab journal submission.

---

## Original Source PDF
The complete original 34-page source scan is preserved in the repository root:
* [Android practical.pdf](./Android%20practical.pdf)
