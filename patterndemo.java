public class patterndemo{
	public static void main(String[] args) {
		PatternRectangle p1 = new PatternRectangle(15,20,false,'k');
		PatternRectangle p2 = new PatternRectangle(10,10,false,'$');
		PatternRectangle p3 = new PatternRectangle("yes");
		p1.print();
		p1.printtype();
		// p2.isfilld=true;
		p2.print();
		p2.printtype();
		p3.print();
	}
}