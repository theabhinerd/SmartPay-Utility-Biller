# SmartPay Utility Biller

## Project Overview

SmartPay is a console-based Java application that simulates a utility billing system. It calculates electricity/water bills using slab rates, validates input, and generates a digital receipt.

---

## Problem Statement

In utility billing systems, incorrect readings or calculation errors may lead to wrong billing. The goal is to build a system that ensures:

* balance validation
* error handling
* accurate billing calculation

---

## Objectives

* Implement slab-based billing logic
* Validate meter readings
* Use interface-based design
* Handle invalid inputs gracefully
* Generate formatted receipt

---

## Project Structure

```
SmartPay/
├── src/
│   ├── model/
│   │   ├── CustomerBill.java
│   │   └── Billable.java
│   ├── service/
│   │   └── BillingService.java
│   ├── util/
│   │   └── ReceiptPrinter.java
│   ├── exception/
│   │   └── InvalidReadingException.java
│   └── Main.java
├── image/
│   ├── input.png
│   └── output.png
├── README.md
├── .gitignore
```

---

## Features

### Billing System

* 0–100 units → $1/unit
* 101–300 units → $2/unit
* Above 300 → $5/unit

### Input Validation

* Prevents invalid readings
* Handles incorrect input

### Exception Handling

* Custom exception for invalid readings

### Receipt Generation

* Displays customer name
* Units consumed
* Final bill amount

---

## Solution Approach

* Created `CustomerBill` class for data
* Used `BillingService` for logic
* Implemented interface `Billable`
* Added custom exception
* Printed output using utility class

---

## OOP Concepts Used

* Encapsulation
* Abstraction
* Exception Handling
* Modular Design

---

## Sample Output

### Input

![Input](image/input.png)

### Output

![Output](image/output.png)

---

## What I Learned

* Java interface implementation
* Input validation
* Exception handling
* Clean project structure

---

## Conclusion

This project demonstrates how Java can be used to build a reliable billing system with proper validation and structured design.
