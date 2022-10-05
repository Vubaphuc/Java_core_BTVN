public class Main {
    public static void main(String[] args) {
        // khai báo hàm chuỗi String
        String name = "Hello every one";
        // khai báo biến toàn cục
        int i;
        int soLan = 0;
        // vòng lặp for
        for (i = 0; i < name.length(); i++){
            if ('e'==(name.charAt(i))){
                soLan++;
                // in ra bị trí index của e khi xuất hiện trong hàm chứa biến i
                System.out.println("Giá trị Index của e lần lượt là: "+i);
            }
        }
        // in ra tổng số lần e xuất hiện
        System.out.println("Tổng số lần của e là: "+soLan);
    }
}