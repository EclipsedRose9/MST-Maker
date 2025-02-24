data class Edge(val from: String, val to: String, val weight: Int)
// defines the edge (distance) between 2 specific cities

///////////////////////////////////////////////////////////////////

class Graph {
    private val edges = mutableListOf<Edge>()
    private val vertices = mutableSetOf<String>()

    fun AddEdge(from: String, to: String, weight: Int) {
        edges.add(Edge(from, to, weight))
        vertices.add(from)
        vertices.add(to)}

    fun GetEdges(): List<Edge> = edges

    fun GetVertices(): Set<String> = vertices }
// saves all edges (distances between cities) for the graph

/////////////////////////////////////////////////////////////////////////
