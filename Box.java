/* DEFINE A CLASS BOX THAT USES A PARAMETERIZED CONSTRUCTOR TO INITIALIZE THE DIMENSIONS OF A BOX. THE DIMENSIONS OF THE BOX ARE WIDTH, HEIGHT, DEPTH. THE CLASS SHOULD HAVE A METHOD THAT CAN RETURN THE VOLUME OF THE BOX. CREATE AN OBJECT OF THE BOX CLASS AND TEST THE FUNCTIONALITIES. USE this KEYWORD TO INITIALIZE*/

class Box
{
	int height,depth,width;
	Box(int height,int depth,int width)
	{
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	int volume(Box ob1)
	{
		int vol;
		vol=ob1.depth*ob1.width*ob1.height;
		return vol;
	}
	public static void main(String[] args) {
		int vol;
		Box ob1=new Box(3,2,1);
		vol=ob1.volume(ob1);
		System.out.println("Volume ="+vol);
	}
}

