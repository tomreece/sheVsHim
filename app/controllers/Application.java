package controllers;

import models.Fight;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {
	static Form<Fight> fightForm = form(Fight.class);

	public static Result index() {
		return ok(views.html.index.render(Fight.all(), fightForm));
	}
	
	public static Result add() {
		return ok(views.html.add.render(fightForm));
	}

	public static Result newFight() {
		Form<Fight> filledForm = fightForm.bindFromRequest();
		if (filledForm.hasErrors()) {
			return badRequest(views.html.add.render(filledForm));
		} else {
			Fight.create(filledForm.get());
			return redirect(routes.Application.index());
		}
	}

	public static Result deleteFight(Long id) {
		Fight.delete(id);
		return redirect(routes.Application.index());
	}
}