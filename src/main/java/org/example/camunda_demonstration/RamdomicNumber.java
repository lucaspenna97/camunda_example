package org.example.camunda_demonstration;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

public class RamdomicNumber implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        delegateExecution.setVariable("applicationName", "camunda-demonstration");
        delegateExecution.setVariable("randomicNumber", getRandomNumberFromApi());
    }

    private int getRandomNumberFromApi() {
        final String uri = "http://www.randomnumberapi.com/api/v1.0/random";

        RestTemplate restTemplate = new RestTemplate();
        ArrayList<?> result = restTemplate.getForObject(uri, ArrayList.class);

        if (result == null) return 0;
        return (int) result.get(0);
    }

}
