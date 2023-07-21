package com.choucair.exito.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/exito.feature",
        tags="@stories",
        glue="com.choucair.exito.stepdefinitions",
        snippets= SnippetType.CAMELCASE)
public class RunnerTag {
}
