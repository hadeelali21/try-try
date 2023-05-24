/*
 Hadeel Ali Alqahtani 
 2107818
*/
package refactoring;

/**
 *
 * @author HP
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Refactoring {

   
    public static void main(String args[])
    {

        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int arr_length = arr.length; 
        
        System.out.println("Given Array");
        for (int i = 0; i < arr_length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println("\n");
        
        //quickSort
        quickSort(arr, 0, arr_length- 1);
        System.out.println("Sorted array by Quick sort: ");
        for (int i = 0; i <arr_length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("\n");
        
        backOriginal(arr,arr_length);
        
        // merge sort 
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("\nSorted array by Megre sort");
        arr_length = arr.length;
        for (int i = 0; i < arr_length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println("\n");
        

        backOriginal(arr,arr_length);
           
        //bubbleSort
        bubbleSort(arr);
        System.out.println("\nSorted array by Bubble sort");
        for (int i = 0; i < arr_length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println("\n");

        try (Scanner scanner = new Scanner(System.in)) {
            
            //object of Student type 
            Student student=new Student();
            System.out.print("Enter student name: ");
            student.setStudentName(scanner.next());
            System.out.print("Enter student email: ");
            student.setStudentEmail(scanner.next()); 
            System.out.print("Enter student ID: ");
            student.setStudentID(scanner.nextInt()) ;
            showStudentInfo(student);
            addStudentInfo(student);
            
             //object of Employee type 
            Employee emp=new Employee();
            System.out.print("Enter employee name: ");
            emp .setEmployeeName(scanner.next());
            System.out.print("Enter employee email: ");
            emp.setEmpEmail(scanner.next()); 
            System.out.print("Enter employee ID: ");
            emp.setEmployeeID(scanner.nextInt());
            showEmployeeInfo(emp);
            addEmployeeInfo(emp);
        }

    }

    public static void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];


        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    public static void mergeSort(int arr[], int l, int r)
    {
        if (l < r) {

            int m = l + (r - l) / 2;


            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];


        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {


            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {

            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void showStudentInfo(Student student) {
        System.out.print("name: " +student.getStudentName()
                         + " \n emial address: " + student.getStudentEmail()
                         + "\n ID: " + student.getStudentID());
    }

    public static void addStudentInfo(Student student) {
        FileWriter myWriter;
        try {
            myWriter = new FileWriter("Student.txt");
            myWriter.write("name: " + student.getStudentName()
                           + " \n emial address: " + student.getStudentEmail()
                           + "\n ID: " + student.getStudentID());
            myWriter.close();
            System.out.println("\nSuccessfully wrote to the file.");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
    public static void showEmployeeInfo(Employee emp) {
        System.out.print("name: " +emp.getEmployeeName()
                         + " \n emial address: " + emp.getEmpEmail()
                         + "\n ID: " + emp.getEmployeeID());
    }

    public static void addEmployeeInfo(Employee emp) {
        FileWriter myWriter;
        try {
            myWriter = new FileWriter("Employee.txt");
            myWriter.write("name: " + emp.getEmployeeName()
                           + " \n emial address: " + emp.getEmpEmail()
                           + "\n ID: " + emp.getEmployeeID());
            myWriter.close();
            System.out.println("\nSuccessfully wrote to the file.");
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }
    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    //-----------
                    
                }
    }

    private static void backOriginal(int[] arr, int arr_length) {
       for (int i = 0, j=10; i < arr_length; i++)
            arr[i] =j--;
        System.out.println("Given Array");
        for (int i = 0; i < arr_length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println("\n");
    }

}


