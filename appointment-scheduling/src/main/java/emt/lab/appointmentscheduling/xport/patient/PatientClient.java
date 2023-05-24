package emt.lab.appointmentscheduling.xport.patient;

import emt.lab.appointmentscheduling.domain.valueobjects.Patient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;
import java.util.List;

@Service
public class PatientClient {
    private final RestTemplate restTemplate;
    private final String serverUrl;

    public PatientClient(@Value("${app.patient-management.url}") String serverUrl) {
        this.serverUrl = serverUrl;
        this.restTemplate = new RestTemplate();
        var requestFactory = new SimpleClientHttpRequestFactory();
        this.restTemplate.setRequestFactory(requestFactory);
    }

    private UriComponentsBuilder uri() {
        return UriComponentsBuilder.fromUriString(this.serverUrl);
    }

    public List<Patient> findAll() {
        try {
            return restTemplate.exchange(uri().path("/api/patients").build().toUri(), HttpMethod.GET, null, new ParameterizedTypeReference<List<Patient>>() {
            }).getBody();
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }
}
