class OverloadDemo

    {

        void area(float x)

        {

            System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");

        }

        void area(float x, float y)

        {

            System.out.println("the area of the rectangle is "+x*y+" sq units");

        }

        void area(double x)

        {

            double z = 3.14 * x * x;

            System.out.println("the area of the circle is "+z+" sq units");

        }

    }

    class Overload

    {

         public static void main(String args[]) 

    	{

    	   OverloadDemo ob = new OverloadDemo();

    	   ob.area(1,2);

    	   ob.area(10,20);

    	   ob.area(30,78);

            }

    }

output:
the area of the rectangle is 2.0 sq units
the area of the rectangle is 200.0 sq units
the area of the rectangle is 2340.0 sq units

