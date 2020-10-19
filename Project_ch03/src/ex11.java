
public class ex11 {

	public static void main(String[] args) {
		int sum=0;
		for(int i =0;i<args.length;i++) {
			int a = Integer.parseInt(args[i]);
			sum += a;
			System.out.print(a+ " " );
			//System.out.println(sum);
	}
		System.out.println(sum/args.length);

		//int avg=sum/args.length;
		//System.out.println(avg);
}
}