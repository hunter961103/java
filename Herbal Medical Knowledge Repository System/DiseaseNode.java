
public class DiseaseNode {
    private Object name , description , relatedh , relatedtm;
    private DiseaseNode link;
    
    public DiseaseNode() {
        name = null;
        description = null;
        relatedh = null;
        relatedtm = null;
    }
    
    public DiseaseNode(Object name , Object description , Object relatedh , Object relatedtm) {
        this.name = name;
        this.description = description;
        this.relatedh = relatedh;
        this.relatedtm = relatedtm;
        link = null;
    }
    
    public DiseaseNode(Object name , Object description , Object relatedh , Object relatedtm , DiseaseNode next) {
        this.name = name;
        this.description = description;
        this.relatedh = relatedh;
        this.relatedtm = relatedtm;
        link = next;
    }
    
    public Object getName() {
        return name;
    }
    
    public void setName(Object name) {
        this.name = name;
    }
    
    public Object getDescription() {
        return description;
    }
    
    public void setDescription(Object description) {
        this.description = description;
    }
    
    public Object getRelatedh() {
        return relatedh;
    }
    
    public void setRelatedh(Object relatedh) {
        this.relatedh = relatedh;
    }
    
    public Object getRelatedtm() {
        return relatedtm;
    }
    
    public void setRelatedtm(Object relatedtm) {
        this.relatedtm = relatedtm;
    }
    
    public DiseaseNode getLink() {
        return link;
    }
    
    public void setLink(DiseaseNode link) {
        this.link = link;
    }
}
