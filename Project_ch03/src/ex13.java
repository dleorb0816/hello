
public class ex13 {

	public static void main(String[] args) {
		
		for(int i=0;i<100;i++)
		{
			int cnt=0;
			if(i%10==3 || i%10==6||i%10==9)
			{
				cnt++;
			}
			
			if(i/10==3 || i/10==6||i/10==9)
			{
				cnt++;
			}
			
			if(cnt==1)
			{
				System.out.println(i +"¹Ú¼ö Â¦");
			}
			if(cnt==2)
			{
				System.out.println(i + "¹Ú¼ö Â¦Â¦");
			}
		}
	}
}