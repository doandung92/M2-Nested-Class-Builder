public class Student {
    private int id;
    private String name;
    private String address;

    private Student(Student.Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder{
        private int id;
        private String name;
        private String address;

        public Builder(int id) {
            this.id = id;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder address(String address) {
            this.address = address;
            return this;
        }
        public Student build(){
            return  new Student(this);
        }


    }
}
