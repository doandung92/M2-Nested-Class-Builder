public class Main {
    public static void main(String[] args) {
        Student.Builder builder = new Student.Builder(1);
        Student student = builder
                .name("Đoàn Hùng Dũng")
                .address("Hà Nội")
                .build();
        System.out.println(student);
    }
}
