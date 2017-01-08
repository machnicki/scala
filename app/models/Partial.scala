package models

case class Partial(id: Int, name: String)

object Partial {
  private var partialList: List[Partial] = List(
    Partial(1, "My first partial"),
    Partial(2, "My second partial"),
    Partial(3, "My third partial")
  )

  def all: List[Partial] = {
    partialList
  }

  def add(name: String) = {
    val newId: Int = partialList.last.id + 1
    partialList = partialList ++ List(Partial(newId, name))
  }

  def delete(id: Int) = {
    partialList = partialList.filterNot(partial => partial.id == id)
  }
}
