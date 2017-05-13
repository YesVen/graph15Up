package sweat.like.a.pro.java8_old.src.com.java.knowhows.eg.java7.FileAPIs;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class PathAPI {

	public static void main(String[] args) 
	{
		//Old Way

		File file = new File("hello.txt");
		System.out.println("File exists() == " + file.exists());
		 
		//New Way
		Path path = FileSystems.getDefault().getPath("hello.txt");
		System.out.println("Path exists() == " + Files.exists(path));
		
		
		FileSystem fileSystem = FileSystems.getDefault();
		Iterable<Path> pathIterable = fileSystem.getRootDirectories();
		
		System.out.println(pathIterable);
	}

}
