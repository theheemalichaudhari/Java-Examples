public class PackDemo

{

    public void disp()

    {

        System.out.println("In com.demo Package - Disp Method");

    }

}
package com.mypack;

public class PackDemo 

{

	public void show()

	{

		System.out.println("In com.mypack Package - Show Method");

	}

}

import com.mypack.PackDemo; // By using Import Statement

public class PackMain

{

    public static void main(String[] args)

    {

        PackDemo d1 = new PackDemo();

        d1.show();

        com.demo.PackDemo d2 = new com.demo.PackDemo(); // Fully Qualified Name

        d2.disp();

    }

}
