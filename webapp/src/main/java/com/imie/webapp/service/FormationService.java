package com.imie.webapp.service;
import com.imie.webapp.model.Formation;
import com.imie.webapp.repository.FormationProxy;
import org.springframework.stereotype.Service;

@Service
public class FormationService {

    private final FormationProxy formationProxy;

    public FormationService(FormationProxy formationProxy) {
        this.formationProxy = formationProxy;
    }

    public Iterable<Formation> getAllFormations() {
        return formationProxy.getAllFormations();
    }

    public Formation getFormation(long id) {
        return formationProxy.getFormation(id);
    }

    public Formation createFormation(Formation formation) {
        return formationProxy.createFormation(formation);
    }

    public void updateFormation(long id, Formation formation) {
        formationProxy.updateFormation(id, formation);
    }

    public void saveFormation(Formation formation) {
        if (formation.getIdFormation() != null) {
            formationProxy.updateFormation(formation.getIdFormation(), formation);
        } else {
            formationProxy.createFormation(formation);
        }
    }
    public void deleteFormation(long id) {
        formationProxy.deleteFormation(id);
    }
}
