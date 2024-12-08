Here’s a **Markdown reference sheet** for the `ArrayList` class in Java, including common methods and examples:


# Java `ArrayList` Class Reference Sheet

The `java.util.ArrayList` class is a resizable array implementation of the `List` interface. It allows dynamic growth and provides methods for manipulating elements.

---

## 1. **Importing ArrayList**
```java
import java.util.ArrayList;
```

---

## 2. **Creating and Initializing an ArrayList**
```java
// Creating an ArrayList of Strings
ArrayList<String> stringList = new ArrayList<>();

// Creating an ArrayList with Initial Capacity
ArrayList<Integer> numbers = new ArrayList<>(10);

// Adding elements
stringList.add("apple");
stringList.add("banana");
```

---

## 3. **Common Methods**

### **Add Elements**
```java
ArrayList<String> list = new ArrayList<>();
list.add("apple");
list.add("banana");
list.add(1, "orange"); // Add at index 1
```

### **Access Elements**
```java
String firstItem = list.get(0); // "apple"
```

### **Update Elements**
```java
list.set(1, "grape"); // Replaces "orange" with "grape"
```

### **Remove Elements**
```java
list.remove("apple"); // Removes by value
list.remove(0); // Removes by index
```

### **Check Size**
```java
int size = list.size(); // Returns number of elements
```

### **Check if Empty**
```java
boolean isEmpty = list.isEmpty(); // true if no elements
```

### **Check if Contains an Element**
```java
boolean hasApple = list.contains("apple"); // true or false
```

---

## 4. **Iterating Over an ArrayList**

### **Using a For-Loop**
```java
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
```

### **Using an Enhanced For-Loop**
```java
for (String item : list) {
    System.out.println(item);
}
```

### **Using a Lambda Expression**
```java
list.forEach(item -> System.out.println(item));
```

---

## 5. **Sorting an ArrayList**
```java
import java.util.Collections;

ArrayList<String> list = new ArrayList<>();
list.add("banana");
list.add("apple");
list.add("cherry");

Collections.sort(list); // Sorts in ascending order
Collections.reverse(list); // Reverses the order
```

---

## 6. **Converting Between ArrayList and Array**

### **Convert ArrayList to Array**
```java
String[] array = list.toArray(new String[0]);
```

### **Convert Array to ArrayList**
```java
String[] fruits = {"apple", "banana", "cherry"};
ArrayList<String> list = new ArrayList<>(Arrays.asList(fruits));
```

---

## 7. **Clearing an ArrayList**
```java
list.clear(); // Removes all elements
```

---

## 8. **Cloning an ArrayList**
```java
ArrayList<String> clonedList = (ArrayList<String>) list.clone();
```

---

## 9. **Checking Equality**
```java
ArrayList<String> list1 = new ArrayList<>();
ArrayList<String> list2 = new ArrayList<>();

list1.add("apple");
list2.add("apple");

boolean areEqual = list1.equals(list2); // true
```

---

## 10. **Stream Operations on ArrayList**
```java
list.stream()
    .filter(item -> item.startsWith("a"))
    .forEach(System.out::println); // Prints items starting with "a"
```

---

## 11. **Capacity vs Size**
- `size()` returns the current number of elements in the ArrayList.
- The internal capacity grows dynamically as elements are added.

---

## Example Program
```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        // Access elements
        System.out.println(fruits.get(0)); // apple

        // Remove an element
        fruits.remove("banana");

        // Check size
        System.out.println(fruits.size()); // 2

        // Print all elements
        fruits.forEach(System.out::println);
    }
}
```

---

## Common Notes
- `ArrayList` is **not synchronized**. For thread-safe operations, use `Collections.synchronizedList`.
- Allows **null elements**.
```

Copy and paste this into a Markdown editor for a fully formatted and comprehensive reference for the `ArrayList` class in Java!