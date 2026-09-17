
class Student
{
    private int rollNo;
    private String name;
    private float marks;

    Student(int rollNo, String name, float marks)
    {
        setrollNo(rollNo);
        setname(name);
        setmarks(marks);
    }

    public void setrollNo(int rollNo)
    {
        if (rollNo > 0)
            this.rollNo = rollNo;
        else
            System.out.println("Invalid roll number");
    }

    public int getrollNo()
    {
        return rollNo;
    }

    public void setname(String name)
    {
        this.name = name;
    }

    public String getname()
    {
        return name;
    }

    public void setmarks(float marks)
    {
        if (marks >= 0 && marks <= 100)
            this.marks = marks;
        else
            System.out.println("Invalid marks");
    }

    public float getmarks()
    {
        return marks;
    }
}

class Oops20
{
    public static void main(String[] args)
    {
        Student s = new Student(37, "Surendra_Naidu", 98.5f);

        System.out.println("Roll No: " + s.getrollNo());
        System.out.println("Name: " + s.getname());
        System.out.println("Marks: " + s.getmarks());
    }
}

