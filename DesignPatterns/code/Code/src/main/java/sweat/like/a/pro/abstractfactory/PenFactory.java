package sweat.like.a.pro.abstractfactory;

public class PenFactory extends AbstractWriterFactory {

	@Override
	public IPen getPen(String type) throws Exception {
		IPen pen;
		switch (type) {
		case "Marker":
			pen = new MarkerPen();
			break;
		case "Ink":
			pen = new InkPen();
			break;
		default:
			throw new Exception("cannot create Pen of type "+ type);
		}
		return pen;
	}

	@Override
	public IPencil getPencil(String type) {
		try {
			throw new Exception("I cannot create Pencils");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	

}
