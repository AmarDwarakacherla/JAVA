package Java_Design_Patterns;

class Phone {
    private String os, processor;
    private int ram;

    private Phone(Builder builder) {
        this.os = builder.os;
        this.processor = builder.processor;
        this.ram = builder.ram;
    }

    static class Builder {
        private String os;
        private String processor;
        private int ram;

        public Builder setOS(String os) {
            this.os = os;
            return this;
        }

        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder setRAM(int ram) {
            this.ram = ram;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }

    public String toString() {
        return "Phone[OS=" + os + ", Processor=" + processor + ", RAM=" + ram + "]";
    }
}

public class Builder {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .setOS("Android")
                .setProcessor("Snapdragon")
                .setRAM(8)
                .build();
        System.out.println(phone);
    }
}
