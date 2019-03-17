package com.semanticssquare.thrillio.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class IOUtil {
	
	public static void read(ArrayList<String> data,String filename) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(filename),"UTF-8"))){
			  String line;
			  while((line=br.readLine())!=null) {
				  data.add(line);
			  }
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
