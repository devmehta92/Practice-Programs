class compress
{
	public static void main(String args[])
	{
		int count=1;
		String s="aaaabbccccdefppppplmLLLLLLLLL";
		StringBuilder sb=new StringBuilder();
		for(int i=s.length()-1;i>=1;i--){
			if(s.charAt(i)==s.charAt(i-1)){
				count++; 
					if(i==1){
						sb.append(count);	
						sb.append(s.charAt(i));
					}
			}
			else{
					if(count==1){
						sb.append(s.charAt(i));
					}
					else{
				sb.append(count);	
				sb.append(s.charAt(i));
					}
				count=1;
			}
		}
		sb.reverse();
		System.out.print(sb);
	}
}