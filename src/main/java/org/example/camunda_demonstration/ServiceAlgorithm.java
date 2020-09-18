package org.example.camunda_demonstration;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ServiceAlgorithm implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Integer ramdomicNumber = (Integer) delegateExecution.getVariable("randomicNumber");
        System.out.println("Service Algorithm: " + ramdomicNumber.toString());
    }
}
