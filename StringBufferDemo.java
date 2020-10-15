package strings;

public class StringBufferDemo {

	public static void main(String[] args) {
	
		StringBuffer sb=new StringBuffer();
		
		StringBuffer sb2=new StringBuffer("dinesh");
		
		StringBuilder sb3=new StringBuilder();
		
		char ch[]= {'b','o','o','k'};
		
		System.out.println(sb.capacity());
		
		System.out.println(sb2.length());
		
		System.out.println(sb2.capacity());
		
		System.out.println(sb2.append("worm"));
		
		System.out.println(sb2);
		
		System.out.println(sb2.insert(6, "rain"));
		
		System.out.println(sb2.delete(6, 11));
		
		for(int i=0;i<ch.length;i++)
		{
			sb.append(ch[i]);
		}
		String name=sb.toString();
		System.out.println(name);
		
	}
}
