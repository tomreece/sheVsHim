package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

	public static Result index() {
		return ok(views.html.index.render("tom roolz"));
	}

	public static Result fight(String id) {
		return ok(views.html.fight.render(id));
	}

}