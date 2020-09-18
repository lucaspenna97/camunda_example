package org.example.turing_machine;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ProcessThree implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String s = (String) delegateExecution.getVariable("variableTwo");
        delegateExecution.setVariable("variableThree", s + " World!");
    }
}
