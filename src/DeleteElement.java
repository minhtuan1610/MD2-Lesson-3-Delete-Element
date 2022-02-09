import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
//      Khởi tạo mảng gồm 10 phần tử
        int[] originalArray;
        originalArray = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the original elements:");
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = scanner.nextInt();
        }
//      Kiểm tra phần tử X cần xoá có trong mảng hay không?
        int x;
        int index_del = 0;
        Scanner scannerX = new Scanner(System.in);
        System.out.println("Enter an element to be deleted");
        x = scannerX.nextInt();
        boolean isExist = false;
        for (int i = 0; i < originalArray.length; i++) {
            if (x == originalArray[i]) {
                System.out.println("index_del: " + i);
                isExist = true;
                index_del = i;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + x + " in the list");
        }
//      Thực hiện xoá phần tử X trong mảng
        if (isExist) {
            int[] newArray;
            newArray = new int[originalArray.length - 1];
            for (int i = 0; i < index_del; i++) {
                newArray[i] = originalArray[i];
            }
            for (int i = index_del; i < newArray.length; i++) {
                newArray[i] = originalArray[i + 1];
            }
            originalArray = newArray;
            System.out.println("List elements in the new array:");
            for (int i = 0; i < originalArray.length; i++) {
                System.out.print(originalArray[i] + "\t");
            }
        }
    }
}
