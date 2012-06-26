package it.polimi.aip.javisti.service;

import it.polimi.aip.javisti.meta.RisultatiMeta;
import it.polimi.aip.javisti.model.Progetto;
import it.polimi.aip.javisti.model.Risultati;

import java.util.List;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;


public class RisultatiService {
    
    public List<Risultati> getAllRisultati() {
        RisultatiMeta risMeta = new RisultatiMeta();
        return Datastore.query(risMeta).asList();
    
    }
    
    public void addRisultato(String titolo, String idProgetto) {
        
        Risultati risultati = new Risultati();
        
        Key progettoKey = Datastore.createKey(Progetto.class, idProgetto);
        
        Progetto progettoRicavato = Datastore.get(Progetto.class, progettoKey);
        risultati.setTitolo(titolo);
        risultati.setKey(Datastore.createKey(Risultati.class, titolo));
        risultati.getProgettoRef().setModel(progettoRicavato);
        Datastore.put(progettoRicavato,risultati);
    }
}
