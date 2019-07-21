package com.accenture.prueba.utilidades;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.serenitybdd.core.pages.PageObject;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class excepciones extends PageObject {

	public void exception() throws InterruptedException, IOException {
     
		new AssertionError("no encontro el elemento");
		

	}
}
