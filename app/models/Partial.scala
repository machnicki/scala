case class Partial(id: Int, name: String)

object Partial {
  private var partialList: List[Partial] = List()

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
