package com.first;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fwrite = new FileWriter("random.txt");
		char [] buff = new char[1024];
		for(int i=0;i<100;i++) {
			fwrite.write(Math.random()+"");
		}
		fwrite.close();
	}

}
