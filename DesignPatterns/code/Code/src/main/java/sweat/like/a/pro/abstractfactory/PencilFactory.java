package sweat.like.a.pro.abstractfactory;

public class PencilFactory extends AbstractWriterFactory {

	@Override
	public IPen getPen(String type) {
		try {
			throw new Exception("I cannot create Pens");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public IPencil getPencil(String type) throws Exception {
		IPencil pencil;
		switch (type) {
		case "Dark":
			pencil = new DarkPencil();
			break;
		case "Light":
			pencil = new LightPencil();
			break;
		default:
			throw new Exception("cannot create Pencil of type "+ type);
		}
		return pencil;
	}

	

}
