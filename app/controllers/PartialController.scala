package controllers

import javax.inject._
import play.api._
import play.api.mvc._

class PartialController @Inject() extends Controller {

  def index = Action {
    Ok(views.html.index("This is response from partials"))
  }
}
