# Practical-3: GUNI – Intent Demonstration App

##  AIM
Create an Android application that demonstrates both **Implicit Intent** and **Explicit Intent** using real-world examples.

---

##  FEATURES IMPLEMENTED

###  **Implicit Intent Examples**
- Make a call to a specific phone number  
- Open a website URL in the browser  
- View the device Call Log  
- Open the Gallery to view images  
- Set an Alarm  
- Open the Camera to capture an image  

###  **Explicit Intent Example**
- Navigate from **MainActivity → LoginActivity**

---

##  STUDY CONCEPTS USED

###  **Intent Types**
- Implicit Intent  
- Explicit Intent  

###  **Intent Actions & Common Methods**
- `Intent.ACTION_VIEW`  
- `Intent.ACTION_DIAL`  
- `Intent.ACTION_CALL`  
- `Intent.setData()`  
- `Intent.setType()`  
- `startActivity()`  

###  **Activity Result Handling**
- `ActivityResultContracts`  

###  **Permission Handling**
- `ContextCompat.checkSelfPermission()`  
- `ActivityCompat.requestPermissions()`  

###  **URI & MIME Handling**
- `Uri.parse()`  
- `ContactsContract.Contacts.CONTENT_TYPE`  
- `CallLog.Calls.CONTENT_TYPE`  
- MIME Types: `"image/*"`, `"tel:"`  

---

##  UI COMPONENTS USED
- **Button**  
- **EditText**  
- **TextView**  
- **ConstraintLayout**  
- **CoordinatorLayout**  
- Custom drawable backgrounds (rounded buttons, card styles)

---

##  ANDROID MANIFEST CONFIGURATION

###  Permissions Declared:
- `CALL_PHONE`  
- `READ_CALL_LOG`  
- `SET_ALARM`  
- `CAMERA`  

###  Activities Included:
- `MainActivity`  
- `LoginActivity`  

###  Intent Filters:
Added where needed to enable specific implicit intent operations.

---

##  DESIGN OVERVIEW
- Clean and minimal UI  
- Purple-styled action buttons  
- Two screens:
  - **Main Screen:** Demonstrates implicit intents  
  - **Login Screen:** Demonstrates explicit intent  
- Responsive layout  
- Supports Light & Dark Mode  

---

# 📸 SCREENSHOTS

### **Main Screen**
![Main Screen](https://drive.google.com/uc?export=view&id=1GUzFcacHyFPJqfWDrqj0jVdIorId4IDd)

---

### **Login Screen**
![Login Screen](https://drive.google.com/uc?export=view&id=1weLPNaBPe7zO2EAnNTctDBndqAan8OKf)

---

##  SUMMARY
This practical demonstrates:
- Implicit & Explicit Intents  
- Permission management  
- MIME handling  
- URI parsing  
- Activity navigation  
- Android Manifest configuration  
- Clean UI design  

A complete demonstration of Android Intent systems for real-world actions.

