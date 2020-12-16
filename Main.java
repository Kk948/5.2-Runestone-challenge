class Main {
  public static void main(String[] args) {
    student s1 = new student();
    student s2 = new student("Herbology");
    student s3 = new student("Divination","Callum","Taurus","wind");
    student s4 = new student("Charms","Duncan","Piseces","Metal");

    s1.print();
    s2.print();
    s3.print();
    s4.print();
  }
}