package com.imie.webapp.repository;

import com.imie.webapp.model.Formation;
import org.springframework.web.client.RestTemplate;

public class FormationProxy extends JpaRepository<Formation, Long>  {

    private final String apiUrl;
    private final RestTemplate restTemplate;

    public FormationProxy(String apiUrl, RestTemplate restTemplate) {
        this.apiUrl = apiUrl;
        this.restTemplate = restTemplate;
    }


    public Iterable<Formation> getAllFormations() {
        return restTemplate.getForObject(apiUrl + "/formations", Iterable.class);
    }

    public Formation getFormation(long id) {
        return restTemplate.getForObject(apiUrl + "/formations/" + id, Formation.class);
    }

    public Formation createFormation(Formation formation) {
        return restTemplate.postForObject(apiUrl + "/formations", formation, Formation.class);
    }

    public void updateFormation(long id, Formation formation) {
        restTemplate.put(apiUrl + "/formations/" + id, formation);
    }

    public void deleteFormation(long id) {
        restTemplate.delete(apiUrl + "/formations/" + id);
    }
}
