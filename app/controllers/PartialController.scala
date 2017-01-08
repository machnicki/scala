package controllers

import models.Partial
import javax.inject._
import play.api._
import play.api.mvc._

class PartialController @Inject() extends Controller {

  def index = Action {
    Ok(views.html.partials(Partial.all))
  }
}
