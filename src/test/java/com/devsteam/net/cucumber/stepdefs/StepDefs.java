package com.devsteam.net.cucumber.stepdefs;

import com.devsteam.net.ContabilidadJcApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ContabilidadJcApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
