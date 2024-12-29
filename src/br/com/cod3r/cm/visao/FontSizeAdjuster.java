package br.com.cod3r.cm.visao;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.util.Enumeration;

public class FontSizeAdjuster {

	public static void setUIFont(FontUIResource f) {
	        Enumeration<Object> keys = UIManager.getDefaults().keys();
	        while (keys.hasMoreElements()) {
	            Object key = keys.nextElement();
	            Object value = UIManager.get(key);
	            if (value instanceof FontUIResource) {
	                UIManager.put(key, f);
	           }
	       }
	   }
}


