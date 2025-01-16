class Student {
    String name;
    int rollNo;
    String std;
    char group;

    Student(String name, int rollNo, String std, char group)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.std = std;
        this.group = group;

    }
    void details()
    {
        System.out.println("Student details:" + this.name + " " + this.rollNo + " " + this.std + " " + this.group);
    }

    public static void main(String[] args) {
        Student  s1 = new Student("ramesh",21,"10th",'A');
        Student s2 = new Student("suresh",22,"12th",'B');
        Student s3 = new Student("gukesh",23,"11th",'C');
        s1.details();
        s2.details();
        s3.details();

    }
}