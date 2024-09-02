class Reverse1
{
	public static void main(String[] args)
	{
		String s="$ja!va$&st%ar";
		String p=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(p);
	}
}