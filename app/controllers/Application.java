package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render("Your new application is ready. Tom rules. I take it back. Frank is actually an ok guy."));
  }
  
}