package sweat.like.a.pro.abstractfactory;

/**
 * Its factory of factories.
 * 
 * It must return a factory and leave other methods as abstract.
 * 
 * @author DBE1
 *
 */
public abstract class AbstractWriterFactory {

	public static AbstractWriterFactory getWriterFactory(String type) throws Exception {
		AbstractWriterFactory factory;
		switch (type) {
		case "Pen":
			factory =  new PenFactory();
			break;
		case "Pencil":
			factory =  new PencilFactory();
			break;
		default:
			throw new Exception("I dont recognize "+ type + "factory");
		}
		return factory;
	}
	
	public abstract IPen getPen(String type)throws Exception;
	
	public abstract IPencil getPencil(String type) throws Exception;
	
}
