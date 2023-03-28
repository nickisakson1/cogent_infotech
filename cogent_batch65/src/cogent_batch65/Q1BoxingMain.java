package cogent_batch65;

public class Q1BoxingMain {
	
	public static void main(String[] args) {
		
		int i = 1;
		byte b = 2;
		char c = 'a';
		long l = 3;
		short s = 4;
		boolean bool = true;
		float f = 5;
		double d = 6;
		
		Integer in = Integer.valueOf(i);
		Byte by = Byte.valueOf(b);
		Character ch = Character.valueOf(c);
		Long lo = Long.valueOf(l);
		Short sh = Short.valueOf(s);
		Boolean boole = Boolean.valueOf(bool);
		Float fl = Float.valueOf(f);
		Double dou = Double.valueOf(d);
		
		String temp = "";

		temp = Integer.toString(in);
		i = Integer.parseInt(temp);
		temp = Byte.toString(by);
		b = Byte.parseByte(temp);
		c = Character.toTitleCase(ch);
		temp = Long.toString(lo);
		l = Long.parseLong(temp);
		temp = Short.toString(sh);
		s = Short.parseShort(temp);
		temp = Boolean.toString(boole);
		bool = Boolean.parseBoolean(temp);
		temp = Float.toString(fl);
		f = Float.parseFloat(temp);
		temp = Double.toString(dou);
		d = Double.parseDouble(temp);
		
	}

}
