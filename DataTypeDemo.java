class DataTypeDemo{

	public static void main(String args[]){

		Integer a=10;
		System.out.println("---------------integer---------------------");
		System.out.println("bytes:"+a.BYTES);
		System.out.println("bits:"+a.SIZE);
		System.out.println("max:"+Integer.MAX_VALUE);
		System.out.println("min:"+Integer.MIN_VALUE);
                

		Byte b=10;
		System.out.println("---------------byte---------------------");
		System.out.println(b.BYTES);
		System.out.println(b.SIZE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

		Long l=10000L;
System.out.println("---------------long---------------------");
		System.out.println(l.BYTES);
		System.out.println(l.SIZE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);


		Short s=10;
System.out.println("---------------short---------------------");
		System.out.println(s.BYTES);
		System.out.println(s.SIZE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);

		Character c=10;
System.out.println("---------------character---------------------");
		System.out.println(c.BYTES);
		System.out.println(c.SIZE);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);


		Float f=10.03f;
System.out.println("---------------float---------------------");
		System.out.println(f.BYTES);
		System.out.println(f.SIZE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);

		Double d=10000.500d;
System.out.println("---------------double---------------------");
		System.out.println(d.BYTES);
		System.out.println(d.SIZE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

		double r=3.14;pi=9.8;
	System.out.println((pi*pi*r));
		

		}}