package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Constraint;

import com.avaje.ebean.Model;

@Entity 
public class Cliente extends Model {
	
	
	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    public String nombre;
    

    public String apellido;
    

    public String edad;
    

}
