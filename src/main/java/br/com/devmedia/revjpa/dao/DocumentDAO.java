package br.com.devmedia.revjpa.dao;

import br.com.devmedia.revjpa.entity.Document;

import java.io.Serializable;

public class DocumentDAO extends GenericDAO<Document> {
    public DocumentDAO(){
        super(Document.class);
    }

}
