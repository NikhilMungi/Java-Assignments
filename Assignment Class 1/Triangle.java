class Triangle
{
    int a;
    int b;
    int c;

    Triangle(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void area()
    {
        double s = (a + b + c) / 2.0;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area = " + area);
    }

    void perimeter()
    {
        int perimeter = a + b + c;

        System.out.println("Perimeter = " + perimeter);
    }

    public static void main(String[] args)
    {
        Triangle t = new Triangle(3, 4, 5);

        t.area();
        t.perimeter();
    }
}