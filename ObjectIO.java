import java.io.*;

public final class ObjectIO {

	private ObjectIO() {}

	public static <T extends Serializable> T readObject(String filePath, Class<T> c) throws IOException, ClassNotFoundException {
		
		Object obj = null;

		FileInputStream fin = null;
		ObjectInputStream ois = null;
		
		try {

			fin = new FileInputStream(filePath);
			ois = new ObjectInputStream(fin);
			obj = ois.readObject();
		}
		finally {

			if (fin != null) {
				
				try {
					
					fin.close();
				}
				catch (IOException e) {e.printStackTrace();}
			}

			if (ois != null) {
				
				try {
					
					ois.close();
				}
				catch (IOException e) {e.printStackTrace();}
			}
		}
		
		return c.cast(obj);
	}
	
	public static void writeObject(String filePath, Serializable obj) throws IOException {
		
		FileOutputStream fout = null;
		ObjectOutputStream oos = null;

		try {

			fout = new FileOutputStream(filePath);
			oos = new ObjectOutputStream(fout);
			oos.writeObject(obj);
		}
		finally {

			if (fout != null) {
				
				try {
					
					fout.close();
				}
				catch (IOException e) {e.printStackTrace();}
			}

			if (oos != null) {
				
				try {
					
					oos.close();
				}
				catch (IOException e) {e.printStackTrace();}
			}
		}
	}
	
	/*
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		for (int i = 0; i < 100; i++) {
			
			treeMap.put(i, "Derek is awesome");
		}
		
		ObjectIO.writeObject("lolz.txt", treeMap);
		
		TreeMap<?, ?> tM = ObjectIO.readObject("lolz.txt", TreeMap.class);
		
		System.out.println(tM);
	}
	*/
}
