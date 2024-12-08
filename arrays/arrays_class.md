Here is a reference sheet in **Markdown format** with examples for the `Arrays` class in Java. 


# Java `Arrays` Class Reference Sheet

The `java.util.Arrays` class provides utility methods for working with arrays, including sorting, searching, and converting arrays to strings.

---

## 1. **Importing Arrays Class**
```java
import java.util.Arrays;
```

---

## 2. **Creating and Initializing Arrays**

```java
int[] intArray = {1, 2, 3, 4, 5};
String[] stringArray = {"apple", "banana", "cherry"};
```

---

## 3. **Sorting Arrays**
Sorts the specified array into ascending numerical or lexicographical order.

```java
int[] numbers = {5, 3, 8, 1};
Arrays.sort(numbers); // [1, 3, 5, 8]

String[] words = {"banana", "apple", "cherry"};
Arrays.sort(words); // ["apple", "banana", "cherry"]
```

---

## 4. **Searching Arrays**
Uses binary search to find the index of a specific value. (Requires the array to be sorted!)

```java
int[] sortedNumbers = {1, 3, 5, 8};
int index = Arrays.binarySearch(sortedNumbers, 5); // 2
int notFound = Arrays.binarySearch(sortedNumbers, 10); // Negative value
```

---

## 5. **Comparing Arrays**
Checks if two arrays are equal.

```java
int[] array1 = {1, 2, 3};
int[] array2 = {1, 2, 3};
int[] array3 = {3, 2, 1};

boolean isEqual = Arrays.equals(array1, array2); // true
boolean notEqual = Arrays.equals(array1, array3); // false
```

---

## 6. **Filling Arrays**
Fills all elements of the array with a specified value.

```java
int[] numbers = new int[5];
Arrays.fill(numbers, 42); // [42, 42, 42, 42, 42]
```

---

## 7. **Copying Arrays**
Creates a new array by copying the contents of an existing array.

```java
int[] original = {1, 2, 3};
int[] copy = Arrays.copyOf(original, 5); // [1, 2, 3, 0, 0]

int[] rangeCopy = Arrays.copyOfRange(original, 0, 2); // [1, 2]
```

---

## 8. **Converting Arrays to Strings**
Returns a string representation of the array.

```java
int[] numbers = {1, 2, 3};
String arrayString = Arrays.toString(numbers); // "[1, 2, 3]"

String[][] matrix = {{"a", "b"}, {"c", "d"}};
String deepString = Arrays.deepToString(matrix); // "[[a, b], [c, d]]"
```

---

## 9. **Parallel Sorting**
Sorts arrays using the parallel sort algorithm for large arrays.

```java
int[] numbers = {5, 3, 8, 1};
Arrays.parallelSort(numbers); // [1, 3, 5, 8]
```

---

## 10. **Stream from Arrays**
Creates a stream from an array (useful for functional programming).

```java
int[] numbers = {1, 2, 3, 4, 5};
Arrays.stream(numbers)
      .filter(n -> n % 2 == 0)
      .forEach(System.out::println); // 2, 4
```

---

## 11. **Mismatch**
Finds the first index where two arrays differ.

```java
int[] array1 = {1, 2, 3, 4};
int[] array2 = {1, 2, 4, 4};

int mismatchIndex = Arrays.mismatch(array1, array2); // 2
```

---

## 12. **Hashing Arrays**
Computes a hash code for an array.

```java
int[] numbers = {1, 2, 3};
int hashCode = Arrays.hashCode(numbers);

String[][] matrix = {{"a", "b"}, {"c", "d"}};
int deepHashCode = Arrays.deepHashCode(matrix);
```

---

## Common Notes
- Most methods work for **both primitive and reference types**.
- Use `Arrays.deepEquals` and `Arrays.deepHashCode` for multidimensional arrays.
```

Copy and paste the above code into any Markdown editor to get a fully formatted reference sheet for the `Arrays` class in Java!