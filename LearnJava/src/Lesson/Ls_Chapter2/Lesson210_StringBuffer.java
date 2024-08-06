package Lesson.Ls_Chapter2;// Bài 2.10 Lớp StringBuffer
/*
     * Giới thiệu về StringBuffer
        - Lớp StringBuffer là một lớp an toàn luồng, có thể sửa đổi của một chuỗi các kí tự. Nó cơ bản giống như
          String nhưng có thể sửa đổi nội dung các kí tự lưu trong bộ đệm nội tại.
        - Ta thường sử dụng lớp này để thực hiện việc sửa đổi chuỗi kí tự trong trường hợp đa luồng.
          Các phương thức được đồng bộ khi cần do đó tất cả các thao tác trên bất kì phiên bản luồng nào cũng sẽ
          hoạt động như thể chúng xuất hiện theo một thứ tự nhất quán với các lời gọi phương thức được thực hiện
          bởi từng luồng độc lập có liên quan.
        - Giống như StringBuilder, StringBuffer thể hiện các tính năng chính của nó thông qua các thao tác chèn
          và nối chuỗi kí tự.
    * Các phương thức thường dùng
        - Các phương thức của StringBuffer tương tự như StringBuilder. Ta thay các kiểu trả về là StringBuilder
          thành StringBuffer là xong.
        - Sau đây là ví dụ sử dụng StringBuffer trong đa luồng:
 */


public class Lesson210_StringBuffer {
    public void main(String[] args) {
        var buffer = new StringBuffer();
        var task1 = new MyRunnable(buffer, 700, "Hello ");
        var task2 = new MyRunnable(buffer, 1500, "World!");
        var thread1 = new Thread(task1);
        var thread2 = new Thread(task2);
        thread2.start();
        thread1.start();
        try {
            thread2.join();
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(STR."Kết quả: \{buffer}");

    }
    /**
     * Lớp triển khai xử lý dữ liệu trong một luồng.
     */
    class MyRunnable implements Runnable {
        private final StringBuffer buffer;
        private final String message;
        private final int duration;

        public MyRunnable(StringBuffer buffer, int sleepDuration, String message) {
            this.buffer = buffer;
            this.message = message;
            this.duration = sleepDuration;
        }

        @Override
        public void run() {
            synchronized (buffer) {
                buffer.append(message);
                System.out.println(buffer);
                try {
                    Thread.sleep(duration);
                    buffer.append(message);
                    System.out.println(buffer);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
