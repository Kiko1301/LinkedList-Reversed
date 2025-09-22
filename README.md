# Singly Linked List Implementation in Java

A simple **singly linked list** implementation in Java that allows adding nodes, reversing the list, and printing its contents. This project is designed for educational purposes and to demonstrate basic linked list operations.

---

## Table of Contents
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Code Overview](#code-overview)
- [Example Output](#example-output)
- [Contributing](#contributing)
- [License](#license)

---

## Features

- Add nodes to the end of the list.
- Reverse the linked list iteratively.
- Print the linked list in order.
- Simple and easy-to-understand Java implementation.

---

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher.
- A code editor or IDE (e.g., Eclipse, IntelliJ IDEA, VS Code).
  
---

### Installation

1. Clone this repository:
    ```bash
   git clone https://github.com/your-username/Linked_List_Reversed.git
2. Open the project in your preferred IDE.
3. Compile and run the Linked_List_Reversed.java file.

---

### Usage

1. Create an instance of Linked_List_Reversed.
2. Use addNode(int data) to add elements to the list.
3. Call reverse() to reverse the linked list.
4. Use printList() to print the elements of the list.

Linked_List_Reversed list = new Linked_List_Reversed();

// Add nodes
list.addNode(85);
list.addNode(15);
list.addNode(4);
list.addNode(20);

// Print original list
System.out.println("Given linked list:");
list.printList();

// Reverse and print
list.reverse();
System.out.println("Reversed linked list:");
list.printList();

---

### Code Overview

- **Linked_List_Reversed** – Main class for linked list operations.
- **Node** – Nested static class representing each element of the list.
- **addNode(int data)** – Adds a node to the end.
- **reverse()** – Reverses the linked list iteratively.
- **printList()** – Prints all elements in the linked list.

---

### Example Output

Given linked list:
85 15 4 20 
Reversed linked list:
20 4 15 85

---

### Contributing

**Contributions are welcome! You can:**
- Report issues
- Suggest improvements
- Submit pull requests
**Please make sure your code follows the same style and is well-documented.**

  ---

### License

This project is open source and available under the **MIT License**
