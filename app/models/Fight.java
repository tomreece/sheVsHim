package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Fight extends Model {
	private static final long serialVersionUID = 3754127206362026825L;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Finder<Long, Fight> find = new Finder(Long.class, Fight.class);

	@Id
	public Long id;
	
	@Required
	public String sideA;
	
	@Required
	public String sideB;

	public static List<Fight> all() {
		return find.all();
	}

	public static void create(Fight fight) {
		fight.save();
	}

	public static void delete(Long id) {
		find.ref(id).delete();
	}
}
