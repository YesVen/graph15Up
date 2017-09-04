package sweat.like.a.pro.abstractfactory;

public class Main {
	public static void main(String[] args) throws Exception {
		
		PenFactory penFactory = (PenFactory) AbstractWriterFactory.getWriterFactory("Pen");
		penFactory.getPen("Marker").write();
		penFactory.getPen("Ink").write();
		
		PencilFactory pencilFactory = (PencilFactory) AbstractWriterFactory.getWriterFactory("Pencil");
		pencilFactory.getPencil("Dark").draw();
		pencilFactory.getPencil("Light").draw();
		
		//Test exceptions
		//PencilFactory rubberFactory = (PencilFactory) AbstractWriterFactory.getWriterFactory("Rubber");
		
		//penFactory.getPen("SktechPen");
		
		penFactory.getPencil("XXX");
	}
}
