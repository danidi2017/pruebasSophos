
package com.accenture.prueba.Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.Before;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.junit.BeforeClass;

import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
features="src/test/resources/features/carroDecompras.feature",
 
	tags= {"@tag_1,"
	//,""

	},
glue = {"com.accenture.prueba.step_definitions"},
snippets = SnippetType.UNDERSCORE,
monochrome = true,
dryRun = false,
plugin = {"json:reportJson/cucumber.json"}
		)

public class MetrocompraRunner {



}




