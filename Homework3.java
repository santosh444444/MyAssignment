public class Homework3 {
    public static void main(String[] args) {
        Salary salary1 = new Salary();
        Salary salary2 = new Salary();

        salary1.scale0fsalary(x: 5000,y :7000,z:9000);
        salary2.scale0fsalary(x:6000,y:6000,z:9000);

        salary1.MeasureSalary();
        salary2.MeasureSalary();
    }
}
        class Salary

        {
            float baseSalary;
            float mediumSalary;
            float highsalary;

            void scaleofsalary(float x, float y, float 2)
            {baseSalary= x;
                mediumSalary = y;
                highsalary = Z;}

            void MeasureSalary() {
                if (baseSalary > mediumSalary && mediumSalary > highsalary) {
                    System.out.println("Base Salary will be " + baseSalary);
                } else if (mediumSalary > baseSalary && mediumSalary > highsalary)
                    System.out.println("Medium salary will be " + mediumSalary);
                else if (highSalary > baseSalary && highsalary > baseSalary) {
                    System.out.println(" Highest salary will be" + highsalary);
                } else {
                    System.out.println("salary can be equal");
                }
            }

